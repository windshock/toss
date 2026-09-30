package kotlinx.datetime.internal.format;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.internal.format.formatter.ReducedIntFormatterStructure;
import o.ltlud;
import o.setLottieAnimListener;
import o.setLottieClicklistener;
import o.ulsya;
import o.xkz1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ReducedIntFieldDirective<Target> implements setLottieClicklistener<Target> {
    private final int IAuthTabCallback;
    private final int onExtraCallbackWithResult;
    private final setLottieAnimListener<Target, Integer> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public ReducedIntFieldDirective(@NotNull setLottieAnimListener<? super Target, Integer> setlottieanimlistener, int i, int i2) {
        Intrinsics.checkNotNullParameter(setlottieanimlistener, "");
        this.onWarmupCompleted = setlottieanimlistener;
        this.onExtraCallbackWithResult = i;
        this.IAuthTabCallback = i2;
    }

    @Override // o.setLottieClicklistener
    public final setLottieAnimListener<Target, Integer> onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    @Override // o.setLottieClicklistener
    public ltlud<Target> onWarmupCompleted() {
        return new ReducedIntFormatterStructure(new ReducedIntFieldDirective$formatter$1(this.onWarmupCompleted.onExtraCallback()), this.onExtraCallbackWithResult, this.IAuthTabCallback);
    }

    @Override // o.setLottieClicklistener
    public ulsya<Target> onExtraCallback() {
        return xkz1.onExtraCallback(this.onExtraCallbackWithResult, this.IAuthTabCallback, this.onWarmupCompleted.onExtraCallback(), this.onWarmupCompleted.IAuthTabCallback());
    }
}
