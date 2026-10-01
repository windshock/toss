package no.nordicsemi.android.ble.ktx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o.FilterWord;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RequestSuspendKt$suspend$16$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ FilterWord $this_suspend;

    public /* synthetic */ Object invoke(Object obj) {
        onWarmupCompleted((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void onWarmupCompleted(@Nullable Throwable th) {
        this.$this_suspend.cw_();
    }
}
