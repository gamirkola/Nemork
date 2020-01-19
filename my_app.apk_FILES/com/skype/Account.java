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

public interface Account extends ObjectInterface {
	public enum STATUS {
		LOGGED_OUT(1),
		LOGGING_IN(5),
		LOGGED_IN(7),
		LOGGING_OUT(8),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		STATUS(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<STATUS> intToTypeMap = new SparseArrayCompat< STATUS>();
		
		static {
			for (STATUS type : STATUS.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static STATUS fromInt(int i) {
			STATUS tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : STATUS.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum LOGOUTREASON {
		LOGOUT_CALLED(1),
		HTTPS_PROXY_AUTH_FAILED(2),
		SOCKS_PROXY_AUTH_FAILED(3),
		P2P_CONNECT_FAILED(4),
		SERVER_CONNECT_FAILED(5),
		SERVER_OVERLOADED(6),
		DB_IN_USE(7),
		INVALID_SKYPENAME(8),
		INVALID_EMAIL(9),
		UNACCEPTABLE_PASSWORD(10),
		SKYPENAME_TAKEN(11),
		REJECTED_AS_UNDERAGE(12),
		NO_SUCH_IDENTITY(13),
		INCORRECT_PASSWORD(14),
		TOO_MANY_LOGIN_ATTEMPTS(15),
		PASSWORD_HAS_CHANGED(16),
		PERIODIC_UIC_UPDATE_FAILED(17),
		DB_DISK_FULL(18),
		DB_IO_ERROR(19),
		DB_CORRUPT(20),
		DB_FAILURE(21),
		INVALID_APP_ID(22),
		APP_ID_FAILURE(23),
		UNSUPPORTED_VERSION(24),
		ATO_BLOCKED(25),
		REMOTE_LOGOUT(26),
		ACCESS_TOKEN_RENEWAL_FAILED(27),
		DB_CANTOPEN(28),
		DB_ACCESS_DENIED(29),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		LOGOUTREASON(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<LOGOUTREASON> intToTypeMap = new SparseArrayCompat< LOGOUTREASON>();
		
		static {
			for (LOGOUTREASON type : LOGOUTREASON.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static LOGOUTREASON fromInt(int i) {
			LOGOUTREASON tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : LOGOUTREASON.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public enum LOGINREQUESTRESULT {
		LOGIN_REQUEST_REJECTED(0),
		LOGIN_REQUEST_ACCEPTED(1),
		LOGIN_REQUEST_IGNORED(2),
		WRAPPER_UNKNOWN_VALUE(Integer.MAX_VALUE);
		
		private final int value;
		
		LOGINREQUESTRESULT(int value) {
			this.value = value;
		}

		public int toInt() {
			return value;
		}

		private static final SparseArrayCompat<LOGINREQUESTRESULT> intToTypeMap = new SparseArrayCompat< LOGINREQUESTRESULT>();
		
		static {
			for (LOGINREQUESTRESULT type : LOGINREQUESTRESULT.values()) {
				intToTypeMap.put(type.value, type);
			}
		}

		public static LOGINREQUESTRESULT fromInt(int i) {
			LOGINREQUESTRESULT tmpVar = intToTypeMap.get(i);
			return (tmpVar != null) ? tmpVar : LOGINREQUESTRESULT.WRAPPER_UNKNOWN_VALUE;
		}
	}

	public STATUS getStatusProp();

	public LOGOUTREASON getLogoutReasonProp();

	public String getSuggestedSkypenameProp();

	public String getSkypeoutBalanceCurrencyProp();

	public int getSkypeoutBalanceProp();

	public int getSkypeoutPrecisionProp();

	public String getSkypeinNumbersProp();

	public String getSubscriptionsProp();

	public String getOfflineCallforwardProp();

	public String getPartnerOptedoutProp();

	public String getServiceProviderInfoProp();

	public int getRegistrationTimestampProp();

	public int getNrOfOtherInstancesProp();

	public String getPartnerChannelStatusProp();

	public int getFlamingoXmppStatusProp();

	public int getFederatedPresencePolicyProp();

	public String getLiveidMembernameProp();

	public boolean getRoamingHistoryEnabledProp();

	public int getCobrandIdProp();

	public String getSigninNameProp();

	public String getHiddenExpressionTabsProp();

	public int getForwardStarttimeProp();

	public String getSkypenameProp();

	public int getUserSetAvailabilityProp();

	public String getOptionUiColorProp();

	public interface AccountIListener {
		void onSkypeTokenRequired(Account sender, String invalidToken);
	}

	public void addListener(AccountIListener listener);

	public void removeListener(AccountIListener listener);

	
	public int getObjectId();

	public class GetStatusWithProgress_Result {
		public Account.STATUS m_return;
		public int m_progress;
		public void init(int progress, Account.STATUS funcRet) {
			m_progress = progress;
			m_return = funcRet;
		}

	}

	public GetStatusWithProgress_Result getStatusWithProgress();

	public Account.LOGINREQUESTRESULT loginWithSkypeToken(String skypeToken, int expirationTime, String displayName);

	public Account.LOGINREQUESTRESULT loginWithSkypeToken(String skypeToken);

	public Account.LOGINREQUESTRESULT loginWithSkypeToken(String skypeToken, int expirationTime);

	public Account.LOGINREQUESTRESULT login(String skypeToken, String displayName, String configuration);

	public Account.LOGINREQUESTRESULT login(String skypeToken);

	public Account.LOGINREQUESTRESULT login(String skypeToken, String displayName);

	public void logout(boolean clearSavedPwd);

	public void logout();

	public boolean setAdditionalIdentities(String identities);

	public boolean setConfiguration(String configuration);

	public boolean setRing(String ring);

	public boolean setTenantId(String tenantId);

	public void setUIVersion(String uiVersionString);

	public boolean updateDisplayName(String displayName);

	public void updateSkypeToken(String skypeToken, int expirationTime);

	public void updateSkypeToken(String skypeToken);

}

