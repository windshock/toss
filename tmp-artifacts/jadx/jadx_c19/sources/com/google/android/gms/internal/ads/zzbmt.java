package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbmt extends zzbeu implements zzbmv {
    zzbmt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final IObjectWrapper zza() throws RemoteException {
        Parcel parcelZzda = zzda(1, zzcZ());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final Uri zzb() throws RemoteException {
        Parcel parcelZzda = zzda(2, zzcZ());
        Uri uri = (Uri) zzbew.zzb(parcelZzda, Uri.CREATOR);
        parcelZzda.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final double zzc() throws RemoteException {
        Parcel parcelZzda = zzda(3, zzcZ());
        double d = parcelZzda.readDouble();
        parcelZzda.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final int zzd() throws RemoteException {
        Parcel parcelZzda = zzda(4, zzcZ());
        int i2 = parcelZzda.readInt();
        parcelZzda.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final int zze() throws RemoteException {
        Parcel parcelZzda = zzda(5, zzcZ());
        int i2 = parcelZzda.readInt();
        parcelZzda.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final Map zzf() throws RemoteException {
        Parcel parcelZzda = zzda(6, zzcZ());
        HashMap mapZzg = zzbew.zzg(parcelZzda);
        parcelZzda.recycle();
        return mapZzg;
    }
}
