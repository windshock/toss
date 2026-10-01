package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class writeSuccessCount {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final double onExtraCallback;
    private final double onExtraCallbackWithResult;
    private final double onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof writeSuccessCount)) {
            int i2 = onNavigationEvent + 91;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        writeSuccessCount writesuccesscount = (writeSuccessCount) obj;
        if (Double.compare(this.onExtraCallback, writesuccesscount.onExtraCallback) != 0) {
            return false;
        }
        if (Double.compare(this.onExtraCallbackWithResult, writesuccesscount.onExtraCallbackWithResult) == 0) {
            if (Double.compare(this.onWarmupCompleted, writesuccesscount.onWarmupCompleted) == 0) {
                return true;
            }
            int i3 = onNavigationEvent + 59;
            IAuthTabCallback = i3 % 128;
            return i3 % 2 != 0;
        }
        int i4 = onNavigationEvent + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Double.hashCode(this.onExtraCallback) * 31) + Double.hashCode(this.onExtraCallbackWithResult)) * 31) + Double.hashCode(this.onWarmupCompleted);
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Oklab(lightness=" + this.onExtraCallback + ", a=" + this.onExtraCallbackWithResult + ", b=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public writeSuccessCount(double d, double d2, double d3) {
        this.onExtraCallback = d;
        this.onExtraCallbackWithResult = d2;
        this.onWarmupCompleted = d3;
    }

    public final double IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        double d = this.onExtraCallbackWithResult;
        int i5 = i2 + 73;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return d;
        }
        throw null;
    }

    public final double onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        double d = this.onWarmupCompleted;
        int i5 = i2 + 101;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }
}
