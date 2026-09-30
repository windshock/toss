package com.tnkfactory.ad;

import android.content.Context;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ServiceCallback {
    public void onError(Context context, Throwable th) {
        Logger.e(th.getMessage() == null ? th.toString() : th.getMessage());
    }

    public abstract void onReturn(Context context, Object obj);
}
