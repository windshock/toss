package no.nordicsemi.android.ble.ktx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o.hasSecondOptions;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RequestSuspendKt$suspend$14$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ hasSecondOptions $this_suspend;

    public /* synthetic */ Object invoke(Object obj) {
        onExtraCallback((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void onExtraCallback(@Nullable Throwable th) {
        this.$this_suspend.cw_();
    }
}
