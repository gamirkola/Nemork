/* =============================================================================
 *                      GENERATED FILE - DO NOT MODIFY
 * =============================================================================
 * Copyright (c) 2016 Microsoft. All rights reserved.
 * 
 */
package com.skype;
import android.support.v4.util.SparseArrayCompat;
import java.util.Set;
import java.util.HashSet;
import java.lang.ref.ReferenceQueue;
import com.skype.NativeStringConvert;

import com.skype.Account;

public class AccountImpl extends ObjectInterfaceImpl implements Account, ObjectInterface, NativeListenable {
	public AccountImpl() {
		this(SkypeFactory.getInstance() );
	}

	public AccountImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createAccount());
		factory.initializeListener(this);
	}

	static class AccountWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		AccountWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyAccount(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new AccountWeakRef(factory, this, queue, m_nativeObject);
	}

	@Override
	public STATUS getStatusProp() {
		return STATUS.fromInt(getIntProperty(PROPKEY.ACCOUNT_STATUS));
	}

	@Override
	public LOGOUTREASON getLogoutReasonProp() {
		return LOGOUTREASON.fromInt(getIntProperty(PROPKEY.ACCOUNT_LOGOUTREASON));
	}

	@Override
	public String getSuggestedSkypenameProp() {
		return getStrProperty(PROPKEY.ACCOUNT_SUGGESTED_SKYPENAME);
	}

	@Override
	public String getSkypeoutBalanceCurrencyProp() {
		return getStrProperty(PROPKEY.ACCOUNT_SKYPEOUT_BALANCE_CURRENCY);
	}

	@Override
	public int getSkypeoutBalanceProp() {
		return getIntProperty(PROPKEY.ACCOUNT_SKYPEOUT_BALANCE);
	}

	@Override
	public int getSkypeoutPrecisionProp() {
		return getIntProperty(PROPKEY.ACCOUNT_SKYPEOUT_PRECISION);
	}

	@Override
	public String getSkypeinNumbersProp() {
		return getStrProperty(PROPKEY.ACCOUNT_SKYPEIN_NUMBERS);
	}

	@Override
	public String getSubscriptionsProp() {
		return getStrProperty(PROPKEY.ACCOUNT_SUBSCRIPTIONS);
	}

	@Override
	public String getOfflineCallforwardProp() {
		return getStrProperty(PROPKEY.ACCOUNT_OFFLINE_CALLFORWARD);
	}

	@Override
	public String getPartnerOptedoutProp() {
		return getStrProperty(PROPKEY.ACCOUNT_PARTNER_OPTEDOUT);
	}

	@Override
	public String getServiceProviderInfoProp() {
		return getStrProperty(PROPKEY.ACCOUNT_SERVICE_PROVIDER_INFO);
	}

	@Override
	public int getRegistrationTimestampProp() {
		return getIntProperty(PROPKEY.ACCOUNT_REGISTRATION_TIMESTAMP);
	}

	@Override
	public int getNrOfOtherInstancesProp() {
		return getIntProperty(PROPKEY.ACCOUNT_NR_OF_OTHER_INSTANCES);
	}

	@Override
	public String getPartnerChannelStatusProp() {
		return getStrProperty(PROPKEY.ACCOUNT_PARTNER_CHANNEL_STATUS);
	}

	@Override
	public int getFlamingoXmppStatusProp() {
		return getIntProperty(PROPKEY.ACCOUNT_FLAMINGO_XMPP_STATUS);
	}

	@Override
	public int getFederatedPresencePolicyProp() {
		return getIntProperty(PROPKEY.ACCOUNT_FEDERATED_PRESENCE_POLICY);
	}

	@Override
	public String getLiveidMembernameProp() {
		return getStrProperty(PROPKEY.ACCOUNT_LIVEID_MEMBERNAME);
	}

	@Override
	public boolean getRoamingHistoryEnabledProp() {
		return getIntProperty(PROPKEY.ACCOUNT_ROAMING_HISTORY_ENABLED) != 0;
	}

	@Override
	public int getCobrandIdProp() {
		return getIntProperty(PROPKEY.ACCOUNT_COBRAND_ID);
	}

	@Override
	public String getSigninNameProp() {
		return getStrProperty(PROPKEY.ACCOUNT_SIGNIN_NAME);
	}

	@Override
	public String getHiddenExpressionTabsProp() {
		return getStrProperty(PROPKEY.ACCOUNT_HIDDEN_EXPRESSION_TABS);
	}

	@Override
	public int getForwardStarttimeProp() {
		return getIntProperty(PROPKEY.ACCOUNT_FORWARD_STARTTIME);
	}

	private String skypeName = "";
	@Override
	public String getSkypenameProp() {
		if (skypeName == null || skypeName.equals("")) {
			skypeName = getStrProperty(PROPKEY.ACCOUNT_SKYPENAME);
		}

		return skypeName;
	}

	@Override
	public int getUserSetAvailabilityProp() {
		return getIntProperty(PROPKEY.ACCOUNT_USER_SET_AVAILABILITY);
	}

	@Override
	public String getOptionUiColorProp() {
		return getStrProperty(PROPKEY.ACCOUNT_OPTION_UI_COLOR);
	}

	public native void initializeListener();
	
	private final Set<AccountIListener> m_listeners = new HashSet<AccountIListener>();

	@Override
	public void addListener(AccountIListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	@Override
	public void removeListener(AccountIListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	public void onSkypeTokenRequired(byte[] invalidToken) {
		synchronized (m_listeners) {
			for (AccountIListener listener : m_listeners) {
				listener.onSkypeTokenRequired(this, NativeStringConvert.ConvertFromNativeBytes(invalidToken));
			}
		}
	}

	@Override
	public native int getObjectId();

	@Override
	public native GetStatusWithProgress_Result getStatusWithProgress();

	@Override
	public Account.LOGINREQUESTRESULT loginWithSkypeToken(String skypeToken, int expirationTime, String displayName) {
		return loginWithSkypeToken(NativeStringConvert.ConvertToNativeBytes(skypeToken), expirationTime, NativeStringConvert.ConvertToNativeBytes(displayName));
	}

	private native Account.LOGINREQUESTRESULT loginWithSkypeToken(byte[] skypeToken, int expirationTime, byte[] displayName);
	@Override
	public Account.LOGINREQUESTRESULT loginWithSkypeToken(String skypeToken) {
		return loginWithSkypeToken(skypeToken, 0, "");
	}
	@Override
	public Account.LOGINREQUESTRESULT loginWithSkypeToken(String skypeToken, int expirationTime) {
		return loginWithSkypeToken(skypeToken, expirationTime, "");
	}
	@Override
	public Account.LOGINREQUESTRESULT login(String skypeToken, String displayName, String configuration) {
		return login(NativeStringConvert.ConvertToNativeBytes(skypeToken), NativeStringConvert.ConvertToNativeBytes(displayName), NativeStringConvert.ConvertToNativeBytes(configuration));
	}

	private native Account.LOGINREQUESTRESULT login(byte[] skypeToken, byte[] displayName, byte[] configuration);
	@Override
	public Account.LOGINREQUESTRESULT login(String skypeToken) {
		return login(skypeToken, "", "");
	}
	@Override
	public Account.LOGINREQUESTRESULT login(String skypeToken, String displayName) {
		return login(skypeToken, displayName, "");
	}
	@Override
	public native void logout(boolean clearSavedPwd);

	@Override
	public void logout() {
		logout(false);
	}
	@Override
	public boolean setAdditionalIdentities(String identities) {
		return setAdditionalIdentities(NativeStringConvert.ConvertToNativeBytes(identities));
	}

	private native boolean setAdditionalIdentities(byte[] identities);
	@Override
	public boolean setConfiguration(String configuration) {
		return setConfiguration(NativeStringConvert.ConvertToNativeBytes(configuration));
	}

	private native boolean setConfiguration(byte[] configuration);
	@Override
	public boolean setRing(String ring) {
		return setRing(NativeStringConvert.ConvertToNativeBytes(ring));
	}

	private native boolean setRing(byte[] ring);
	@Override
	public boolean setTenantId(String tenantId) {
		return setTenantId(NativeStringConvert.ConvertToNativeBytes(tenantId));
	}

	private native boolean setTenantId(byte[] tenantId);
	@Override
	public void setUIVersion(String uiVersionString) {
		setUIVersion(NativeStringConvert.ConvertToNativeBytes(uiVersionString));
	}

	private native void setUIVersion(byte[] uiVersionString);
	@Override
	public boolean updateDisplayName(String displayName) {
		return updateDisplayName(NativeStringConvert.ConvertToNativeBytes(displayName));
	}

	private native boolean updateDisplayName(byte[] displayName);
	@Override
	public void updateSkypeToken(String skypeToken, int expirationTime) {
		updateSkypeToken(NativeStringConvert.ConvertToNativeBytes(skypeToken), expirationTime);
	}

	private native void updateSkypeToken(byte[] skypeToken, int expirationTime);
	@Override
	public void updateSkypeToken(String skypeToken) {
		updateSkypeToken(skypeToken, 0);
	}
}

