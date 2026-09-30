package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.material.button.MaterialButton;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzbnl extends zzbev implements zzbnm {
    public zzbnl() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbnm zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        zzbnm zzbnmVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return zzbnmVarQueryLocalInterface instanceof zzbnm ? zzbnmVarQueryLocalInterface : new zzbnk(iBinder);
    }

    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                String string = parcel.readString();
                zzbew.zzh(parcel);
                String strZze = zze(string);
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 2:
                String string2 = parcel.readString();
                zzbew.zzh(parcel);
                zzbmv zzbmvVarZzf = zzf(string2);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzbmvVarZzf);
                return true;
            case 3:
                List<String> listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzg);
                return true;
            case 4:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 5:
                String string3 = parcel.readString();
                zzbew.zzh(parcel);
                zzi(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzj();
                parcel2.writeNoException();
                return true;
            case 7:
                zzea zzeaVarZzk = zzk();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzeaVarZzk);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper iObjectWrapperZzm = zzm();
                parcel2.writeNoException();
                zzbew.zze(parcel2, iObjectWrapperZzm);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                boolean zZzn = zzn(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                zzbew.zze(parcel2, (IInterface) null);
                return true;
            case 12:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i4 = zzbew.zza;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 13:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                int i5 = zzbew.zza;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzq(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzr();
                parcel2.writeNoException();
                return true;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                zzbms zzbmsVarZzs = zzs();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzbmsVarZzs);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                boolean zZzt = zzt(iObjectWrapperAsInterface3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
