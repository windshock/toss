package com.kt.ollehusimmanager.aidl;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class i implements g {
    private IBinder mRemote;

    i(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public final void a(IBinder iBinder, IBinder iBinder2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IVerifyConnection");
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeStrongBinder(iBinder2);
            this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final void a(IBinder iBinder, IBinder iBinder2, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IVerifyConnection");
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeStrongBinder(iBinder2);
            parcelObtain.writeString(str);
            this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.mRemote;
    }

    public final void onDisconnected(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.kt.ollehusimmanager.aidl.IVerifyConnection");
            parcelObtain.writeString(str);
            this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
