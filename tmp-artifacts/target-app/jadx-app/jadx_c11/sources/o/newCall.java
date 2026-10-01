package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ComposableLambdaImplExternalSyntheticLambda7;
import o.newCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class newCall {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final Integer onExtraCallback;
    private final Function1<ComposableLambdaImplExternalSyntheticLambda7.onExtraCallback, Unit> onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public newCall() {
        Integer num = null;
        this(num, num, 3, num);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ComposableLambdaImplExternalSyntheticLambda7.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(onextracallback);
        }
        onWarmupCompleted(onextracallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public newCall(@Nullable Integer num, @NotNull Function1<? super ComposableLambdaImplExternalSyntheticLambda7.onExtraCallback, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallback = num;
        this.onWarmupCompleted = function1;
    }

    public /* synthetic */ newCall(Integer num, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 31;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 13;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 4;
            } else {
                int i7 = 2 % 2;
            }
            num = null;
        }
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.lottie.TdsLottieOptions$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 73;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnExtraCallbackWithResult = newCall.onExtraCallbackWithResult((ComposableLambdaImplExternalSyntheticLambda7.onExtraCallback) obj);
                    int i11 = onExtraCallbackWithResult + 79;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            };
            int i8 = IAuthTabCallback + 113;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
        }
        this(num, function1);
    }

    public final Integer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Integer num = this.onExtraCallback;
        int i5 = i3 + 113;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    private static final Unit onWarmupCompleted(ComposableLambdaImplExternalSyntheticLambda7.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return unit;
    }

    public final Function1<ComposableLambdaImplExternalSyntheticLambda7.onExtraCallback, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 87;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Function1<ComposableLambdaImplExternalSyntheticLambda7.onExtraCallback, Unit> function1 = this.onWarmupCompleted;
        int i5 = i2 + 125;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return function1;
        }
        throw null;
    }
}
