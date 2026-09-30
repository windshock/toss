package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeoutException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzdn extends TimeoutException {
    /* synthetic */ zzdn(String str, zzdo zzdoVar) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        synchronized (this) {
            setStackTrace(new StackTraceElement[0]);
        }
        return this;
    }
}
