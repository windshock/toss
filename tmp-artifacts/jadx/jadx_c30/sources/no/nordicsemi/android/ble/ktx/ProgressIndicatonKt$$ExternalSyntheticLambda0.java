package no.nordicsemi.android.ble.ktx;

import android.bluetooth.BluetoothDevice;
import kotlin.jvm.internal.Ref;
import no.nordicsemi.android.ble.callback.ReadProgressCallback;
import o.TTRewardWebActivity;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ProgressIndicatonKt$$ExternalSyntheticLambda0 implements ReadProgressCallback {
    public final /* synthetic */ Ref.ObjectRef f$0;

    public final void onPacketReceived(BluetoothDevice bluetoothDevice, byte[] bArr, int i) {
        TTRewardWebActivity.asInterface(this.f$0, bluetoothDevice, bArr, i);
    }
}
