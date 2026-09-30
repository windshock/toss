package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getAsyncUpdates {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final enableMergePathsForKitKatAndAbove<Float> onExtraCallback;
    private final enableMergePathsForKitKatAndAbove<VirtualCameraControlExternalSyntheticLambda1> onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getAsyncUpdates) {
            getAsyncUpdates getasyncupdates = (getAsyncUpdates) obj;
            return Intrinsics.areEqual(this.onWarmupCompleted, getasyncupdates.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallback, getasyncupdates.onExtraCallback);
        }
        int i2 = IAuthTabCallback;
        int i3 = i2 + 1;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 67;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onWarmupCompleted.hashCode() * 31) + this.onExtraCallback.hashCode();
        int i4 = IAuthTabCallback + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransitionSpec(translateY=" + this.onWarmupCompleted + ", opacity=" + this.onExtraCallback + ")";
        int i2 = IAuthTabCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getAsyncUpdates(@NotNull enableMergePathsForKitKatAndAbove<VirtualCameraControlExternalSyntheticLambda1> enablemergepathsforkitkatandabove, @NotNull enableMergePathsForKitKatAndAbove<Float> enablemergepathsforkitkatandabove2) {
        Intrinsics.checkNotNullParameter(enablemergepathsforkitkatandabove, "");
        Intrinsics.checkNotNullParameter(enablemergepathsforkitkatandabove2, "");
        this.onWarmupCompleted = enablemergepathsforkitkatandabove;
        this.onExtraCallback = enablemergepathsforkitkatandabove2;
    }

    public final enableMergePathsForKitKatAndAbove<VirtualCameraControlExternalSyntheticLambda1> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        enableMergePathsForKitKatAndAbove<VirtualCameraControlExternalSyntheticLambda1> enablemergepathsforkitkatandabove = this.onWarmupCompleted;
        int i5 = i3 + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enablemergepathsforkitkatandabove;
    }

    public final enableMergePathsForKitKatAndAbove<Float> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 113;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        enableMergePathsForKitKatAndAbove<Float> enablemergepathsforkitkatandabove = this.onExtraCallback;
        int i4 = i2 + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return enablemergepathsforkitkatandabove;
    }
}
