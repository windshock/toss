package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Nestfgetadapter {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final long IAuthTabCallback;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public /* synthetic */ Nestfgetadapter(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    private Nestfgetadapter(long j, long j2, long j3) {
        this.IAuthTabCallback = j;
        this.onNavigationEvent = j2;
        this.onWarmupCompleted = j3;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallback;
        int i5 = i2 + 51;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = this.onNavigationEvent;
        int i4 = i3 + 119;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 121;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i2 + 117;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }
}
