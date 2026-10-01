package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jw9<T> extends jw6<T> {
    private final ltlud<T> onNavigationEvent;
    private final ulsya<T> onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw9(@NotNull List<? extends lt1<? super T>> list) {
        super(list);
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent = super.onExtraCallbackWithResult();
        this.onWarmupCompleted = super.onExtraCallback();
    }

    @Override // o.jw6, o.getPlayDelayedELExpressTimeS
    public ltlud<T> onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    @Override // o.jw6, o.getPlayDelayedELExpressTimeS
    public ulsya<T> onExtraCallback() {
        return this.onWarmupCompleted;
    }
}
