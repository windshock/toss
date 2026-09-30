package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.Futures3;
import o.TimeoutCompanionNONE1;
import o.setMinFrame;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setMinFrame {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static /* synthetic */ Unit IAuthTabCallback(hostOnly hostonly, Futures3 futures3) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(hostonly, futures3);
        if (i4 == 0) {
            int i5 = 29 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit onNavigationEvent(hostOnly hostonly, Futures3 futures3) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        Object[] objArr = {hostonly, FuturesCallbackListener.IAuthTabCallback(futures3)};
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        hostOnly.onExtraCallbackWithResult(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr, iOnWarmupCompleted, 505496891, -505496889, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallback + 67;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return unit;
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final hostOnly hostonly) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(hostonly, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0, new Function1() { // from class: im.toss.compose.widget.gl.ImageBlurSourceModifierKt$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Unit unitIAuthTabCallback = setMinFrame.IAuthTabCallback(hostonly, (Futures3) obj);
                int i6 = onNavigationEvent + 41;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }).onExtraCallback(new setRenderMode(hostonly));
        int i3 = onExtraCallback + 85;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
