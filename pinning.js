
Java.perform(function () {
    console.log('')
    console.log('===')
    console.log('* Injecting hooks into common certificate pinning methods *')
    console.log('===')

    var X509TrustManager = Java.use('javax.net.ssl.X509TrustManager');

    console.log("");
    console.log("[.] Cert Pinning Bypass");

    var CertificateFactory = Java.use("java.security.cert.CertificateFactory");
    var FileInputStream = Java.use("java.io.FileInputStream");
    var X509Certificate = Java.use("java.security.cert.X509Certificate");
    var KeyStore = Java.use("java.security.KeyStore");
    var TrustManagerFactory = Java.use("javax.net.ssl.TrustManagerFactory");
    var SSLContext = Java.use("javax.net.ssl.SSLContext");
    var String = Java.use("java.lang.String");
    var ByteArrayInputStream = Java.use("java.io.ByteArrayInputStream");

    // Load CAs from an InputStream
    console.log("[+] Genrating custom CA from mitmproxy cert.")
    var cf = CertificateFactory.getInstance("X.509");

    //place for the crt

	var cert = String.$new("-----BEGIN CERTIFICATE-----\n" + "MIIDoTCCAomgAwIBAgIGDkwYFM5sMA0GCSqGSIb3DQEBCwUAMCgxEjAQBgNVBAMM\n" + "CW1pdG1wcm94eTESMBAGA1UECgwJbWl0bXByb3h5MB4XDTE5MTAyMzEwMTM1MloX\n" + "DTIyMTAyNDEwMTM1MlowKDESMBAGA1UEAwwJbWl0bXByb3h5MRIwEAYDVQQKDAlt\n" + "aXRtcHJveHkwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCZnyT8/O91\n" + "WdDhESr/FoyhmlJ5q1UzV0scx+HKwkxbKDr3e5DHNugRZk9wrrSd8VJ2D2fOlRAK\n" + "okstX/uInYLFC/fwCbkB+HauMfZaFfuA1TSEdujdjxhUbIQQQWVxTDSZ4JxYOepG\n" + "wURL39sQKITmUxTvnEGl6kMV5kcHuN3g3hS1gjXCe9149GLe43SAU2WRWTXQerqo\n" + "uTbAtHdqTiaOq0N9HAOoAP1z/6OOBM8EJfWAM/L+xn9KpQE+NZ/N6HpiiKaKp59W\n" + "nCDV3L5i07ZNJiBa3jLObkI1iBcSJf0drNtjne+/KzGPyo3ff3dh15laaMpq4/p5\n" + "pyV87TqaablJAgMBAAGjgdAwgc0wDwYDVR0TAQH/BAUwAwEB/zARBglghkgBhvhC\n" + "AQEEBAMCAgQweAYDVR0lBHEwbwYIKwYBBQUHAwEGCCsGAQUFBwMCBggrBgEFBQcD\n" + "BAYIKwYBBQUHAwgGCisGAQQBgjcCARUGCisGAQQBgjcCARYGCisGAQQBgjcKAwEG\n" + "CisGAQQBgjcKAwMGCisGAQQBgjcKAwQGCWCGSAGG+EIEATAOBgNVHQ8BAf8EBAMC\n" + "AQYwHQYDVR0OBBYEFKDvKuheLu6AF8jAgiV7s65k3rI9MA0GCSqGSIb3DQEBCwUA\n" + "A4IBAQCH2QyxZlNdsv34QpXeEYfVgn1tH8qdxxwNGpiA5XOVz56OZ9paW03mj/Qw\n" + "PYcoAgEpAAkBoIA1Li2HEWdS0uZql+EKM+bv2dElYFuencFJig1CbnS2tljVpZc7\n" + "G3IBGNJAC2VjicYBHYUuVkS25kRvIetVhLkBMe6fC2VM7VgNj5AvMzDtxhk0BMk8\n" + "saNyAfsttCFpbieBvtvJVnX8aDGgQv+pxIfckDNmO07ySXTUiZIjQUM6gksyL8oT\n" + "GZQ9GYgr4avZefDRcpjM0MFdRwNVSD2zXJWFC94tUu/4tIz7zxDc/AaYXOERhYmG\n" + "DoH9kbd8tLnoTRFuL3VqCwvWG0xG\n" + "-----END CERTIFICATE-----");

	var byteArrayInputStream = ByteArrayInputStream.$new(cert.getBytes());
	var ca = cf.generateCertificate(byteArrayInputStream);
	byteArrayInputStream.close();

    var certInfo = Java.cast(ca, X509Certificate);
    console.log("[o] Info about our CA : " + certInfo.getSubjectDN());

    // Create a KeyStore containing our trusted CAs
    console.log("[+] Creating a KeyStore for our CA...");
    var keyStoreType = KeyStore.getDefaultType();
    var keyStore = KeyStore.getInstance(keyStoreType);
    keyStore.load(null, null);
    keyStore.setCertificateEntry("ca", ca);

    // Create a TrustManager that trusts the CAs in our KeyStore
    console.log("[+] Creating a TrustManager that trusts the CA in our KeyStore...");
    var tmfAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
    var tmf = TrustManagerFactory.getInstance(tmfAlgorithm);
    tmf.init(keyStore);
    console.log("[+] Our TrustManager is ready...");

    console.log("[+] Hijacking SSLContext methods now...");
    console.log("[-] Waiting for the app to invoke SSLContext.init()...");


    var TrustManager = tmf;
    var TrustManagers = TrustManager.getTrustManagers();
    //pass our own custom trust manager through when requested
    var SSLContext_init = SSLContext.init.overload(
        '[Ljavax.net.ssl.KeyManager;', '[Ljavax.net.ssl.TrustManager;', 'java.security.SecureRandom'
    );
    SSLContext_init.implementation = function (keyManager, trustManager, secureRandom) {
        console.log('! Intercepted trustmanager request');
        SSLContext_init.call(this, keyManager, TrustManagers, secureRandom);
    };

    // okhttp3
    try {
        var CertificatePinner = Java.use('okhttp3.CertificatePinner');
        CertificatePinner.check.overload('java.lang.String', 'java.util.List').implementation = function (str) {
            console.log('! Intercepted okhttp3: ' + str);
            return;
        };

        console.log('* Setup okhttp3 pinning')
    } catch(err) {
        console.log('* Unable to hook into okhttp3 pinner')
    }

    // trustkit
    try {
        var Activity = Java.use("com.datatheorem.android.trustkit.pinning.OkHostnameVerifier");
        Activity.verify.overload('java.lang.String', 'javax.net.ssl.SSLSession').implementation = function (str) {
            console.log('! Intercepted trustkit{1}: ' + str);
            return true;
        };

        Activity.verify.overload('java.lang.String', 'java.security.cert.X509Certificate').implementation = function (str) {
            console.log('! Intercepted trustkit{2}: ' + str);
            return true;
        };

        console.log('* Setup trustkit pinning')
    } catch(err) {
        console.log('* Unable to hook into trustkit pinner')
    }

    // TrustManagerImpl
    try {
        var TrustManagerImpl = Java.use('com.android.org.conscrypt.TrustManagerImpl');
        TrustManagerImpl.verifyChain.implementation = function (untrustedChain, trustAnchorChain, host, clientAuth, ocspData, tlsSctData) {
            console.log('! Intercepted TrustManagerImp: ' + host);
            return untrustedChain;
        }

        console.log('* Setup TrustManagerImpl pinning')
    } catch (err) {
        console.log('* Unable to hook into TrustManagerImpl')
    }

    // Appcelerator
    try {
        var PinningTrustManager = Java.use('appcelerator.https.PinningTrustManager');
        PinningTrustManager.checkServerTrusted.implementation = function () {
            console.log('! Intercepted Appcelerator');
        }

        console.log('* Setup Appcelerator pinning')
    } catch (err) {
        console.log('* Unable to hook into Appcelerator pinning')
    }
});
