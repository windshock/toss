package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface setItemPrefetchEnabled extends IInterface {
    int IAuthTabCallback() throws RemoteException;

    setItemPrefetchEnabled IAuthTabCallback(int i) throws RemoteException;

    setItemPrefetchEnabled IAuthTabCallback(int i, IBinder iBinder) throws RemoteException;

    int onExtraCallback() throws RemoteException;

    int onExtraCallback(byte[] bArr) throws RemoteException;

    int onExtraCallbackWithResult(byte[] bArr, byte[] bArr2) throws RemoteException;

    int onWarmupCompleted() throws RemoteException;
}
