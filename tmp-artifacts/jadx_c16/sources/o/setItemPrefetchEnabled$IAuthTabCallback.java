package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class setItemPrefetchEnabled$IAuthTabCallback extends Binder implements setItemPrefetchEnabled {
    /* JADX WARN: Multi-variable type inference failed */
    public setItemPrefetchEnabled$IAuthTabCallback() {
        attachInterface(this, "com.sktelecom.smartcard.ISmartcard");
    }

    public static setItemPrefetchEnabled IAuthTabCallback(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        setItemPrefetchEnabled setitemprefetchenabledQueryLocalInterface = iBinder.queryLocalInterface("com.sktelecom.smartcard.ISmartcard");
        if (setitemprefetchenabledQueryLocalInterface != null && (setitemprefetchenabledQueryLocalInterface instanceof setItemPrefetchEnabled)) {
            return setitemprefetchenabledQueryLocalInterface;
        }
        return new onExtraCallbackWithResult(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1598968902) {
            parcel2.writeString("com.sktelecom.smartcard.ISmartcard");
            return true;
        }
        switch (i) {
            case 1:
                parcel.enforceInterface("com.sktelecom.smartcard.ISmartcard");
                int iIAuthTabCallback = IAuthTabCallback();
                parcel2.writeNoException();
                parcel2.writeInt(iIAuthTabCallback);
                return true;
            case 2:
                parcel.enforceInterface("com.sktelecom.smartcard.ISmartcard");
                byte[] bArrCreateByteArray = parcel.createByteArray();
                int i3 = parcel.readInt();
                byte[] bArr = i3 >= 0 ? new byte[i3] : null;
                int iOnExtraCallbackWithResult = onExtraCallbackWithResult(bArrCreateByteArray, bArr);
                parcel2.writeNoException();
                parcel2.writeInt(iOnExtraCallbackWithResult);
                parcel2.writeByteArray(bArr);
                return true;
            case 3:
                parcel.enforceInterface("com.sktelecom.smartcard.ISmartcard");
                int iOnExtraCallback = onExtraCallback();
                parcel2.writeNoException();
                parcel2.writeInt(iOnExtraCallback);
                return true;
            case 4:
                parcel.enforceInterface("com.sktelecom.smartcard.ISmartcard");
                int i4 = parcel.readInt();
                byte[] bArr2 = i4 >= 0 ? new byte[i4] : null;
                int iOnExtraCallback2 = onExtraCallback(bArr2);
                parcel2.writeNoException();
                parcel2.writeInt(iOnExtraCallback2);
                parcel2.writeByteArray(bArr2);
                return true;
            case 5:
                parcel.enforceInterface("com.sktelecom.smartcard.ISmartcard");
                int iOnWarmupCompleted = onWarmupCompleted();
                parcel2.writeNoException();
                parcel2.writeInt(iOnWarmupCompleted);
                return true;
            case 6:
                parcel.enforceInterface("com.sktelecom.smartcard.ISmartcard");
                setItemPrefetchEnabled setitemprefetchenabledIAuthTabCallback = IAuthTabCallback(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(setitemprefetchenabledIAuthTabCallback != null ? setitemprefetchenabledIAuthTabCallback.asBinder() : null);
                return true;
            case 7:
                parcel.enforceInterface("com.sktelecom.smartcard.ISmartcard");
                setItemPrefetchEnabled setitemprefetchenabledIAuthTabCallback2 = IAuthTabCallback(parcel.readInt(), parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(setitemprefetchenabledIAuthTabCallback2 != null ? setitemprefetchenabledIAuthTabCallback2.asBinder() : null);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    public static setItemPrefetchEnabled onExtraCallbackWithResult() {
        return onExtraCallbackWithResult.IAuthTabCallback;
    }
}
