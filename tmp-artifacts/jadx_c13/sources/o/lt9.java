package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class lt9<Target> implements setLottieClicklistener<Target> {
    private final int IAuthTabCallback;
    private final Integer onExtraCallback;
    private final ltlt<Target> onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public lt9(@NotNull ltlt<? super Target> ltltVar, int i, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(ltltVar, "");
        this.onExtraCallbackWithResult = ltltVar;
        this.IAuthTabCallback = i;
        this.onExtraCallback = num;
        int iIAuthTabCallbackStub = ltltVar.IAuthTabCallbackStub();
        this.onWarmupCompleted = iIAuthTabCallbackStub;
        if (i < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i + ") is negative").toString());
        }
        if (iIAuthTabCallbackStub < i) {
            throw new IllegalArgumentException(("The maximum number of digits (" + iIAuthTabCallbackStub + ") is less than the minimum number of digits (" + i + ')').toString());
        }
        if (num == null || num.intValue() > i) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i + ')').toString());
    }

    @Override // o.setLottieClicklistener
    public /* synthetic */ setLottieAnimListener onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<Target, Integer> {
        onWarmupCompleted(Object obj) {
            super(1, obj, jw4.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Target target) {
            return (Integer) ((jw4) this.receiver).onExtraCallback(target);
        }
    }

    @Override // o.setLottieClicklistener
    public ltlud<Target> onWarmupCompleted() {
        addPauseListener addpauselistener = new addPauseListener(new onWarmupCompleted(this.onExtraCallbackWithResult.onExtraCallback()), this.IAuthTabCallback);
        Integer num = this.onExtraCallback;
        return num != null ? new removeAllListeners(addpauselistener, num.intValue()) : addpauselistener;
    }

    @Override // o.setLottieClicklistener
    public ulsya<Target> onExtraCallback() {
        return xkz1.onNavigationEvent(Integer.valueOf(this.IAuthTabCallback), Integer.valueOf(this.onWarmupCompleted), this.onExtraCallback, this.onExtraCallbackWithResult.onExtraCallback(), this.onExtraCallbackWithResult.IAuthTabCallback(), false, 32, null);
    }
}
