package com.android.billingclient.api;

import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AccountIdentifiers {
    private final String IAuthTabCallback;
    private final String onExtraCallbackWithResult;

    AccountIdentifiers(@Nullable String str, @Nullable String str2) {
        this.IAuthTabCallback = str;
        this.onExtraCallbackWithResult = str2;
    }

    public String getObfuscatedAccountId() {
        return this.IAuthTabCallback;
    }

    public String getObfuscatedProfileId() {
        return this.onExtraCallbackWithResult;
    }
}
