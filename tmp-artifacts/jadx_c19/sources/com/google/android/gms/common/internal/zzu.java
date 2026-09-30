package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzu extends zza implements ICancelToken {
    zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    public final void cancel() throws RemoteException {
        zzC(2, zza());
    }
}
