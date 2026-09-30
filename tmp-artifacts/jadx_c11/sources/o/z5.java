package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class z5 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final long IAuthTabCallback;
    private final long onNavigationEvent;

    public /* synthetic */ z5(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private z5(long j, long j2) {
        this.IAuthTabCallback = j;
        this.onNavigationEvent = j2;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallback;
        int i5 = i3 + 93;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 71;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onNavigationEvent;
        int i5 = i2 + 53;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
