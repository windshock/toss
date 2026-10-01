package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CarouselKtExternalSyntheticLambda14;
import o.getWriteSuccessCountokhttp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getWriteSuccessCountokhttp {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Function1<CarouselKtExternalSyntheticLambda14.onNavigationEvent, Unit> onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public getWriteSuccessCountokhttp() {
        Function1 function1 = null;
        this(function1, 1, function1);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CarouselKtExternalSyntheticLambda14.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(onnavigationevent);
        int i4 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public getWriteSuccessCountokhttp(@NotNull Function1<? super CarouselKtExternalSyntheticLambda14.onNavigationEvent, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onWarmupCompleted = function1;
    }

    public /* synthetic */ getWriteSuccessCountokhttp(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.coil.TdsCoilOptions$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 25;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnWarmupCompleted = getWriteSuccessCountokhttp.onWarmupCompleted((CarouselKtExternalSyntheticLambda14.onNavigationEvent) obj);
                    int i5 = onExtraCallbackWithResult + 25;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            };
            int i2 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this(function1);
    }

    private static final Unit onNavigationEvent(CarouselKtExternalSyntheticLambda14.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        int i3 = 57 / 0;
        return Unit.INSTANCE;
    }

    public final Function1<CarouselKtExternalSyntheticLambda14.onNavigationEvent, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }
}
