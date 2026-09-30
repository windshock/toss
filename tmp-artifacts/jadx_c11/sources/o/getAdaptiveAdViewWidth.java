package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getAdaptiveAdViewWidth {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ QuirksExternalSyntheticBackport0 IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z);
        int i5 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, "");
        if (z) {
            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport0.onExtraCallback(new isInlineAdaptiveAdView(camera2CapturePipelineTorchTaskExternalSyntheticLambda2));
            int i3 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return quirksExternalSyntheticBackport0;
    }
}
