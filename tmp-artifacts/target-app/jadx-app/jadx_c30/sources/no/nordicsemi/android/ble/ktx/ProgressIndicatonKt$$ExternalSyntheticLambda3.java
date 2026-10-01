package no.nordicsemi.android.ble.ktx;

import android.bluetooth.BluetoothDevice;
import kotlin.jvm.internal.Ref;
import o.TTClientBidding;
import o.TTRewardWebActivity;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ProgressIndicatonKt$$ExternalSyntheticLambda3 implements TTClientBidding {
    public final /* synthetic */ Ref.ObjectRef f$0;

    public final void onPacketSent(BluetoothDevice bluetoothDevice, byte[] bArr, int i) {
        TTRewardWebActivity.IAuthTabCallbackDefault(this.f$0, bluetoothDevice, bArr, i);
    }
}
