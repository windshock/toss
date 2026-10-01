package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y1ExternalSyntheticLambda8 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static final float onExtraCallbackWithResult(@NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        float fIAuthTabCallback = deviceQuirksExternalSyntheticLambda0.IAuthTabCallback();
        int i4 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return fIAuthTabCallback;
        }
        throw null;
    }

    public static final float onWarmupCompleted(@NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            deviceQuirksExternalSyntheticLambda0.onExtraCallback();
            throw null;
        }
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        float fOnExtraCallback = deviceQuirksExternalSyntheticLambda0.onExtraCallback();
        int i3 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 27 / 0;
        }
        return fOnExtraCallback;
    }

    public static final float onExtraCallback(@NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        float fOnNavigationEvent = deviceQuirksExternalSyntheticLambda0.onNavigationEvent(ExtensionsManagerExtensionsAvailability.Ltr);
        int i4 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    public static final float onNavigationEvent(@NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0) {
        float fOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            fOnExtraCallbackWithResult = deviceQuirksExternalSyntheticLambda0.onExtraCallbackWithResult(ExtensionsManagerExtensionsAvailability.Ltr);
            int i3 = 36 / 0;
        } else {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            fOnExtraCallbackWithResult = deviceQuirksExternalSyntheticLambda0.onExtraCallbackWithResult(ExtensionsManagerExtensionsAvailability.Ltr);
        }
        int i4 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return fOnExtraCallbackWithResult;
    }
}
