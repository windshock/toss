package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.getLoadingListenerWrappers;
import o.setIso;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getLoadingListenerWrappers extends IoConfigBuilder implements completePendingScreenFlashClear {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final shouldAlwaysRewardUser IAuthTabCallback;
    private final isAdShowing onWarmupCompleted;

    public static /* synthetic */ Unit onNavigationEvent(isAdShowing isadshowing, setIso setiso) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(isadshowing, setiso);
        }
        onExtraCallbackWithResult(isadshowing, setiso);
        throw null;
    }

    public getLoadingListenerWrappers(boolean z, boolean z2, @NotNull Camera2CapturePipelineTorchTaskExternalSyntheticLambda1 camera2CapturePipelineTorchTaskExternalSyntheticLambda1, @NotNull skipBytes skipbytes, @Nullable toMetersPerSecond tometerspersecond, @NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, @Nullable getConfiguration<Float> getconfiguration, @Nullable getCachingExecutorService getcachingexecutorservice) {
        isAdShowing isadshowing;
        Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(skipbytes, "");
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda02, "");
        shouldAlwaysRewardUser shouldalwaysrewarduser = null;
        if (z) {
            isadshowing = (isAdShowing) IAuthTabCallback(new isAdShowing(camera2CapturePipelineTorchTaskExternalSyntheticLambda1, skipbytes, tometerspersecond, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02));
            int i = onExtraCallbackWithResult + 85;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } else {
            isadshowing = null;
        }
        this.onWarmupCompleted = isadshowing;
        if (z2) {
            shouldalwaysrewarduser = (shouldAlwaysRewardUser) IAuthTabCallback(new shouldAlwaysRewardUser(camera2CapturePipelineTorchTaskExternalSyntheticLambda1, getconfiguration, getcachingexecutorservice));
            int i3 = 2 % 2;
        }
        this.IAuthTabCallback = shouldalwaysrewarduser;
        int i4 = onExtraCallback + 25;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(isAdShowing isadshowing, setIso setiso) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        isadshowing.onExtraCallbackWithResult(setiso);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public void onExtraCallbackWithResult(@NotNull setIso setiso) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        final isAdShowing isadshowing = this.onWarmupCompleted;
        shouldAlwaysRewardUser shouldalwaysrewarduser = this.IAuthTabCallback;
        getInlineAdaptiveAdViewMaximumHeight getinlineadaptiveadviewmaximumheight = isadshowing != null ? new getInlineAdaptiveAdViewMaximumHeight(setiso, new Function1() { // from class: im.toss.tds.compose.foundation.TdsIndicationNode$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                Unit unitOnNavigationEvent;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 109;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    unitOnNavigationEvent = getLoadingListenerWrappers.onNavigationEvent(isadshowing, (setIso) obj);
                    int i4 = 49 / 0;
                } else {
                    unitOnNavigationEvent = getLoadingListenerWrappers.onNavigationEvent(isadshowing, (setIso) obj);
                }
                int i5 = IAuthTabCallback + 3;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        }) : new getInlineAdaptiveAdViewMaximumHeight(setiso, null, 2, null);
        if (shouldalwaysrewarduser != null) {
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            shouldalwaysrewarduser.onExtraCallbackWithResult(getinlineadaptiveadviewmaximumheight);
            return;
        }
        setiso.onWarmupCompleted();
        if (isadshowing != null) {
            isadshowing.onExtraCallbackWithResult(setiso);
            int i4 = onExtraCallback + 93;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = onExtraCallback + 75;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }
}
