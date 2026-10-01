package im.toss.ble.gatt.client;

import android.bluetooth.BluetoothDevice;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import o.TTAdConstantNETWORK_STATE;
import o.WorkerUpdaterExternalSyntheticLambda1;
import o.loss;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossGattClientBleManager$$ExternalSyntheticLambda0 implements TTAdConstantNETWORK_STATE {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ WorkerUpdaterExternalSyntheticLambda1 f$0;

    public final void onDataReceived(BluetoothDevice bluetoothDevice, loss lossVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, bluetoothDevice, lossVar};
            WorkerUpdaterExternalSyntheticLambda1.IAuthTabCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, -669991741, 669991742);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f$0, bluetoothDevice, lossVar};
        WorkerUpdaterExternalSyntheticLambda1.IAuthTabCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2, -669991741, 669991742);
        int i3 = onWarmupCompleted + 1;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 51 / 0;
        }
    }
}
