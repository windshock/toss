package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdalzLoST8ymKYgG6aEHcG97m8xISw {
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder;
    private final String IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private final long asInterface;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final String onTransact;
    private final q7 onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asBinder + 71;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdalzLoST8ymKYgG6aEHcG97m8xISw)) {
            int i4 = IAuthTabCallback_Parcel + 115;
            asBinder = i4 % 128;
            return i4 % 2 != 0;
        }
        r8lambdalzLoST8ymKYgG6aEHcG97m8xISw r8lambdalzlost8ymkygg6aehcg97m8xisw = (r8lambdalzLoST8ymKYgG6aEHcG97m8xISw) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, r8lambdalzlost8ymkygg6aehcg97m8xisw.onWarmupCompleted)) {
            int i5 = asBinder + 11;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.onNavigationEvent != r8lambdalzlost8ymkygg6aehcg97m8xisw.onNavigationEvent) {
            return false;
        }
        if (this.asInterface != r8lambdalzlost8ymkygg6aehcg97m8xisw.asInterface) {
            int i7 = asBinder + 107;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.onExtraCallbackWithResult != r8lambdalzlost8ymkygg6aehcg97m8xisw.onExtraCallbackWithResult) {
            return false;
        }
        if (this.IAuthTabCallbackDefault != r8lambdalzlost8ymkygg6aehcg97m8xisw.IAuthTabCallbackDefault) {
            int i9 = IAuthTabCallback_Parcel + 83;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.onExtraCallback != r8lambdalzlost8ymkygg6aehcg97m8xisw.onExtraCallback || !Intrinsics.areEqual(this.IAuthTabCallback, r8lambdalzlost8ymkygg6aehcg97m8xisw.IAuthTabCallback) || !Intrinsics.areEqual(this.onTransact, r8lambdalzlost8ymkygg6aehcg97m8xisw.onTransact)) {
            return false;
        }
        if (this.IAuthTabCallbackStub == r8lambdalzlost8ymkygg6aehcg97m8xisw.IAuthTabCallbackStub) {
            return true;
        }
        int i11 = IAuthTabCallback_Parcel + 25;
        asBinder = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((this.onWarmupCompleted.hashCode() * 31) + Long.hashCode(this.onNavigationEvent)) * 31) + Long.hashCode(this.asInterface)) * 31) + Long.hashCode(this.onExtraCallbackWithResult)) * 31) + Long.hashCode(this.IAuthTabCallbackDefault)) * 31) + Long.hashCode(this.onExtraCallback)) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + Boolean.hashCode(this.IAuthTabCallbackStub);
        int i4 = IAuthTabCallback_Parcel + 99;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MonitoringSummarySnapshot(key=" + this.onWarmupCompleted + ", attemptCount=" + this.onNavigationEvent + ", successCount=" + this.asInterface + ", failureCount=" + this.onExtraCallbackWithResult + ", slowSuccessCount=" + this.IAuthTabCallbackDefault + ", maxLatencyMillis=" + this.onExtraCallback + ", flushReason=" + this.IAuthTabCallback + ", summaryWindowBucket=" + this.onTransact + ", overflowed=" + this.IAuthTabCallbackStub + ")";
        int i2 = IAuthTabCallback_Parcel + 125;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public r8lambdalzLoST8ymKYgG6aEHcG97m8xISw(@NotNull q7 q7Var, long j, long j2, long j3, long j4, long j5, @NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(q7Var, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onWarmupCompleted = q7Var;
        this.onNavigationEvent = j;
        this.asInterface = j2;
        this.onExtraCallbackWithResult = j3;
        this.IAuthTabCallbackDefault = j4;
        this.onExtraCallback = j5;
        this.IAuthTabCallback = str;
        this.onTransact = str2;
        this.IAuthTabCallbackStub = z;
    }

    public final q7 onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        q7 q7Var = this.onWarmupCompleted;
        int i5 = i3 + 75;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return q7Var;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        int i3 = 18 / 0;
        return this.onNavigationEvent;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = this.asInterface;
        int i4 = i3 + 55;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallbackWithResult;
        int i5 = i3 + 29;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallback;
        int i5 = i3 + 59;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.IAuthTabCallback;
        int i4 = i3 + 55;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 13;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.onTransact;
        int i4 = i2 + 23;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 1;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.IAuthTabCallbackStub;
        int i4 = i3 + 65;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }
}
