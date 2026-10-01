package im.toss.ble.gatt.client;

import android.bluetooth.BluetoothDevice;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import o.WorkerUpdaterExternalSyntheticLambda1;
import o.getPA;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossGattClientBleManager$$ExternalSyntheticLambda1 implements getPA {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ WorkerUpdaterExternalSyntheticLambda1 f$0;

    public final void onRequestFinished(BluetoothDevice bluetoothDevice) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, bluetoothDevice};
        if (i3 != 0) {
            WorkerUpdaterExternalSyntheticLambda1.IAuthTabCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, -1014123571, 1014123571);
        } else {
            WorkerUpdaterExternalSyntheticLambda1.IAuthTabCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, -1014123571, 1014123571);
            throw null;
        }
    }
}
