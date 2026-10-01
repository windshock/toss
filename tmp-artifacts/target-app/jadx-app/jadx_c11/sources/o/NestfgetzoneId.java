package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class NestfgetzoneId {
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult;
    private final long IAuthTabCallback;
    private final long onExtraCallback;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public /* synthetic */ NestfgetzoneId(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    private NestfgetzoneId(long j, long j2, long j3, long j4) {
        this.onWarmupCompleted = j;
        this.onExtraCallback = j2;
        this.onNavigationEvent = j3;
        this.IAuthTabCallback = j4;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i2 + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = this.onNavigationEvent;
        int i4 = i3 + 5;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        long j = this.IAuthTabCallback;
        int i4 = i3 + 29;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }
}
