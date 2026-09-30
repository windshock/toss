package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbnr extends zzbeu implements zzbnt {
    zzbnr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void zze(zzbnj zzbnjVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzbnjVar);
        zzdb(1, parcelZzcZ);
    }
}
