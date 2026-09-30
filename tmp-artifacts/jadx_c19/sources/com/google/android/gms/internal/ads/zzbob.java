package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbob extends zzbeu implements zzbod {
    zzbob(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public final void zze(zzbu zzbuVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzbuVar);
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(1, parcelZzcZ);
    }
}
