package com.skp.seio.aidl;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class ISEIOConnection$Stub$onExtraCallback implements ISEIOConnection {
    private IBinder onNavigationEvent;

    ISEIOConnection$Stub$onExtraCallback(IBinder iBinder) {
        this.onNavigationEvent = iBinder;
    }

    public IBinder asBinder() {
        return this.onNavigationEvent;
    }

    public void onConnectedToSEIO(IBinder iBinder) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.skp.seio.aidl.ISEIOConnection");
            parcelObtain.writeStrongBinder(iBinder);
            this.onNavigationEvent.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onDisconnectedToSEIO() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.skp.seio.aidl.ISEIOConnection");
            this.onNavigationEvent.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
