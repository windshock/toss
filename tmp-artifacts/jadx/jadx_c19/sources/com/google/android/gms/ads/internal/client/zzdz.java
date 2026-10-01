package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzdz extends zzbev implements zzea {
    public zzdz() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzea zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        zzea zzeaVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return zzeaVarQueryLocalInterface instanceof zzea ? zzeaVarQueryLocalInterface : new zzdy(iBinder);
    }

    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzed zzebVar;
        switch (i2) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                zzf();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZza = zzbew.zza(parcel);
                zzbew.zzh(parcel);
                zzg(zZza);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzh = zzh();
                parcel2.writeNoException();
                int i4 = zzbew.zza;
                parcel2.writeInt(zZzh ? 1 : 0);
                return true;
            case 5:
                int iZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeInt(iZzi);
                return true;
            case 6:
                float fZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzj);
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzebVar = null;
                } else {
                    zzed zzedVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzebVar = zzedVarQueryLocalInterface instanceof zzed ? zzedVarQueryLocalInterface : new zzeb(strongBinder);
                }
                zzbew.zzh(parcel);
                zzl(zzebVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float fZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzm);
                return true;
            case 10:
                boolean zZzn = zzn();
                parcel2.writeNoException();
                int i5 = zzbew.zza;
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                zzed zzedVarZzo = zzo();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzedVarZzo);
                return true;
            case 12:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                int i6 = zzbew.zza;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 13:
                zzq();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
