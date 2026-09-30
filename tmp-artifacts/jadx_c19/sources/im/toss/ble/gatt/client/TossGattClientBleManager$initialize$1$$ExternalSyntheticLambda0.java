package im.toss.ble.gatt.client;

import android.bluetooth.BluetoothDevice;
import o.WorkerUpdaterExternalSyntheticLambda1;
import o.getPA;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class TossGattClientBleManager$initialize$1$$ExternalSyntheticLambda0 implements getPA {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ WorkerUpdaterExternalSyntheticLambda1 f$0;

    public final void onRequestFinished(BluetoothDevice bluetoothDevice) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 87;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            WorkerUpdaterExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult(this.f$0, bluetoothDevice);
            throw null;
        }
        WorkerUpdaterExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult(this.f$0, bluetoothDevice);
        int i4 = onExtraCallback + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
    }
}
