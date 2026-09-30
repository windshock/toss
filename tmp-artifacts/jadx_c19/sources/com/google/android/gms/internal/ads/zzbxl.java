package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbxl extends zzbeu implements zzbxn {
    zzbxl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zze(zzbwj zzbwjVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzbwjVar);
        zzdb(1, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzf(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString("Adapter returned null.");
        zzdb(2, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzg(zze zzeVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzeVar);
        zzdb(3, parcelZzcZ);
    }
}
