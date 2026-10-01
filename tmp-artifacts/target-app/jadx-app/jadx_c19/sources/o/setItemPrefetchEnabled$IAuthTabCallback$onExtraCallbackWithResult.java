package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import o.setItemPrefetchEnabled;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class setItemPrefetchEnabled$IAuthTabCallback$onExtraCallbackWithResult implements setItemPrefetchEnabled {
    public static setItemPrefetchEnabled IAuthTabCallback;
    private IBinder onExtraCallback;

    setItemPrefetchEnabled$IAuthTabCallback$onExtraCallbackWithResult(IBinder iBinder) {
        this.onExtraCallback = iBinder;
    }

    public IBinder asBinder() {
        return this.onExtraCallback;
    }

    public int IAuthTabCallback() throws RemoteException {
        int iIAuthTabCallback;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.sktelecom.smartcard.ISmartcard");
            if (!this.onExtraCallback.transact(1, parcelObtain, parcelObtain2, 0) && setItemPrefetchEnabled.IAuthTabCallback.onExtraCallbackWithResult() != null) {
                iIAuthTabCallback = setItemPrefetchEnabled.IAuthTabCallback.onExtraCallbackWithResult().IAuthTabCallback();
            } else {
                parcelObtain2.readException();
                iIAuthTabCallback = parcelObtain2.readInt();
            }
            return iIAuthTabCallback;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public int onExtraCallbackWithResult(byte[] bArr, byte[] bArr2) throws RemoteException {
        int iOnExtraCallbackWithResult;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.sktelecom.smartcard.ISmartcard");
            parcelObtain.writeByteArray(bArr);
            if (bArr2 == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr2.length);
            }
            if (!this.onExtraCallback.transact(2, parcelObtain, parcelObtain2, 0) && setItemPrefetchEnabled.IAuthTabCallback.onExtraCallbackWithResult() != null) {
                iOnExtraCallbackWithResult = setItemPrefetchEnabled.IAuthTabCallback.onExtraCallbackWithResult().onExtraCallbackWithResult(bArr, bArr2);
            } else {
                parcelObtain2.readException();
                iOnExtraCallbackWithResult = parcelObtain2.readInt();
                parcelObtain2.readByteArray(bArr2);
            }
            return iOnExtraCallbackWithResult;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public int onExtraCallback() throws RemoteException {
        int iOnExtraCallback;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.sktelecom.smartcard.ISmartcard");
            if (!this.onExtraCallback.transact(3, parcelObtain, parcelObtain2, 0) && setItemPrefetchEnabled.IAuthTabCallback.onExtraCallbackWithResult() != null) {
                iOnExtraCallback = setItemPrefetchEnabled.IAuthTabCallback.onExtraCallbackWithResult().onExtraCallback();
            } else {
                parcelObtain2.readException();
                iOnExtraCallback = parcelObtain2.readInt();
            }
            return iOnExtraCallback;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public int onExtraCallback(byte[] bArr) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.sktelecom.smartcard.ISmartcard");
            if (bArr == null) {
                parcelObtain.writeInt(-1);
            } else {
                parcelObtain.writeInt(bArr.length);
            }
            if (!this.onExtraCallback.transact(4, parcelObtain, parcelObtain2, 0) && setItemPrefetchEnabled.IAuthTabCallback.onExtraCallbackWithResult() != null) {
                return setItemPrefetchEnabled.IAuthTabCallback.onExtraCallbackWithResult().onExtraCallback(bArr);
            }
            parcelObtain2.readException();
            int i2 = parcelObtain2.readInt();
            parcelObtain2.readByteArray(bArr);
            return i2;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public int onWarmupCompleted() throws RemoteException {
        int iOnWarmupCompleted;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.sktelecom.smartcard.ISmartcard");
            if (!this.onExtraCallback.transact(5, parcelObtain, parcelObtain2, 0) && setItemPrefetchEnabled.IAuthTabCallback.onExtraCallbackWithResult() != null) {
                iOnWarmupCompleted = setItemPrefetchEnabled.IAuthTabCallback.onExtraCallbackWithResult().onWarmupCompleted();
            } else {
                parcelObtain2.readException();
                iOnWarmupCompleted = parcelObtain2.readInt();
            }
            return iOnWarmupCompleted;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public setItemPrefetchEnabled IAuthTabCallback(int i2) throws RemoteException {
        setItemPrefetchEnabled setitemprefetchenabledIAuthTabCallback;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.sktelecom.smartcard.ISmartcard");
            parcelObtain.writeInt(i2);
            if (!this.onExtraCallback.transact(6, parcelObtain, parcelObtain2, 0) && setItemPrefetchEnabled.IAuthTabCallback.onExtraCallbackWithResult() != null) {
                setitemprefetchenabledIAuthTabCallback = setItemPrefetchEnabled.IAuthTabCallback.onExtraCallbackWithResult().IAuthTabCallback(i2);
            } else {
                parcelObtain2.readException();
                setitemprefetchenabledIAuthTabCallback = setItemPrefetchEnabled.IAuthTabCallback.IAuthTabCallback(parcelObtain2.readStrongBinder());
            }
            return setitemprefetchenabledIAuthTabCallback;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public setItemPrefetchEnabled IAuthTabCallback(int i2, IBinder iBinder) throws RemoteException {
        setItemPrefetchEnabled setitemprefetchenabledIAuthTabCallback;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.sktelecom.smartcard.ISmartcard");
            parcelObtain.writeInt(i2);
            parcelObtain.writeStrongBinder(iBinder);
            if (!this.onExtraCallback.transact(7, parcelObtain, parcelObtain2, 0) && setItemPrefetchEnabled.IAuthTabCallback.onExtraCallbackWithResult() != null) {
                setitemprefetchenabledIAuthTabCallback = setItemPrefetchEnabled.IAuthTabCallback.onExtraCallbackWithResult().IAuthTabCallback(i2, iBinder);
            } else {
                parcelObtain2.readException();
                setitemprefetchenabledIAuthTabCallback = setItemPrefetchEnabled.IAuthTabCallback.IAuthTabCallback(parcelObtain2.readStrongBinder());
            }
            return setitemprefetchenabledIAuthTabCallback;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
