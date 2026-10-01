package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbmw extends NativeAd.Image {
    private final zzbmv zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbmw(zzbmv zzbmvVar) {
        double dZzc;
        int iZzd;
        IObjectWrapper iObjectWrapperZza;
        this.zza = zzbmvVar;
        Uri uriZzb = null;
        try {
            iObjectWrapperZza = zzbmvVar.zza();
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
        Drawable drawable = iObjectWrapperZza != null ? (Drawable) ObjectWrapper.unwrap(iObjectWrapperZza) : null;
        this.zzb = drawable;
        try {
            uriZzb = this.zza.zzb();
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
        this.zzc = uriZzb;
        try {
            dZzc = this.zza.zzc();
        } catch (RemoteException e3) {
            zzo.zzg("", e3);
            dZzc = 1.0d;
        }
        this.zzd = dZzc;
        int iZze = -1;
        try {
            iZzd = this.zza.zzd();
        } catch (RemoteException e4) {
            zzo.zzg("", e4);
            iZzd = -1;
        }
        this.zze = iZzd;
        try {
            iZze = this.zza.zze();
        } catch (RemoteException e5) {
            zzo.zzg("", e5);
        }
        this.zzf = iZze;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.zzf;
    }
}
