package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzbwo implements InitializationCompleteCallback {
    final /* synthetic */ zzbsl zza;

    zzbwo(zzbwv zzbwvVar, zzbsl zzbslVar) {
        this.zza = zzbslVar;
        Objects.requireNonNull(zzbwvVar);
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zze();
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }
}
