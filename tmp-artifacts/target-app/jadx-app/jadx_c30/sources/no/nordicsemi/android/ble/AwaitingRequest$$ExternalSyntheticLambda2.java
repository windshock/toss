package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import o.TTAdConstant;
import o.getOnceLogInterval;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class AwaitingRequest$$ExternalSyntheticLambda2 implements TTAdConstant {
    public final /* synthetic */ getOnceLogInterval f$0;

    public final void onRequestFailed(BluetoothDevice bluetoothDevice, int i) {
        getOnceLogInterval.IAuthTabCallback(this.f$0, bluetoothDevice, i);
    }
}
