package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isBackgroundRunning$IAuthTabCallback$onExtraCallback {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final int IAuthTabCallback;
    private final long onExtraCallback;
    private final int onWarmupCompleted;

    public /* synthetic */ isBackgroundRunning$IAuthTabCallback$onExtraCallback(int i, int i2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 91;
            onNavigationEvent = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof isBackgroundRunning$IAuthTabCallback$onExtraCallback)) {
            int i6 = i2 + 3;
            onNavigationEvent = i6 % 128;
            return i6 % 2 == 0;
        }
        isBackgroundRunning$IAuthTabCallback$onExtraCallback isbackgroundrunning_iauthtabcallback_onextracallback = (isBackgroundRunning$IAuthTabCallback$onExtraCallback) obj;
        if (this.IAuthTabCallback != isbackgroundrunning_iauthtabcallback_onextracallback.IAuthTabCallback) {
            return false;
        }
        if (this.onWarmupCompleted != isbackgroundrunning_iauthtabcallback_onextracallback.onWarmupCompleted) {
            int i7 = i2 + 109;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (setUseCaseAttached.onWarmupCompleted(this.onExtraCallback, isbackgroundrunning_iauthtabcallback_onextracallback.onExtraCallback)) {
            return true;
        }
        int i9 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i9 % 128;
        return i9 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        return i2 % 2 == 0 ? (((r0 * 83) * Integer.hashCode(this.onWarmupCompleted)) - 114) << setUseCaseAttached.IAuthTabCallbackStub(this.onExtraCallback) : (((Integer.hashCode(this.IAuthTabCallback) * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + setUseCaseAttached.IAuthTabCallbackStub(this.onExtraCallback);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IconSized(width=" + this.IAuthTabCallback + ", height=" + this.onWarmupCompleted + ", positionInWindow=" + setUseCaseAttached.IAuthTabCallbackDefault(this.onExtraCallback) + ")";
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private isBackgroundRunning$IAuthTabCallback$onExtraCallback(int i, int i2, long j) {
        this.IAuthTabCallback = i;
        this.onWarmupCompleted = i2;
        this.onExtraCallback = j;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i3 + 73;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i3 + 5;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final long IAuthTabCallback() {
        long j;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 9;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.onExtraCallback;
            int i4 = 14 / 0;
        } else {
            j = this.onExtraCallback;
        }
        int i5 = i2 + 9;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
