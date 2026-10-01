package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.material.button.MaterialButton;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzbvz extends zzbev implements zzbwa {
    public zzbvz() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbwa zzdR(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbwa ? (zzbwa) iInterfaceQueryLocalInterface : new zzbvy(iBinder);
    }

    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i4 = parcel.readInt();
                zzbew.zzh(parcel);
                zzg(i4);
                break;
            case 4:
                zzh();
                break;
            case 5:
                zzi();
                break;
            case 6:
                zzj();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                zzbew.zzh(parcel);
                break;
            case 8:
                zzk();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzbew.zzh(parcel);
                zzl(string, string2);
                break;
            case 10:
                zzbnl.zza(parcel.readStrongBinder());
                parcel.readString();
                zzbew.zzh(parcel);
                break;
            case 11:
                zzn();
                break;
            case 12:
                parcel.readString();
                zzbew.zzh(parcel);
                break;
            case 13:
                zzo();
                break;
            case 14:
                zzcct zzcctVar = (zzcct) zzbew.zzb(parcel, zzcct.CREATOR);
                zzbew.zzh(parcel);
                zzp(zzcctVar);
                break;
            case 15:
                zzq();
                break;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                zzccx zzccxVarZza = zzccw.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzr(zzccxVarZza);
                break;
            case 17:
                int i5 = parcel.readInt();
                zzbew.zzh(parcel);
                zzs(i5);
                break;
            case 18:
                zzt();
                break;
            case 19:
                zzbew.zzh(parcel);
                break;
            case 20:
                zzu();
                break;
            case 21:
                String string3 = parcel.readString();
                zzbew.zzh(parcel);
                zzv(string3);
                break;
            case 22:
                int i6 = parcel.readInt();
                String string4 = parcel.readString();
                zzbew.zzh(parcel);
                zzw(i6, string4);
                break;
            case 23:
                zze zzeVar = (zze) zzbew.zzb(parcel, zze.CREATOR);
                zzbew.zzh(parcel);
                zzx(zzeVar);
                break;
            case 24:
                zze zzeVar2 = (zze) zzbew.zzb(parcel, zze.CREATOR);
                zzbew.zzh(parcel);
                zzy(zzeVar2);
                break;
            case 25:
                zzz();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
