package no.nordicsemi.android.ble.ktx;

import android.bluetooth.BluetoothDevice;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import net.sf.scuba.smartcards.BuildConfig;
import o.TTC;
import o.loss;
import o.maybeRemoveAttachStateListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RequestSuspendKt$suspend$14$5 implements TTC {
    final /* synthetic */ Ref.ObjectRef<loss> onExtraCallback;
    final /* synthetic */ maybeRemoveAttachStateListener<loss> onNavigationEvent;

    public final void onRequestCompleted(@NotNull BluetoothDevice bluetoothDevice) {
        Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
        maybeRemoveAttachStateListener<loss> mayberemoveattachstatelistener = this.onNavigationEvent;
        Result.Companion companion = Result.Companion;
        Object obj = this.onExtraCallback.element;
        Intrinsics.checkNotNull(obj);
        mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(obj));
    }
}
