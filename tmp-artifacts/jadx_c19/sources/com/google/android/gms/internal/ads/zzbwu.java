package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzbwu implements MediationAdLoadCallback {
    final /* synthetic */ zzbwa zza;
    final /* synthetic */ zzbwv zzb;

    zzbwu(zzbwv zzbwvVar, zzbwa zzbwaVar) {
        this.zza = zzbwaVar;
        Objects.requireNonNull(zzbwvVar);
        this.zzb = zzbwvVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.zzb.zza().getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            int length = String.valueOf(canonicalName).length();
            int length2 = String.valueOf(code).length();
            StringBuilder sb = new StringBuilder(length + 41 + length2 + 17 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(code);
            sb.append(". ErrorMessage = ");
            sb.append(message);
            sb.append(". ErrorDomain = ");
            sb.append(domain);
            zzo.zzd(sb.toString());
            zzbwa zzbwaVar = this.zza;
            zzbwaVar.zzx(adError.zza());
            zzbwaVar.zzw(adError.getCode(), adError.getMessage());
            zzbwaVar.zzg(adError.getCode());
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzT((MediationAppOpenAd) obj);
            this.zza.zzj();
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
        return new zzbwl(this.zza);
    }
}
