package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class lt6<Target> implements setLottieClicklistener<Target> {
    private final setLottieAnimListener<Target, Integer> IAuthTabCallback;
    private final Integer onExtraCallback;
    private final Integer onExtraCallbackWithResult;
    private final Integer onNavigationEvent;
    private final Integer onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public lt6(@NotNull setLottieAnimListener<? super Target, Integer> setlottieanimlistener, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(setlottieanimlistener, "");
        this.IAuthTabCallback = setlottieanimlistener;
        this.onNavigationEvent = num;
        this.onExtraCallbackWithResult = num2;
        this.onWarmupCompleted = num3;
        this.onExtraCallback = num4;
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + num + ") is negative").toString());
        }
        if (num2 == null || num == null || num2.intValue() >= num.intValue()) {
            return;
        }
        throw new IllegalArgumentException(("The maximum number of digits (" + num2 + ") is less than the minimum number of digits (" + num + ')').toString());
    }

    @Override // o.setLottieClicklistener
    public final setLottieAnimListener<Target, Integer> onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<Target, Integer> {
        IAuthTabCallback(Object obj) {
            super(1, obj, jw4.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Target target) {
            return (Integer) ((jw4) this.receiver).onExtraCallback(target);
        }
    }

    @Override // o.setLottieClicklistener
    public ltlud<Target> onWarmupCompleted() {
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.IAuthTabCallback.onExtraCallback());
        Integer num = this.onNavigationEvent;
        ltsya1 ltsya1Var = new ltsya1(iAuthTabCallback, num != null ? num.intValue() : 0, this.onExtraCallback);
        Integer num2 = this.onWarmupCompleted;
        return num2 != null ? new removeAllListeners(ltsya1Var, num2.intValue()) : ltsya1Var;
    }

    @Override // o.setLottieClicklistener
    public ulsya<Target> onExtraCallback() {
        return xkz1.onExtraCallbackWithResult(this.onNavigationEvent, this.onExtraCallbackWithResult, this.onWarmupCompleted, this.IAuthTabCallback.onExtraCallback(), this.IAuthTabCallback.IAuthTabCallback(), this.onExtraCallback);
    }
}
