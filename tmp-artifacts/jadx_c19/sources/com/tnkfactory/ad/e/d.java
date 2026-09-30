package com.tnkfactory.ad.e;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class d extends Binder implements IInterface {
    public final IBinder a;

    public d(IBinder iBinder) {
        this.a = iBinder;
    }

    public final String a() {
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "");
        Parcel parcelObtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain2, "");
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            IBinder iBinder = this.a;
            Intrinsics.checkNotNull(iBinder);
            iBinder.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        IBinder iBinder = this.a;
        Intrinsics.checkNotNull(iBinder);
        return iBinder;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i2 == 1598968902) {
            Intrinsics.checkNotNull(parcel2);
            parcel2.writeString("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return true;
        }
        if (i2 == 1) {
            parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            String strA = a();
            Intrinsics.checkNotNull(parcel2);
            parcel2.writeNoException();
            parcel2.writeString(strA);
            return true;
        }
        if (i2 == 2) {
            parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            boolean zA = a(parcel.readInt() != 0);
            Intrinsics.checkNotNull(parcel2);
            parcel2.writeNoException();
            parcel2.writeInt(zA ? 1 : 0);
            return true;
        }
        if (i2 == 3) {
            parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            String string = parcel.readString();
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "");
            Parcel parcelObtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain2, "");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeString(string);
                IBinder iBinder = this.a;
                Intrinsics.checkNotNull(iBinder);
                iBinder.transact(3, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String string2 = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                Intrinsics.checkNotNull(parcel2);
                parcel2.writeNoException();
                parcel2.writeString(string2);
                return true;
            } finally {
            }
        }
        if (i2 != 4) {
            return super.onTransact(i2, parcel, parcel2, i3);
        }
        parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        String string3 = parcel.readString();
        int i4 = parcel.readInt() != 0 ? 1 : 0;
        Parcel parcelObtain3 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain3, "");
        Parcel parcelObtain4 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain4, "");
        try {
            parcelObtain3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            parcelObtain3.writeString(string3);
            parcelObtain3.writeInt(i4);
            IBinder iBinder2 = this.a;
            Intrinsics.checkNotNull(iBinder2);
            iBinder2.transact(4, parcelObtain3, parcelObtain4, 0);
            parcelObtain4.readException();
            parcelObtain4.recycle();
            parcelObtain3.recycle();
            Intrinsics.checkNotNull(parcel2);
            parcel2.writeNoException();
            return true;
        } finally {
        }
    }

    public final boolean a(boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "");
        Parcel parcelObtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain2, "");
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            parcelObtain.writeInt(z ? 1 : 0);
            IBinder iBinder = this.a;
            Intrinsics.checkNotNull(iBinder);
            iBinder.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
