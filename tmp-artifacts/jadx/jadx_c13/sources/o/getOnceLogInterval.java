package o;

import android.bluetooth.BluetoothDevice;
import no.nordicsemi.android.ble.Request;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getOnceLogInterval<T> extends addOption<T> {
    private Request onActivityResized;
    private int onMinimized;

    public static /* synthetic */ void IAuthTabCallback(getOnceLogInterval getonceloginterval, BluetoothDevice bluetoothDevice, int i) {
        getonceloginterval.onMinimized = i;
        getonceloginterval.ICustomTabsCallback.open();
        getonceloginterval.onExtraCallbackWithResult(bluetoothDevice, i);
    }

    Request onExtraCallbackWithResult() {
        return this.onActivityResized;
    }

    public boolean onNavigationEvent() {
        return this.onMinimized == -123456;
    }

    public boolean onExtraCallback() {
        return this.onMinimized != -123455;
    }
}
