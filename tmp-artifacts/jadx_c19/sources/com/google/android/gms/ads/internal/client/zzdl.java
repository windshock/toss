package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdl extends zzbeu implements zzdn {
    zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    public final void zze() throws RemoteException {
        zzdb(1, zzcZ());
    }
}
