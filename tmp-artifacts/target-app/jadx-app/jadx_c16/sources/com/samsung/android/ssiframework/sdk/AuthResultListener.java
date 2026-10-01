package com.samsung.android.ssiframework.sdk;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface AuthResultListener {
    void onError(int i, @Nullable String str);

    void onFail(int i, @Nullable String str);

    void onHelp(int i, @Nullable String str);

    void onSuccess();
}
