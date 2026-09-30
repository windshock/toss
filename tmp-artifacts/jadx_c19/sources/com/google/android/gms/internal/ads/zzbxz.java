package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzbxz implements MediationAdLoadCallback {
    final /* synthetic */ zzbxh zza;
    final /* synthetic */ zzbwa zzb;

    zzbxz(zzbyg zzbygVar, zzbxh zzbxhVar, zzbwa zzbwaVar) {
        this.zza = zzbxhVar;
        this.zzb = zzbwaVar;
        Objects.requireNonNull(zzbygVar);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* synthetic */ Object onSuccess(Object obj) {
        MediationInterscrollerAd mediationInterscrollerAd = (MediationInterscrollerAd) obj;
        if (mediationInterscrollerAd != null) {
            try {
                this.zza.zzh(new zzbww(mediationInterscrollerAd));
            } catch (RemoteException e) {
                zzo.zzg("", e);
            }
            return new zzbyh(this.zzb);
        }
        zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
            return null;
        }
    }
}
