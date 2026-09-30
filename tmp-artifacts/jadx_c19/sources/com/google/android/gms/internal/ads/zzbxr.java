package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbxr extends zzbeu implements zzbxt {
    zzbxr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzr zzrVar, zzbxw zzbxwVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        parcelZzcZ.writeString(str);
        zzbew.zzc(parcelZzcZ, bundle);
        zzbew.zzc(parcelZzcZ, bundle2);
        zzbew.zzc(parcelZzcZ, zzrVar);
        zzbew.zze(parcelZzcZ, zzbxwVar);
        zzdb(1, parcelZzcZ);
    }

    public final zzbyi zzf() throws RemoteException {
        Parcel parcelZzda = zzda(2, zzcZ());
        zzbyi zzbyiVar = (zzbyi) zzbew.zzb(parcelZzda, zzbyi.CREATOR);
        parcelZzda.recycle();
        return zzbyiVar;
    }

    public final zzbyi zzg() throws RemoteException {
        Parcel parcelZzda = zzda(3, zzcZ());
        zzbyi zzbyiVar = (zzbyi) zzbew.zzb(parcelZzda, zzbyi.CREATOR);
        parcelZzda.recycle();
        return zzbyiVar;
    }

    public final zzea zzh() throws RemoteException {
        Parcel parcelZzda = zzda(5, zzcZ());
        zzea zzeaVarZza = zzdz.zza(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzeaVarZza;
    }

    public final void zzi(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxh zzbxhVar, zzbwa zzbwaVar, zzr zzrVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zzc(parcelZzcZ, zzmVar);
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, zzbxhVar);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzbew.zzc(parcelZzcZ, zzrVar);
        zzdb(13, parcelZzcZ);
    }

    public final void zzj(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxk zzbxkVar, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zzc(parcelZzcZ, zzmVar);
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, zzbxkVar);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(14, parcelZzcZ);
    }

    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        Parcel parcelZzda = zzda(15, parcelZzcZ);
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    public final void zzl(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxq zzbxqVar, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zzc(parcelZzcZ, zzmVar);
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, zzbxqVar);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(16, parcelZzcZ);
    }

    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        Parcel parcelZzda = zzda(17, parcelZzcZ);
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    public final void zzn(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxn zzbxnVar, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zzc(parcelZzcZ, zzmVar);
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, zzbxnVar);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(18, parcelZzcZ);
    }

    public final void zzo(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        zzdb(19, parcelZzcZ);
    }

    public final void zzp(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxq zzbxqVar, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zzc(parcelZzcZ, zzmVar);
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, zzbxqVar);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(20, parcelZzcZ);
    }

    public final void zzq(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxh zzbxhVar, zzbwa zzbwaVar, zzr zzrVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zzc(parcelZzcZ, zzmVar);
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, zzbxhVar);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzbew.zzc(parcelZzcZ, zzrVar);
        zzdb(21, parcelZzcZ);
    }

    public final void zzr(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxn zzbxnVar, zzbwa zzbwaVar, zzbmk zzbmkVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zzc(parcelZzcZ, zzmVar);
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, zzbxnVar);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzbew.zzc(parcelZzcZ, zzbmkVar);
        zzdb(22, parcelZzcZ);
    }

    public final void zzs(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxe zzbxeVar, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zzc(parcelZzcZ, zzmVar);
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, zzbxeVar);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(23, parcelZzcZ);
    }

    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        Parcel parcelZzda = zzda(24, parcelZzcZ);
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }
}
