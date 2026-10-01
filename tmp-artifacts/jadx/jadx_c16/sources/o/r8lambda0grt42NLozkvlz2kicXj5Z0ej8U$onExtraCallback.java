package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$onExtraCallback {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private final boolean IAuthTabCallback;
    private final Integer onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final int onWarmupCompleted;

    public r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$onExtraCallback() {
        this(0, 0L, 0L, null, false, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$onExtraCallback)) {
            return false;
        }
        r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$onExtraCallback r8lambda0grt42nlozkvlz2kicxj5z0ej8u_onextracallback = (r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$onExtraCallback) obj;
        if (this.onWarmupCompleted != r8lambda0grt42nlozkvlz2kicxj5z0ej8u_onextracallback.onWarmupCompleted) {
            int i2 = IAuthTabCallbackStub + 41;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.onNavigationEvent != r8lambda0grt42nlozkvlz2kicxj5z0ej8u_onextracallback.onNavigationEvent) {
            int i4 = IAuthTabCallbackStub + 25;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.onExtraCallbackWithResult != r8lambda0grt42nlozkvlz2kicxj5z0ej8u_onextracallback.onExtraCallbackWithResult) {
            int i6 = IAuthTabCallbackDefault + 15;
            IAuthTabCallbackStub = i6 % 128;
            return i6 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, r8lambda0grt42nlozkvlz2kicxj5z0ej8u_onextracallback.onExtraCallback)) {
            return this.IAuthTabCallback == r8lambda0grt42nlozkvlz2kicxj5z0ej8u_onextracallback.IAuthTabCallback;
        }
        int i7 = IAuthTabCallbackDefault + 125;
        IAuthTabCallbackStub = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Integer.hashCode(this.onWarmupCompleted);
        int iHashCode3 = Long.hashCode(this.onNavigationEvent);
        int iHashCode4 = Long.hashCode(this.onExtraCallbackWithResult);
        Integer num = this.onExtraCallback;
        if (num == null) {
            int i4 = IAuthTabCallbackDefault + 9;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        int iHashCode5 = (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + Boolean.hashCode(this.IAuthTabCallback);
        int i6 = IAuthTabCallbackStub + 47;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 22 / 0;
        }
        return iHashCode5;
    }

    public final r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$onExtraCallback onWarmupCompleted(int i, long j, long j2, @Nullable Integer num, boolean z) {
        int i2 = 2 % 2;
        r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$onExtraCallback r8lambda0grt42nlozkvlz2kicxj5z0ej8u_onextracallback = new r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$onExtraCallback(i, j, j2, num, z);
        int i3 = IAuthTabCallbackDefault + 47;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return r8lambda0grt42nlozkvlz2kicxj5z0ej8u_onextracallback;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CrashRecord(count=" + this.onWarmupCompleted + ", windowStart=" + this.onNavigationEvent + ", lastTime=" + this.onExtraCallbackWithResult + ", lastRenderer=" + this.onExtraCallback + ", lastShouldRecover=" + this.IAuthTabCallback + ")";
        int i2 = IAuthTabCallbackDefault + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$onExtraCallback(int i, long j, long j2, @Nullable Integer num, boolean z) {
        this.onWarmupCompleted = i;
        this.onNavigationEvent = j;
        this.onExtraCallbackWithResult = j2;
        this.onExtraCallback = num;
        this.IAuthTabCallback = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambda0grt42NLozkvlz2kicXj5Z0ej8U$onExtraCallback(int i, long j, long j2, Integer num, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = IAuthTabCallbackStub + 63;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            i = 0;
        }
        long j3 = 0;
        if ((i2 & 2) != 0) {
            int i6 = IAuthTabCallbackStub + 29;
            IAuthTabCallbackDefault = i6 % 128;
            j = i6 % 2 == 0 ? 1L : 0L;
            int i7 = 2 % 2;
        }
        long j4 = j;
        if ((i2 & 4) != 0) {
            int i8 = IAuthTabCallbackStub + 11;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
        } else {
            j3 = j2;
        }
        Integer num2 = (i2 & 8) != 0 ? null : num;
        if ((i2 & 16) != 0) {
            int i10 = IAuthTabCallbackDefault + 123;
            IAuthTabCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        }
        this(i, j4, j3, num2, z);
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i3 + 7;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 21;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.onNavigationEvent;
        int i4 = i2 + 37;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final Integer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 59;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.onExtraCallback;
        int i5 = i2 + 95;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final boolean onExtraCallback() {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 35;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.IAuthTabCallback;
            int i4 = 13 / 0;
        } else {
            z = this.IAuthTabCallback;
        }
        int i5 = i2 + 23;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return z;
    }
}
