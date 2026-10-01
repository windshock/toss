package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableMergePathsForKitKatAndAbove<T> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final updateFocusedState<T> IAuthTabCallback;
    private final T onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enableMergePathsForKitKatAndAbove)) {
            int i2 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        enableMergePathsForKitKatAndAbove enablemergepathsforkitkatandabove = (enableMergePathsForKitKatAndAbove) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, enablemergepathsforkitkatandabove.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, enablemergepathsforkitkatandabove.IAuthTabCallback)) {
            int i4 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 27 / 0;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        T t = this.onWarmupCompleted;
        if (t == null) {
            int i5 = i3 + 125;
            onNavigationEvent = i5 % 128;
            iHashCode = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = t.hashCode();
        }
        return (iHashCode * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MotionSpec(targetValue=" + this.onWarmupCompleted + ", spec=" + this.IAuthTabCallback + ")";
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public enableMergePathsForKitKatAndAbove(T t, @NotNull updateFocusedState<T> updatefocusedstate) {
        Intrinsics.checkNotNullParameter(updatefocusedstate, "");
        this.onWarmupCompleted = t;
        this.IAuthTabCallback = updatefocusedstate;
    }

    public final T onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        T t = this.onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return t;
    }

    public final updateFocusedState<T> onWarmupCompleted() {
        updateFocusedState<T> updatefocusedstate;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 97;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            updatefocusedstate = this.IAuthTabCallback;
            int i4 = 36 / 0;
        } else {
            updatefocusedstate = this.IAuthTabCallback;
        }
        int i5 = i2 + 9;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return updatefocusedstate;
    }
}
