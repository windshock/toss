package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzccl extends zzbeu implements zzccn {
    zzccl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void zze() throws RemoteException {
        zzdb(1, zzcZ());
    }

    public final void zzf() throws RemoteException {
        zzdb(2, zzcZ());
    }

    public final void zzg() throws RemoteException {
        zzdb(3, zzcZ());
    }

    public final void zzh() throws RemoteException {
        zzdb(4, zzcZ());
    }

    public final void zzi(zzcch zzcchVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzcchVar);
        zzdb(5, parcelZzcZ);
    }

    public final void zzj() throws RemoteException {
        zzdb(6, zzcZ());
    }

    public final void zzk(int i2) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeInt(i2);
        zzdb(7, parcelZzcZ);
    }

    public final void zzl() throws RemoteException {
        zzdb(8, zzcZ());
    }
}
