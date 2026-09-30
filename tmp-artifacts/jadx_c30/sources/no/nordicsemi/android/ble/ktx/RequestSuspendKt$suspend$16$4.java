package no.nordicsemi.android.ble.ktx;

import android.bluetooth.BluetoothDevice;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import no.nordicsemi.android.ble.exception.RequestFailedException;
import o.FilterWord;
import o.TTAdConstant;
import o.TTImage;
import o.TTM;
import o.loss;
import o.maybeRemoveAttachStateListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RequestSuspendKt$suspend$16$4 implements TTAdConstant {
    final /* synthetic */ maybeRemoveAttachStateListener<loss> onExtraCallback;
    final /* synthetic */ FilterWord onNavigationEvent;

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
                ttm = new RequestFailedException(this.onNavigationEvent, i);
            }
        }
        maybeRemoveAttachStateListener<loss> mayberemoveattachstatelistener = this.onExtraCallback;
        Result.Companion companion = Result.Companion;
        mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(ResultKt.createFailure(ttm)));
    }
}
