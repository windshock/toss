package com.iap.ac.android.common.account;

import com.iap.ac.android.common.log.ACLog;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum OAuthService {
    INSTANCE;

    public static final String TAG = "OAuthService";
    public IOAuthService IOAuthService;

    private void noImplementationError() {
        ACLog.e(TAG, "No implementation found! Please setAccountService first.");
    }

    public void authLogin(String str, IOAuthLoginCallback iOAuthLoginCallback) {
        IOAuthService iOAuthService = this.IOAuthService;
        if (iOAuthService != null) {
            iOAuthService.notifyOAuthLogin(str, iOAuthLoginCallback);
        } else {
            noImplementationError();
        }
    }

    public void authLogout() {
        IOAuthService iOAuthService = this.IOAuthService;
        if (iOAuthService != null) {
            iOAuthService.notifyOAuthLogout();
        } else {
            noImplementationError();
        }
    }

    public boolean isAuthorized() {
        IOAuthService iOAuthService = this.IOAuthService;
        if (iOAuthService != null) {
            return iOAuthService.isAuthorized();
        }
        noImplementationError();
        return false;
    }

    public void registerOAuthEventObserver(OAuthObserver oAuthObserver) {
        IOAuthService iOAuthService = this.IOAuthService;
        if (iOAuthService != null) {
            iOAuthService.registerOAuthEventObserver(oAuthObserver);
        } else {
            noImplementationError();
        }
    }

    public void setOAuthService(IOAuthService iOAuthService) {
        this.IOAuthService = iOAuthService;
    }

    public void unregisterAllOAuthEventObservers() {
        IOAuthService iOAuthService = this.IOAuthService;
        if (iOAuthService != null) {
            iOAuthService.unregisterAllOAuthEventObservers();
        } else {
            noImplementationError();
        }
    }

    public void unregisterOAuthEventObserver(OAuthObserver oAuthObserver) {
        IOAuthService iOAuthService = this.IOAuthService;
        if (iOAuthService != null) {
            iOAuthService.unregisterOAuthEventObserver(oAuthObserver);
        } else {
            noImplementationError();
        }
    }
}
