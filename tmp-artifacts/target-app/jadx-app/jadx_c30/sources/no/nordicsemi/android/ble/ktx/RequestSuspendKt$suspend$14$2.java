package no.nordicsemi.android.ble.ktx;

import android.bluetooth.BluetoothDevice;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import net.sf.scuba.smartcards.BuildConfig;
import o.TTAdConstantNETWORK_STATE;
import o.loss;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RequestSuspendKt$suspend$14$2 implements TTAdConstantNETWORK_STATE {
    final /* synthetic */ Ref.ObjectRef<loss> onExtraCallbackWithResult;

    public final void onDataReceived(@NotNull BluetoothDevice bluetoothDevice, @NotNull loss lossVar) {
        Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(lossVar, BuildConfig.FLAVOR);
        this.onExtraCallbackWithResult.element = lossVar;
    }
}
