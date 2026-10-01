package com.iap.ac.android.common.container.callback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface Callback<T> {
    void onResultFailed(int i, String str);

    void onResultSuccess(T t);
}
