package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class z3a {
    private static int asBinder = 1;
    private static int asInterface;
    private final long IAuthTabCallback;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public /* synthetic */ z3a(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }

    private z3a(long j, long j2, long j3, long j4, long j5) {
        this.IAuthTabCallback = j;
        this.onNavigationEvent = j2;
        this.onExtraCallbackWithResult = j3;
        this.onExtraCallback = j4;
        this.onWarmupCompleted = j5;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        int i3 = 17 / 0;
        return this.IAuthTabCallback;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 75;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onNavigationEvent;
        int i5 = i2 + 85;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallback;
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
        int i6 = i3 + 25;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 1 / 0;
        }
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
