package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class trackResponseokhttp {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final double onExtraCallbackWithResult;
    private final double onNavigationEvent;
    private final double onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 123;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trackResponseokhttp)) {
            int i5 = i2 + 89;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        trackResponseokhttp trackresponseokhttp = (trackResponseokhttp) obj;
        if (Double.compare(this.onExtraCallbackWithResult, trackresponseokhttp.onExtraCallbackWithResult) != 0) {
            int i7 = IAuthTabCallback + 67;
            int i8 = i7 % 128;
            onExtraCallback = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 87;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (Double.compare(this.onNavigationEvent, trackresponseokhttp.onNavigationEvent) != 0) {
            int i11 = onExtraCallback + 71;
            IAuthTabCallback = i11 % 128;
            return i11 % 2 != 0;
        }
        if (Double.compare(this.onWarmupCompleted, trackresponseokhttp.onWarmupCompleted) != 0) {
            return false;
        }
        int i12 = onExtraCallback + 53;
        IAuthTabCallback = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 54 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Double.hashCode(this.onExtraCallbackWithResult) * 31) + Double.hashCode(this.onNavigationEvent)) * 31) + Double.hashCode(this.onWarmupCompleted);
        int i4 = onExtraCallback + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LinearRgb(r=" + this.onExtraCallbackWithResult + ", g=" + this.onNavigationEvent + ", b=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public trackResponseokhttp(double d, double d2, double d3) {
        this.onExtraCallbackWithResult = d;
        this.onNavigationEvent = d2;
        this.onWarmupCompleted = d3;
    }

    public final double onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        double d = this.onExtraCallbackWithResult;
        int i5 = i3 + 87;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        double d = this.onNavigationEvent;
        int i5 = i2 + 91;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    public final double onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        double d = this.onWarmupCompleted;
        int i5 = i3 + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    public final boolean IAuthTabCallback() {
        double d;
        int i = 2 % 2;
        double d2 = this.onExtraCallbackWithResult;
        if (0.0d > d2) {
            return false;
        }
        int i2 = onExtraCallback;
        int i3 = i2 + 103;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            if (d2 > 0.0d) {
                return false;
            }
        } else if (d2 > 1.0d) {
            return false;
        }
        double d3 = this.onNavigationEvent;
        if (0.0d > d3 || d3 > 1.0d) {
            return false;
        }
        int i4 = i2 + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            d = this.onWarmupCompleted;
            if (0.0d > d) {
                return false;
            }
        } else {
            d = this.onWarmupCompleted;
            if (0.0d > d) {
                return false;
            }
        }
        if (d > 1.0d) {
            return false;
        }
        int i5 = i2 + 9;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }
}
