package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzbye implements SignalCallbacks {
    final /* synthetic */ zzbxw zza;

    zzbye(zzbyg zzbygVar, zzbxw zzbxwVar) {
        this.zza = zzbxwVar;
        Objects.requireNonNull(zzbygVar);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }
}
