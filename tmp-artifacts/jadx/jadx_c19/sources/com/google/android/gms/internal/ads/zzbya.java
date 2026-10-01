package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzbya implements MediationAdLoadCallback {
    final /* synthetic */ zzbxk zza;
    final /* synthetic */ zzbwa zzb;
    final /* synthetic */ zzbyg zzc;

    zzbya(zzbyg zzbygVar, zzbxk zzbxkVar, zzbwa zzbwaVar) {
        this.zza = zzbxkVar;
        this.zzb = zzbwaVar;
        Objects.requireNonNull(zzbygVar);
        this.zzc = zzbygVar;
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
        MediationInterstitialAd mediationInterstitialAd = (MediationInterstitialAd) obj;
        if (mediationInterstitialAd != null) {
            try {
                this.zzc.zzb(mediationInterstitialAd);
                this.zza.zze();
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
