package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbzc extends NativeAd.Image {
    private final zzbmv zzb;
    private final Drawable zzc;
    private final Uri zzd;
    private final double zze;
    private final int zzf;
    private final int zzg;

    public zzbzc(zzbmv zzbmvVar) {
        Uri uriZzb;
        double dZzc;
        int iZzd;
        IObjectWrapper iObjectWrapperZza;
        this.zzb = zzbmvVar;
        Map mapZzf = null;
        try {
            iObjectWrapperZza = zzbmvVar.zza();
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
        Drawable drawable = iObjectWrapperZza != null ? (Drawable) ObjectWrapper.unwrap(iObjectWrapperZza) : null;
        this.zzc = drawable;
        try {
            uriZzb = this.zzb.zzb();
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
            uriZzb = null;
        }
        this.zzd = uriZzb;
        try {
            dZzc = this.zzb.zzc();
        } catch (RemoteException e3) {
            zzo.zzg("", e3);
            dZzc = 1.0d;
        }
        this.zze = dZzc;
        int iZze = -1;
        try {
            iZzd = this.zzb.zzd();
        } catch (RemoteException e4) {
            zzo.zzg("", e4);
            iZzd = -1;
        }
        this.zzf = iZzd;
        try {
            iZze = this.zzb.zze();
        } catch (RemoteException e5) {
            zzo.zzg("", e5);
        }
        this.zzg = iZze;
        if (((Boolean) zzba.zzc().zzd(zzbjg.zzeX)).booleanValue()) {
            try {
                mapZzf = this.zzb.zzf();
            } catch (RemoteException unused) {
            }
        }
        ((NativeAd.Image) this).zza = mapZzf;
    }

    public final Drawable getDrawable() {
        return this.zzc;
    }

    public final double getScale() {
        return this.zze;
    }

    public final Uri getUri() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzg;
    }
}
