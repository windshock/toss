package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import o.RecyclerViewChildDrawingOrderCallback;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class RecyclerViewChildDrawingOrderCallback$onWarmupCompleted$onExtraCallbackWithResult implements RecyclerViewChildDrawingOrderCallback {
    private IBinder IAuthTabCallback;

    RecyclerViewChildDrawingOrderCallback$onWarmupCompleted$onExtraCallbackWithResult(IBinder iBinder) {
        this.IAuthTabCallback = iBinder;
    }

    public IBinder asBinder() {
        return this.IAuthTabCallback;
    }

    public int IAuthTabCallback() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.skp.seio.aidl.ISEService");
            this.IAuthTabCallback.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public int onWarmupCompleted() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.skp.seio.aidl.ISEService");
            this.IAuthTabCallback.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public String onNavigationEvent() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.skp.seio.aidl.ISEService");
            this.IAuthTabCallback.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public int onExtraCallbackWithResult() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.skp.seio.aidl.ISEService");
            this.IAuthTabCallback.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public String onWarmupCompleted(byte[] bArr, byte[] bArr2) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.skp.seio.aidl.ISEService");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeInt(bArr2.length);
            this.IAuthTabCallback.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            String string = parcelObtain2.readString();
            parcelObtain2.readByteArray(bArr2);
            return string;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public boolean onExtraCallback() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.skp.seio.aidl.ISEService");
            this.IAuthTabCallback.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public boolean IAuthTabCallback(int i2) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.skp.seio.aidl.ISEService");
            parcelObtain.writeInt(i2);
            this.IAuthTabCallback.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public RecyclerViewChildDrawingOrderCallback onExtraCallbackWithResult(int i2) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.skp.seio.aidl.ISEService");
            parcelObtain.writeInt(i2);
            this.IAuthTabCallback.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return RecyclerViewChildDrawingOrderCallback.onWarmupCompleted.IAuthTabCallback(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
