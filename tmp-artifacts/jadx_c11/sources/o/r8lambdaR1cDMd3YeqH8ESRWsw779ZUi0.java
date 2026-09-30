package o;

import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class r8lambdaR1cDMd3YeqH8ESRWsw779ZUi0 implements getTitleMarginEnd {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    public static final r8lambdaR1cDMd3YeqH8ESRWsw779ZUi0 onExtraCallbackWithResult = new r8lambdaR1cDMd3YeqH8ESRWsw779ZUi0();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 121;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private r8lambdaR1cDMd3YeqH8ESRWsw779ZUi0() {
    }

    public modifyFpsForPreviewOnlyRepeating onWarmupCompleted(@NotNull Camera2CapturePipelineTorchTaskExternalSyntheticLambda1 camera2CapturePipelineTorchTaskExternalSyntheticLambda1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda1, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        int i2 = onWarmupCompleted + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return onwarmupcompleted;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 103;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (Intrinsics.areEqual(r8lambdaR1cDMd3YeqH8ESRWsw779ZUi0.class, obj != null ? obj.getClass() : null)) {
            return true;
        }
        int i7 = IAuthTabCallback + 115;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = r8lambdaR1cDMd3YeqH8ESRWsw779ZUi0.class.hashCode();
            int i3 = 54 / 0;
        } else {
            iHashCode = r8lambdaR1cDMd3YeqH8ESRWsw779ZUi0.class.hashCode();
        }
        int i4 = onWarmupCompleted + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    static final class onWarmupCompleted extends QuirksExternalSyntheticBackport0.onWarmupCompleted implements completePendingScreenFlashClear {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public void onExtraCallbackWithResult(@NotNull setIso setiso) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(setiso, "");
                setiso.onWarmupCompleted();
                int i3 = 86 / 0;
            } else {
                Intrinsics.checkNotNullParameter(setiso, "");
                setiso.onWarmupCompleted();
            }
            int i4 = onWarmupCompleted + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
