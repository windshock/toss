package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class z5a {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private final long IAuthTabCallback;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public /* synthetic */ z5a(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }

    private z5a(long j, long j2, long j3, long j4, long j5) {
        this.onNavigationEvent = j;
        this.onExtraCallback = j2;
        this.onExtraCallbackWithResult = j3;
        this.onWarmupCompleted = j4;
        this.IAuthTabCallback = j5;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        long j = this.onNavigationEvent;
        int i5 = i3 + 107;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallbackWithResult;
        int i5 = i3 + 107;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 79;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = this.IAuthTabCallback;
        int i4 = i2 + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }
}
