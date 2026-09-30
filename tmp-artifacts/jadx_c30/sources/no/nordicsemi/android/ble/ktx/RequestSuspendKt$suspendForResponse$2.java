package no.nordicsemi.android.ble.ktx;

import android.bluetooth.BluetoothDevice;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import net.sf.scuba.smartcards.BuildConfig;
import o.setIsSelected;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RequestSuspendKt$suspendForResponse$2 implements setIsSelected {
    final /* synthetic */ Ref.ObjectRef<BluetoothDevice> onNavigationEvent;

    public final void onRequestStarted(@NotNull BluetoothDevice bluetoothDevice) {
        Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
        this.onNavigationEvent.element = bluetoothDevice;
    }
}
