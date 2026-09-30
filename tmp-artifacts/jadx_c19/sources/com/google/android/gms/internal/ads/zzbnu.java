package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbnu extends zzbeu implements zzbnw {
    zzbnu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void zze(zzbnm zzbnmVar, String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzbnmVar);
        parcelZzcZ.writeString(str);
        zzdb(1, parcelZzcZ);
    }
}
