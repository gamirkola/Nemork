package com.skype;

import java.nio.charset.Charset;
import android.util.Log;

public class NativeStringConvert {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final String LOG_TAG = "SkypeJNI";
    public static byte[] ConvertToNativeBytes(String arg) {
        byte[] cString = null;
        if (arg == null) {
            throw new NullPointerException("ConvertToNativeBytes received null argument");
        }
        arg = arg + '\0';
        cString = arg.getBytes(UTF_8);

        if (cString == null) {
            cString = new byte[1];
            cString[0] = 0; //Empty string, sending null to JNI is bad
        }
        return cString;
    }

    public static byte[][] ConvertArrToNativeByteArr(String[] arg) {
        if (arg == null) {
            throw new NullPointerException("ConvertArrToNativeByteArr received null argument");
        }
        byte[][] cStringArr = new byte[arg.length][];
        for (int idx = 0; idx < arg.length; idx++) {
            cStringArr[idx] = ConvertToNativeBytes(arg[idx]);
        }
        return cStringArr;
    }

    public static String ConvertFromNativeBytes(byte[] arg) {
        //The JNI will return empty strings as length 1 strings with simply a '\0' char
        //Relying on this slightly couples the JNI to this implementation, but
        //this is safer and only this module must know about this
        //implementation detail of the JNI.  If the string is empty, no need to
        //convert, just return an empty string.  the JNI will never return a zero 
        //lenght string
        if (arg[0] != '\0') {
            return new String(arg, UTF_8);
        }
        return "";
    }

    public static String[] ConvertFromNativeStringArray(byte[][] arg ) {
        String[] retArr = new String[arg.length];

        for (int idx = 0; idx < arg.length; idx++) {
            retArr[idx] = ConvertFromNativeBytes(arg[idx]);
        }

        return retArr;
    }
};
