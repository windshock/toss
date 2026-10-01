package com.iap.ac.android.common.account;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface IOAuthService {
    boolean isAuthorized();

    void notifyOAuthLogin(String str, IOAuthLoginCallback iOAuthLoginCallback);

    void notifyOAuthLogout();

    void registerOAuthEventObserver(OAuthObserver oAuthObserver);

    void unregisterAllOAuthEventObservers();

    void unregisterOAuthEventObserver(OAuthObserver oAuthObserver);
}
