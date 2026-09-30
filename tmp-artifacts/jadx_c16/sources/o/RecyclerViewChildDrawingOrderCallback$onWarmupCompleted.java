package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class RecyclerViewChildDrawingOrderCallback$onWarmupCompleted extends Binder implements RecyclerViewChildDrawingOrderCallback {
    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerViewChildDrawingOrderCallback$onWarmupCompleted() {
        attachInterface(this, "com.skp.seio.aidl.ISEService");
    }

    public static RecyclerViewChildDrawingOrderCallback IAuthTabCallback(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        RecyclerViewChildDrawingOrderCallback recyclerViewChildDrawingOrderCallbackQueryLocalInterface = iBinder.queryLocalInterface("com.skp.seio.aidl.ISEService");
        if (recyclerViewChildDrawingOrderCallbackQueryLocalInterface != null && (recyclerViewChildDrawingOrderCallbackQueryLocalInterface instanceof RecyclerViewChildDrawingOrderCallback)) {
            return recyclerViewChildDrawingOrderCallbackQueryLocalInterface;
        }
        return new onExtraCallbackWithResult(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("com.skp.seio.aidl.ISEService");
        }
        if (i == 1598968902) {
            parcel2.writeString("com.skp.seio.aidl.ISEService");
            return true;
        }
        switch (i) {
            case 1:
                int iIAuthTabCallback = IAuthTabCallback();
                parcel2.writeNoException();
                parcel2.writeInt(iIAuthTabCallback);
                return true;
            case 2:
                int iOnWarmupCompleted = onWarmupCompleted();
                parcel2.writeNoException();
                parcel2.writeInt(iOnWarmupCompleted);
                return true;
            case 3:
                String strOnNavigationEvent = onNavigationEvent();
                parcel2.writeNoException();
                parcel2.writeString(strOnNavigationEvent);
                return true;
            case 4:
                int iOnExtraCallbackWithResult = onExtraCallbackWithResult();
                parcel2.writeNoException();
                parcel2.writeInt(iOnExtraCallbackWithResult);
                return true;
            case 5:
                byte[] bArrCreateByteArray = parcel.createByteArray();
                int i3 = parcel.readInt();
                byte[] bArr = i3 < 0 ? null : new byte[i3];
                String strOnWarmupCompleted = onWarmupCompleted(bArrCreateByteArray, bArr);
                parcel2.writeNoException();
                parcel2.writeString(strOnWarmupCompleted);
                parcel2.writeByteArray(bArr);
                return true;
            case 6:
                boolean zOnExtraCallback = onExtraCallback();
                parcel2.writeNoException();
                parcel2.writeInt(zOnExtraCallback ? 1 : 0);
                return true;
            case 7:
                boolean zIAuthTabCallback = IAuthTabCallback(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zIAuthTabCallback ? 1 : 0);
                return true;
            case 8:
                RecyclerViewChildDrawingOrderCallback recyclerViewChildDrawingOrderCallbackOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongInterface(recyclerViewChildDrawingOrderCallbackOnExtraCallbackWithResult);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
