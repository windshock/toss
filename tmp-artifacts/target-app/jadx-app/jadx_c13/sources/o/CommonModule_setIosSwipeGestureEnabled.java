package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CommonModule_setIosSwipeGestureEnabled {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final float IAuthTabCallback;
    private final Long onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonModule_setIosSwipeGestureEnabled() {
        this(0.0f, null, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonModule_setIosSwipeGestureEnabled)) {
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        CommonModule_setIosSwipeGestureEnabled commonModule_setIosSwipeGestureEnabled = (CommonModule_setIosSwipeGestureEnabled) obj;
        if (Float.compare(this.IAuthTabCallback, commonModule_setIosSwipeGestureEnabled.IAuthTabCallback) != 0) {
            int i4 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, commonModule_setIosSwipeGestureEnabled.onNavigationEvent)) {
            return true;
        }
        int i5 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = Float.hashCode(this.IAuthTabCallback);
        Long l = this.onNavigationEvent;
        if (l == null) {
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 85;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 47;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 % 3;
            }
            i = 0;
        } else {
            int iHashCode2 = l.hashCode();
            int i8 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExifImageMetadata(rotateDegrees=" + this.IAuthTabCallback + ", creationDate=" + this.onNavigationEvent + ")";
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public CommonModule_setIosSwipeGestureEnabled(float f, @Nullable Long l) {
        this.IAuthTabCallback = f;
        this.onNavigationEvent = l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CommonModule_setIosSwipeGestureEnabled(float f, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            l = null;
        }
        this(f, l);
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        float f = this.IAuthTabCallback;
        int i5 = i3 + 107;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Long l = this.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return l;
    }
}
