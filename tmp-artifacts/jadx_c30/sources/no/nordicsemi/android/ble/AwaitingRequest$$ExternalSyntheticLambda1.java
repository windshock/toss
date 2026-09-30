package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import o.TTC;
import o.getOnceLogInterval;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class AwaitingRequest$$ExternalSyntheticLambda1 implements TTC {
    public final /* synthetic */ getOnceLogInterval f$0;

    public final void onRequestCompleted(BluetoothDevice bluetoothDevice) {
        getOnceLogInterval.IAuthTabCallback(this.f$0, bluetoothDevice);
    }
}
