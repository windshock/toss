package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbgx extends zzbeu implements zzbgz {
    zzbgx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public final zzbu zze() throws RemoteException {
        throw null;
    }

    public final void zzf(IObjectWrapper iObjectWrapper, zzbhg zzbhgVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, zzbhgVar);
        zzdb(4, parcelZzcZ);
    }

    public final zzdx zzg() throws RemoteException {
        Parcel parcelZzda = zzda(5, zzcZ());
        zzdx zzdxVarZza = zzdw.zza(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzdxVarZza;
    }

    public final void zzh(boolean z) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        int i2 = zzbew.zza;
        parcelZzcZ.writeInt(z ? 1 : 0);
        zzdb(6, parcelZzcZ);
    }

    public final void zzi(zzdq zzdqVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzdqVar);
        zzdb(7, parcelZzcZ);
    }

    public final String zzj() throws RemoteException {
        Parcel parcelZzda = zzda(8, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    public final long zzk() throws RemoteException {
        Parcel parcelZzda = zzda(9, zzcZ());
        long j = parcelZzda.readLong();
        parcelZzda.recycle();
        return j;
    }

    public final void zzl(long j) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeLong(j);
        zzdb(10, parcelZzcZ);
    }
}
