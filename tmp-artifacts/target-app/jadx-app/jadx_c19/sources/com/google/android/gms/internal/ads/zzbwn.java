package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzbwn implements MediationAdLoadCallback {
    final /* synthetic */ zzbwa zza;
    final /* synthetic */ Adapter zzb;
    final /* synthetic */ zzbwv zzc;

    zzbwn(zzbwv zzbwvVar, zzbwa zzbwaVar, Adapter adapter) {
        this.zza = zzbwaVar;
        this.zzb = adapter;
        Objects.requireNonNull(zzbwvVar);
        this.zzc = zzbwvVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(@NonNull AdError adError) {
        try {
            String canonicalName = this.zzb.getClass().getCanonicalName();
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
            this.zzc.zzS((MediationInterscrollerAd) obj);
            this.zza.zzj();
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
        return new zzbwl(this.zza);
    }
}
