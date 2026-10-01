package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbvv extends zzbeu implements zzbvx {
    zzbvv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final void zzA(boolean z) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        int i2 = zzbew.zza;
        parcelZzcZ.writeInt(z ? 1 : 0);
        zzdb(25, parcelZzcZ);
    }

    public final zzea zzB() throws RemoteException {
        Parcel parcelZzda = zzda(26, zzcZ());
        zzea zzeaVarZza = zzdz.zza(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzeaVarZza;
    }

    public final zzbwj zzC() throws RemoteException {
        zzbwj zzbwhVar;
        Parcel parcelZzda = zzda(27, zzcZ());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbwhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbwhVar = iInterfaceQueryLocalInterface instanceof zzbwj ? (zzbwj) iInterfaceQueryLocalInterface : new zzbwh(strongBinder);
        }
        parcelZzda.recycle();
        return zzbwhVar;
    }

    public final void zzD(IObjectWrapper iObjectWrapper, zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(28, parcelZzcZ);
    }

    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(30, parcelZzcZ);
    }

    public final void zzF(IObjectWrapper iObjectWrapper, zzbsl zzbslVar, List list) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, zzbslVar);
        parcelZzcZ.writeTypedList(list);
        zzdb(31, parcelZzcZ);
    }

    public final void zzG(IObjectWrapper iObjectWrapper, zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(32, parcelZzcZ);
    }

    public final zzbyi zzH() throws RemoteException {
        Parcel parcelZzda = zzda(33, zzcZ());
        zzbyi zzbyiVar = (zzbyi) zzbew.zzb(parcelZzda, zzbyi.CREATOR);
        parcelZzda.recycle();
        return zzbyiVar;
    }

    public final zzbyi zzI() throws RemoteException {
        Parcel parcelZzda = zzda(34, zzcZ());
        zzbyi zzbyiVar = (zzbyi) zzbew.zzb(parcelZzda, zzbyi.CREATOR);
        parcelZzda.recycle();
        return zzbyiVar;
    }

    public final void zzJ(IObjectWrapper iObjectWrapper, zzr zzrVar, zzm zzmVar, String str, String str2, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzrVar);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(35, parcelZzcZ);
    }

    public final zzbwd zzK() throws RemoteException {
        zzbwd zzbwbVar;
        Parcel parcelZzda = zzda(36, zzcZ());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbwbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbwbVar = iInterfaceQueryLocalInterface instanceof zzbwd ? (zzbwd) iInterfaceQueryLocalInterface : new zzbwb(strongBinder);
        }
        parcelZzda.recycle();
        return zzbwbVar;
    }

    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(37, parcelZzcZ);
    }

    public final void zzM(IObjectWrapper iObjectWrapper, zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(38, parcelZzcZ);
    }

    public final void zzN(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(39, parcelZzcZ);
    }

    public final zzbwf zzO() throws RemoteException {
        zzbwf zzbwfVar;
        Parcel parcelZzda = zzda(15, zzcZ());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbwfVar = null;
        } else {
            zzbwf zzbwfVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbwfVar = zzbwfVarQueryLocalInterface instanceof zzbwf ? zzbwfVarQueryLocalInterface : new zzbwf(strongBinder);
        }
        parcelZzda.recycle();
        return zzbwfVar;
    }

    public final zzbwg zzP() throws RemoteException {
        zzbwg zzbwgVar;
        Parcel parcelZzda = zzda(16, zzcZ());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbwgVar = null;
        } else {
            zzbwg zzbwgVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbwgVar = zzbwgVarQueryLocalInterface instanceof zzbwg ? zzbwgVarQueryLocalInterface : new zzbwg(strongBinder);
        }
        parcelZzda.recycle();
        return zzbwgVar;
    }

    public final void zze(IObjectWrapper iObjectWrapper, zzr zzrVar, zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        throw null;
    }

    public final IObjectWrapper zzf() throws RemoteException {
        Parcel parcelZzda = zzda(2, zzcZ());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return iObjectWrapperAsInterface;
    }

    public final void zzg(IObjectWrapper iObjectWrapper, zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        throw null;
    }

    public final void zzh() throws RemoteException {
        zzdb(4, zzcZ());
    }

    public final void zzi() throws RemoteException {
        zzdb(5, zzcZ());
    }

    public final void zzj(IObjectWrapper iObjectWrapper, zzr zzrVar, zzm zzmVar, String str, String str2, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzrVar);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(6, parcelZzcZ);
    }

    public final void zzk(IObjectWrapper iObjectWrapper, zzm zzmVar, String str, String str2, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(7, parcelZzcZ);
    }

    public final void zzl() throws RemoteException {
        zzdb(8, zzcZ());
    }

    public final void zzm() throws RemoteException {
        zzdb(9, zzcZ());
    }

    public final void zzn(IObjectWrapper iObjectWrapper, zzm zzmVar, String str, zzccs zzccsVar, String str2) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(null);
        zzbew.zze(parcelZzcZ, zzccsVar);
        parcelZzcZ.writeString(str2);
        zzdb(10, parcelZzcZ);
    }

    public final void zzo(zzm zzmVar, String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        zzdb(11, parcelZzcZ);
    }

    public final void zzp() throws RemoteException {
        zzdb(12, zzcZ());
    }

    public final boolean zzq() throws RemoteException {
        Parcel parcelZzda = zzda(13, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    public final void zzr(IObjectWrapper iObjectWrapper, zzm zzmVar, String str, String str2, zzbwa zzbwaVar, zzbmk zzbmkVar, List list) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzbew.zzc(parcelZzcZ, zzbmkVar);
        parcelZzcZ.writeStringList(list);
        zzdb(14, parcelZzcZ);
    }

    public final Bundle zzs() throws RemoteException {
        throw null;
    }

    public final Bundle zzt() throws RemoteException {
        throw null;
    }

    public final Bundle zzu() throws RemoteException {
        throw null;
    }

    public final void zzv(zzm zzmVar, String str, String str2) throws RemoteException {
        throw null;
    }

    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(21, parcelZzcZ);
    }

    public final boolean zzx() throws RemoteException {
        Parcel parcelZzda = zzda(22, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    public final void zzy(IObjectWrapper iObjectWrapper, zzccs zzccsVar, List list) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, zzccsVar);
        parcelZzcZ.writeStringList(list);
        zzdb(23, parcelZzcZ);
    }

    public final zzbnm zzz() throws RemoteException {
        throw null;
    }
}
