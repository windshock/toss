package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbev;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzdf extends zzbev implements zzdg {
    public zzdf() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzdg zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface : new zzde(iBinder);
    }

    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else {
            if (i2 != 2) {
                return false;
            }
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        }
        return true;
    }
}
