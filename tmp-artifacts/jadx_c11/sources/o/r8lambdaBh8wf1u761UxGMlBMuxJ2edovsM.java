package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM {
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final long IAuthTabCallback;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;

    public /* synthetic */ r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onTransact;
            int i3 = i2 + 29;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 81;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM)) {
            return false;
        }
        r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM r8lambdabh8wf1u761uxgmlbmuxj2edovsm = (r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM) obj;
        if (!setByteOrder.onExtraCallbackWithResult(this.onExtraCallback, r8lambdabh8wf1u761uxgmlbmuxj2edovsm.onExtraCallback)) {
            int i7 = onTransact + 7;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.onExtraCallbackWithResult, r8lambdabh8wf1u761uxgmlbmuxj2edovsm.onExtraCallbackWithResult)) {
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallback, r8lambdabh8wf1u761uxgmlbmuxj2edovsm.IAuthTabCallback)) {
            int i9 = onTransact + 65;
            onWarmupCompleted = i9 % 128;
            return i9 % 2 != 0;
        }
        if (setByteOrder.onExtraCallbackWithResult(this.onNavigationEvent, r8lambdabh8wf1u761uxgmlbmuxj2edovsm.onNavigationEvent)) {
            return true;
        }
        int i10 = onTransact + 97;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onTransact = i2 % 128;
        return i2 % 2 == 0 ? (((((setByteOrder.onTransact(this.onExtraCallback) >>> 69) - setByteOrder.onTransact(this.onExtraCallbackWithResult)) % 53) >> setByteOrder.onTransact(this.IAuthTabCallback)) >>> 90) - setByteOrder.onTransact(this.onNavigationEvent) : (((((setByteOrder.onTransact(this.onExtraCallback) * 31) + setByteOrder.onTransact(this.onExtraCallbackWithResult)) * 31) + setByteOrder.onTransact(this.IAuthTabCallback)) * 31) + setByteOrder.onTransact(this.onNavigationEvent);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CompactIndicatorColors(activeOuter=" + setByteOrder.IAuthTabCallbackDefault(this.onExtraCallback) + ", activeInner=" + setByteOrder.IAuthTabCallbackDefault(this.onExtraCallbackWithResult) + ", completedDot=" + setByteOrder.IAuthTabCallbackDefault(this.IAuthTabCallback) + ", upcomingDot=" + setByteOrder.IAuthTabCallbackDefault(this.onNavigationEvent) + ")";
        int i2 = onTransact + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM(long j, long j2, long j3, long j4) {
        this.onExtraCallback = j;
        this.onExtraCallbackWithResult = j2;
        this.IAuthTabCallback = j3;
        this.onNavigationEvent = j4;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallback;
        int i5 = i3 + 77;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 87;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallbackWithResult;
        int i5 = i2 + 97;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 109;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallback;
        int i5 = i2 + 47;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.onNavigationEvent;
        int i5 = i3 + 125;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
