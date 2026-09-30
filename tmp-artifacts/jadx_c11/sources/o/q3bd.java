package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q3bd {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private final int IAuthTabCallback;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 31;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3bd)) {
            return false;
        }
        q3bd q3bdVar = (q3bd) obj;
        if (this.onExtraCallback != q3bdVar.onExtraCallback) {
            int i6 = i4 + 23;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.onExtraCallbackWithResult != q3bdVar.onExtraCallbackWithResult) {
            int i8 = i2 + 123;
            asBinder = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this.onNavigationEvent != q3bdVar.onNavigationEvent) {
            int i9 = i2 + 101;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.IAuthTabCallback != q3bdVar.IAuthTabCallback) {
            return false;
        }
        if (this.onWarmupCompleted == q3bdVar.onWarmupCompleted) {
            return true;
        }
        int i11 = i2 + 23;
        asBinder = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Integer.hashCode(this.onExtraCallback) * 31) + Integer.hashCode(this.onExtraCallbackWithResult)) * 31) + Integer.hashCode(this.onNavigationEvent)) * 31) + Integer.hashCode(this.IAuthTabCallback)) * 31) + Integer.hashCode(this.onWarmupCompleted);
        int i4 = IAuthTabCallbackDefault + 55;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TelemetryCounterSnapshot(producedCount=" + this.onExtraCallback + ", enqueueSuccessCount=" + this.onExtraCallbackWithResult + ", enqueueFailureCount=" + this.onNavigationEvent + ", flushSuccessCount=" + this.IAuthTabCallback + ", flushFailureCount=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallbackDefault + 113;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public q3bd(int i, int i2, int i3, int i4, int i5) {
        this.onExtraCallback = i;
        this.onExtraCallbackWithResult = i2;
        this.onNavigationEvent = i3;
        this.IAuthTabCallback = i4;
        this.onWarmupCompleted = i5;
    }

    public final int onExtraCallbackWithResult() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 33;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.onExtraCallback;
            int i5 = 43 / 0;
        } else {
            i = this.onExtraCallback;
        }
        int i6 = i3 + 121;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i3 + 117;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 61;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i2 + 61;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final int onWarmupCompleted() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 95;
        int i4 = i3 % 128;
        asBinder = i4;
        if (i3 % 2 != 0) {
            i = this.onWarmupCompleted;
            int i5 = 38 / 0;
        } else {
            i = this.onWarmupCompleted;
        }
        int i6 = i4 + 27;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        if (this.onExtraCallback != 0 || this.onExtraCallbackWithResult != 0) {
            return false;
        }
        int i2 = IAuthTabCallbackDefault + 87;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.onNavigationEvent != 0) {
            return false;
        }
        int i4 = i3 + 125;
        int i5 = i4 % 128;
        IAuthTabCallbackDefault = i5;
        int i6 = i4 % 2;
        if (this.IAuthTabCallback != 0) {
            return false;
        }
        int i7 = i5 + 87;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        if (this.onWarmupCompleted != 0) {
            return false;
        }
        int i9 = i5 + 5;
        asBinder = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }
}
