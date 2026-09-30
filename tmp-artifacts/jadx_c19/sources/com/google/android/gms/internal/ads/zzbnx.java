package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbnx extends zzbeu implements zzbnz {
    zzbnx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void zze(zzbnm zzbnmVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzbnmVar);
        zzdb(1, parcelZzcZ);
    }
}
