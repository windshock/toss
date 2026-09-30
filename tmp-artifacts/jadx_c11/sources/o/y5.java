package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y5 {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private final long IAuthTabCallback;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public /* synthetic */ y5(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }

    private y5(long j, long j2, long j3, long j4, long j5) {
        this.onWarmupCompleted = j;
        this.onExtraCallback = j2;
        this.onExtraCallbackWithResult = j3;
        this.onNavigationEvent = j4;
        this.IAuthTabCallback = j5;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 77;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallback;
        int i5 = i2 + 9;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallbackWithResult;
        int i5 = i3 + 71;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        long j = this.onNavigationEvent;
        int i5 = i3 + 41;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        int i3 = 86 / 0;
        return this.IAuthTabCallback;
    }
}
