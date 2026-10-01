package no.nordicsemi.android.ble.ktx;

import android.bluetooth.BluetoothDevice;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import net.sf.scuba.smartcards.BuildConfig;
import o.isSupportMultiProcess;
import o.loss;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RequestSuspendKt$suspend$16$2 implements isSupportMultiProcess {
    final /* synthetic */ Ref.ObjectRef<loss> onNavigationEvent;

    public final void onDataSent(@NotNull BluetoothDevice bluetoothDevice, @NotNull loss lossVar) {
        Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(lossVar, BuildConfig.FLAVOR);
        this.onNavigationEvent.element = lossVar;
    }
}
