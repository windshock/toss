package no.nordicsemi.android.ble.ktx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o.getIsSelected;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RequestSuspendKt$suspendCancellable$2$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ getIsSelected $this_suspendCancellable;

    public /* synthetic */ Object invoke(Object obj) {
        onExtraCallback((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void onExtraCallback(@Nullable Throwable th) {
        this.$this_suspendCancellable.cw_();
    }
}
