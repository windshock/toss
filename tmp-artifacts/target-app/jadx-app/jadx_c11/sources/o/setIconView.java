package o;

import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class setIconView extends QuirksExternalSyntheticBackport0.onWarmupCompleted implements StreamSpecsCalculatorCompanion {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public int IAuthTabCallback(@NotNull FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, @NotNull FuturesExternalSyntheticLambda2 futuresExternalSyntheticLambda2, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 27;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(futuresExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(futuresExternalSyntheticLambda2, "");
        int iIAuthTabCallback = futuresExternalSyntheticLambda2.IAuthTabCallback(i);
        int i5 = onExtraCallback + 5;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return iIAuthTabCallback;
    }

    public int onWarmupCompleted(@NotNull FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, @NotNull FuturesExternalSyntheticLambda2 futuresExternalSyntheticLambda2, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 113;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(futuresExternalSyntheticLambda3, "");
            Intrinsics.checkNotNullParameter(futuresExternalSyntheticLambda2, "");
            futuresExternalSyntheticLambda2.onWarmupCompleted(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(futuresExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(futuresExternalSyntheticLambda2, "");
        int iOnWarmupCompleted = futuresExternalSyntheticLambda2.onWarmupCompleted(i);
        int i4 = onExtraCallbackWithResult + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return iOnWarmupCompleted;
    }

    public int onExtraCallbackWithResult(@NotNull FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, @NotNull FuturesExternalSyntheticLambda2 futuresExternalSyntheticLambda2, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 17;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(futuresExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(futuresExternalSyntheticLambda2, "");
        int iOnExtraCallbackWithResult = futuresExternalSyntheticLambda2.onExtraCallbackWithResult(i);
        int i5 = onExtraCallbackWithResult + 63;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return iOnExtraCallbackWithResult;
        }
        throw null;
    }

    public int onNavigationEvent(@NotNull FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, @NotNull FuturesExternalSyntheticLambda2 futuresExternalSyntheticLambda2, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 7;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(futuresExternalSyntheticLambda3, "");
            Intrinsics.checkNotNullParameter(futuresExternalSyntheticLambda2, "");
            return futuresExternalSyntheticLambda2.onNavigationEvent(i);
        }
        Intrinsics.checkNotNullParameter(futuresExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(futuresExternalSyntheticLambda2, "");
        int iOnNavigationEvent = futuresExternalSyntheticLambda2.onNavigationEvent(i);
        int i4 = 87 / 0;
        return iOnNavigationEvent;
    }
}
