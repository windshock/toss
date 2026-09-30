package no.nordicsemi.android.ble.ktx;

import android.bluetooth.BluetoothDevice;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import no.nordicsemi.android.ble.exception.RequestFailedException;
import o.TTAdConstant;
import o.TTImage;
import o.TTM;
import o.getIsSelected;
import o.maybeRemoveAttachStateListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RequestSuspendKt$suspendCancellable$2$3 implements TTAdConstant {
    final /* synthetic */ getIsSelected onExtraCallbackWithResult;
    final /* synthetic */ maybeRemoveAttachStateListener<Unit> onWarmupCompleted;

    public final void onRequestFailed(@NotNull BluetoothDevice bluetoothDevice, int i) {
        Throwable ttm;
        Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
        if (i == -100) {
            ttm = new TTM();
        } else {
            if (i == -7) {
                return;
            }
            if (i == -1) {
                ttm = new TTImage();
            } else {
                ttm = new RequestFailedException(this.onExtraCallbackWithResult, i);
            }
        }
        maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener = this.onWarmupCompleted;
        Result.Companion companion = Result.Companion;
        mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(ResultKt.createFailure(ttm)));
    }
}
