package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbta extends zzbeu implements zzbtc {
    zzbta(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public final void zze(zzbsw zzbswVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzbswVar);
        zzdb(1, parcelZzcZ);
    }

    public final void zzf(int i2) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeInt(i2);
        zzdb(2, parcelZzcZ);
    }

    public final void zzg(zze zzeVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzeVar);
        zzdb(3, parcelZzcZ);
    }
}
