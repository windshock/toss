package com.iap.ac.android.biz.common.internal.oauth;

import android.text.TextUtils;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.internal.foundation.FoundationProxy;
import com.iap.ac.android.biz.common.storage.ACStorageProvider;
import com.iap.ac.android.biz.common.utils.cookie.CookieUtils;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class OAuthUtil {
    private static final String KEY_CLIENTKEY_INTERVAL = "KEY_CLIENTKEY_INTERVAL";
    private static final String KEY_CLIENTKEY_UPDATED_TIME = "key_clientkey_updated_time";
    private static final String KEY_SESSIONID_UPDATED_TIME = "key_sessionid_updated_time";
    private static final String StorageOauth = "StorageOauth";
    private static volatile OAuthUtil mInstance;
    public long clientKeyUpdatedTimeStamp;
    public long sessionIdUpdatedTimeStamp;
    private long DEFAULT_CLIENTKEY_EXPIREDTIME = 1296000;
    private long DEFAULT_SESSION_EXPIREDTIME = 1800;
    public long sessionIdExpiredTimeInterval = 1800;
    public long clientKeyExpiredTimeInterval = 1296000;

    public static OAuthUtil getInstance() {
        if (mInstance == null) {
            synchronized (OAuthUtil.class) {
                if (mInstance == null) {
                    mInstance = new OAuthUtil();
                }
            }
        }
        return mInstance;
    }

    public long getClientKeyExpiredTimeInterval() {
        String strFetch = new ACStorageProvider(ACManager.getInstance().getContext(), StorageOauth).fetch(KEY_CLIENTKEY_INTERVAL);
        return TextUtils.isEmpty(strFetch) ? this.DEFAULT_CLIENTKEY_EXPIREDTIME : Long.parseLong(strFetch);
    }

    public long getClientKeyUpdatedTimeStamp() {
        String strFetch = new ACStorageProvider(ACManager.getInstance().getContext(), StorageOauth).fetch(KEY_CLIENTKEY_UPDATED_TIME);
        if (TextUtils.isEmpty(strFetch)) {
            return 0L;
        }
        return Long.parseLong(strFetch);
    }

    public int getOAuthChainType() {
        return !ConfigCenter.INSTANCE.isOAuthOptimizedEnable() ? OauthChainType.STATUS_UNKNOW.ordinal() : TextUtils.isEmpty(CookieUtils.getCookie(FoundationProxy.getInstance("ac_biz").getGateWayUrl(), "ALIPAYINTLACJSESSIONID")) ? OauthChainType.STATUS_COOKIE_IS_NULL.ordinal() : (getSessionIdUpdatedTimeStamp() <= 0 || getClientKeyUpdatedTimeStamp() <= 0) ? OauthChainType.STATUS_UPDATETIME_INVALID.ordinal() : isAvailable(getSessionIdUpdatedTimeStamp(), this.sessionIdExpiredTimeInterval * 1000) ? OauthChainType.STATUS_COOKIE_NOT_EXPIRED.ordinal() : (isAvailable(getSessionIdUpdatedTimeStamp(), this.sessionIdExpiredTimeInterval * 1000) || !isAvailable(getClientKeyUpdatedTimeStamp(), getClientKeyExpiredTimeInterval() * 1000)) ? (isAvailable(getSessionIdUpdatedTimeStamp(), this.sessionIdExpiredTimeInterval * 1000) || isAvailable(getClientKeyUpdatedTimeStamp(), getClientKeyExpiredTimeInterval() * 1000)) ? OauthChainType.STATUS_UNKNOW.ordinal() : OauthChainType.STATUS_CLIENTKEY_EXPIRED.ordinal() : OauthChainType.STATUS_ONLY_COOKIE_EXPIRED.ordinal();
    }

    public long getSessionIdUpdatedTimeStamp() {
        String strFetch = new ACStorageProvider(ACManager.getInstance().getContext(), StorageOauth).fetch(KEY_SESSIONID_UPDATED_TIME);
        if (TextUtils.isEmpty(strFetch)) {
            return 0L;
        }
        return Long.parseLong(strFetch);
    }

    public boolean hasSessionId(String str, String str2) {
        if (TextUtils.isEmpty(CookieUtils.getCookie(str, str2))) {
            return false;
        }
        if (ConfigCenter.INSTANCE.isOAuthOptimizedEnable()) {
            return isAvailable(getSessionIdUpdatedTimeStamp(), this.DEFAULT_SESSION_EXPIREDTIME * 1000);
        }
        return true;
    }

    public boolean isAvailable(long j, long j2) {
        return j <= 0 || j2 <= 0 || System.currentTimeMillis() - j < j2;
    }

    public boolean loginPreCheck(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (ConfigCenter.INSTANCE.isOAuthOptimizedEnable()) {
            return isAvailable(getClientKeyUpdatedTimeStamp(), getClientKeyExpiredTimeInterval() * 1000);
        }
        return true;
    }

    public void updateClientKeyTime(String str) throws NumberFormatException {
        if (ConfigCenter.INSTANCE.isOAuthOptimizedEnable()) {
            ACStorageProvider aCStorageProvider = new ACStorageProvider(ACManager.getInstance().getContext(), StorageOauth);
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.clientKeyUpdatedTimeStamp = jCurrentTimeMillis;
            aCStorageProvider.save(KEY_CLIENTKEY_UPDATED_TIME, String.valueOf(jCurrentTimeMillis));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                long j = Long.parseLong(str);
                if (j <= 0) {
                    return;
                }
                this.clientKeyExpiredTimeInterval = j;
                aCStorageProvider.save(KEY_CLIENTKEY_INTERVAL, String.valueOf(j));
            } catch (Exception unused) {
            }
        }
    }

    public void updateSessionTime() {
        if (ConfigCenter.INSTANCE.isOAuthOptimizedEnable()) {
            ACStorageProvider aCStorageProvider = new ACStorageProvider(ACManager.getInstance().getContext(), StorageOauth);
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.sessionIdUpdatedTimeStamp = jCurrentTimeMillis;
            aCStorageProvider.save(KEY_SESSIONID_UPDATED_TIME, String.valueOf(jCurrentTimeMillis));
        }
    }
}
