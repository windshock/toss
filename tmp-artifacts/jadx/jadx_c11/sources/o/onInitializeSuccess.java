package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onInitializeSuccess {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final long IAuthTabCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;

    public /* synthetic */ onInitializeSuccess(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    private onInitializeSuccess(long j, long j2, long j3) {
        this.onExtraCallbackWithResult = j;
        this.IAuthTabCallback = j2;
        this.onNavigationEvent = j3;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        int i3 = 5 / 0;
        return this.onExtraCallbackWithResult;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallback;
        int i5 = i3 + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onNavigationEvent;
        int i5 = i2 + 39;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
