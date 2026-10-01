package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzca implements BackgroundDetector.BackgroundStateChangeListener {
    private final /* synthetic */ zzcb zza;

    zzca(zzcb zzcbVar) {
        this.zza = zzcbVar;
    }

    public final void onBackgroundStateChanged(boolean z) {
        if (z) {
            this.zza.zzc = true;
            this.zza.zza();
        } else {
            this.zza.zzc = false;
            if (this.zza.zzb()) {
                this.zza.zzb.zzc();
            }
        }
    }
}
