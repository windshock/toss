package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Handler;
import android.os.Looper;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzg extends Handler {
    private static zzf zza;
    private final Looper zzb;

    public zzg() {
        this.zzb = Looper.getMainLooper();
    }

    public zzg(Looper looper) {
        super(looper);
        this.zzb = Looper.getMainLooper();
    }
}
