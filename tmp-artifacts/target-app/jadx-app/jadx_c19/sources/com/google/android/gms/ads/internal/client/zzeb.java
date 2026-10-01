package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzeb extends zzbeu implements zzed {
    zzeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
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

    public final void zzi(boolean z) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        int i2 = zzbew.zza;
        parcelZzcZ.writeInt(z ? 1 : 0);
        zzdb(5, parcelZzcZ);
    }
}
