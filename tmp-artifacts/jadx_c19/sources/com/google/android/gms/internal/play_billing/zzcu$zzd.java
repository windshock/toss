package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzcu$zzd {
    static final zzcu$zzd zza = new zzcu$zzd();
    zzcu$zzd next;
    final Runnable zzb;
    final Executor zzc;

    zzcu$zzd() {
        this.zzb = null;
        this.zzc = null;
    }

    zzcu$zzd(Runnable runnable, Executor executor) {
        this.zzb = runnable;
        this.zzc = executor;
    }
}
