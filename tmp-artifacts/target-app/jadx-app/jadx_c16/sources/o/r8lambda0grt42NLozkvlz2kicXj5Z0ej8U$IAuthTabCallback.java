package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$IAuthTabCallback {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final boolean onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final int onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 27;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$IAuthTabCallback)) {
            return false;
        }
        r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$IAuthTabCallback r8lambda0grt42nlozkvlz2kicxj5z0ej8u_iauthtabcallback = (r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$IAuthTabCallback) obj;
        if (this.onExtraCallback != r8lambda0grt42nlozkvlz2kicxj5z0ej8u_iauthtabcallback.onExtraCallback) {
            int i6 = i4 + 101;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.onNavigationEvent != r8lambda0grt42nlozkvlz2kicxj5z0ej8u_iauthtabcallback.onNavigationEvent) {
            return false;
        }
        if (this.onExtraCallbackWithResult == r8lambda0grt42nlozkvlz2kicxj5z0ej8u_iauthtabcallback.onExtraCallbackWithResult) {
            return true;
        }
        int i8 = i2 + 23;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 == 0 ? (((r0 + 54) / Integer.hashCode(this.onNavigationEvent)) - 57) % Boolean.hashCode(this.onExtraCallbackWithResult) : (((Boolean.hashCode(this.onExtraCallback) * 31) + Integer.hashCode(this.onNavigationEvent)) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Decision(didCrash=" + this.onExtraCallback + ", crashCountBeforeIncrement=" + this.onNavigationEvent + ", shouldRecover=" + this.onExtraCallbackWithResult + ")";
        int i2 = onWarmupCompleted + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$IAuthTabCallback(boolean z, int i, boolean z2) {
        this.onExtraCallback = z;
        this.onNavigationEvent = i;
        this.onExtraCallbackWithResult = z2;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallbackWithResult;
        int i5 = i2 + 77;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
