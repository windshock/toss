package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class initViewPager {
    private static int asBinder = 1;
    private static int onTransact;
    private final float IAuthTabCallback;
    private final float onExtraCallback;
    private final float onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public initViewPager() {
        this(0.0f, 0.0f, 0.0f, 0L, 0L, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = onTransact + 81;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof initViewPager)) {
            int i5 = onTransact + 31;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        initViewPager initviewpager = (initViewPager) obj;
        if (Float.compare(this.onExtraCallback, initviewpager.onExtraCallback) != 0 || Float.compare(this.onExtraCallbackWithResult, initviewpager.onExtraCallbackWithResult) != 0) {
            return false;
        }
        if (Float.compare(this.IAuthTabCallback, initviewpager.IAuthTabCallback) == 0) {
            return this.onNavigationEvent == initviewpager.onNavigationEvent && this.onWarmupCompleted == initviewpager.onWarmupCompleted;
        }
        int i6 = onTransact + 33;
        asBinder = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = onTransact + 115;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((Float.hashCode(this.onExtraCallback) * 31) + Float.hashCode(this.onExtraCallbackWithResult)) * 31) + Float.hashCode(this.IAuthTabCallback)) * 31) + Long.hashCode(this.onNavigationEvent)) * 31) + Long.hashCode(this.onWarmupCompleted);
        int i5 = onTransact + 101;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "NativeAdsOmSdkVisibilityConfig(hairlineVisibleRatio=" + this.onExtraCallback + ", vimpVisibleRatio=" + this.onExtraCallbackWithResult + ", completeVisibleRatio=" + this.IAuthTabCallback + ", vimpDurationMs=" + this.onNavigationEvent + ", checkIntervalMs=" + this.onWarmupCompleted + ")";
        int i3 = onTransact + 87;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public initViewPager(float f, float f2, float f3, long j, long j2) {
        this.onExtraCallback = f;
        this.onExtraCallbackWithResult = f2;
        this.IAuthTabCallback = f3;
        this.onNavigationEvent = j;
        this.onWarmupCompleted = j2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ initViewPager(float f, float f2, float f3, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = asBinder + 41;
            onTransact = i3 % 128;
            f = i3 % 2 != 0 ? 1.0f : 0.0f;
        }
        if ((i2 & 2) != 0) {
            int i4 = onTransact + 45;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            f2 = 0.5f;
        }
        float f4 = f2;
        Object obj = null;
        if ((i2 & 4) != 0) {
            int i6 = asBinder + 35;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            int i7 = 2 % 2;
            f3 = 0.98f;
        }
        float f5 = f3;
        if ((i2 & 8) != 0) {
            int i8 = onTransact + 119;
            asBinder = i8 % 128;
            if (i8 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            j = 1000;
        }
        long j3 = j;
        if ((i2 & 16) != 0) {
            int i9 = asBinder + 101;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            j2 = 200;
        }
        this(f, f4, f5, j3, j2);
    }

    public final float IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 3;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        float f = this.onExtraCallback;
        int i6 = i3 + 39;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return f;
    }

    public final float onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = asBinder + 55;
        int i4 = i3 % 128;
        onTransact = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.onExtraCallbackWithResult;
        int i5 = i4 + 65;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return f;
    }

    public final float onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = onTransact + 17;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        long j = this.onNavigationEvent;
        int i6 = i3 + 71;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 19;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.onWarmupCompleted;
        int i5 = i3 + 99;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
