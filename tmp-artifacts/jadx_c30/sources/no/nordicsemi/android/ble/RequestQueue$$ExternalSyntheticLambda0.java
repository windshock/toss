package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import o.TTAdConstant;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class RequestQueue$$ExternalSyntheticLambda0 implements TTAdConstant {
    public final /* synthetic */ RequestQueue f$0;

    public final void onRequestFailed(BluetoothDevice bluetoothDevice, int i) {
        this.f$0.onExtraCallbackWithResult(bluetoothDevice, i);
    }
}
