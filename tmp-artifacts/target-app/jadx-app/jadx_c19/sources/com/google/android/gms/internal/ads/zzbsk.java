package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzbsk extends zzbev implements zzbsl {
    public zzbsk() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzbsl zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof zzbsl ? (zzbsl) iInterfaceQueryLocalInterface : new zzbsj(iBinder);
    }

    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 2) {
            zze();
        } else {
            if (i2 != 3) {
                return false;
            }
            String string = parcel.readString();
            zzbew.zzh(parcel);
            zzf(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
