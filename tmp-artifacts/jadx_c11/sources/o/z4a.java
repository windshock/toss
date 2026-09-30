package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class z4a {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ z5a onWarmupCompleted(long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        long jOnExtraCallbackWithResult;
        long jIAuthTabCallback;
        int i2 = 2 % 2;
        long jOnExtraCallback = (i & 1) != 0 ? MaxDebuggerWaterfallSegmentsActivity.onExtraCallback.onExtraCallback() : j;
        long jOnNavigationEvent = (i & 2) != 0 ? MaxDebuggerWaterfallSegmentsActivity.onExtraCallback.onNavigationEvent() : j2;
        if ((i & 4) != 0) {
            int i3 = onExtraCallback + 101;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            jOnExtraCallbackWithResult = MaxDebuggerWaterfallSegmentsActivity.onExtraCallback.onExtraCallbackWithResult();
        } else {
            jOnExtraCallbackWithResult = j3;
        }
        long jOnWarmupCompleted = (i & 8) != 0 ? MaxDebuggerWaterfallSegmentsActivity.onExtraCallback.onWarmupCompleted() : j4;
        if ((i & 16) != 0) {
            int i5 = onExtraCallback + 3;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            jIAuthTabCallback = MaxDebuggerWaterfallSegmentsActivity.onExtraCallback.IAuthTabCallback();
        } else {
            jIAuthTabCallback = j5;
        }
        z5a z5aVarOnWarmupCompleted = onWarmupCompleted(jOnExtraCallback, jOnNavigationEvent, jOnExtraCallbackWithResult, jOnWarmupCompleted, jIAuthTabCallback);
        int i7 = onNavigationEvent + 63;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return z5aVarOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final z5a onWarmupCompleted(long j, long j2, long j3, long j4, long j5) {
        int i = 2 % 2;
        z5a z5aVar = new z5a(j, j2, j3, j4, j5, null);
        int i2 = onExtraCallback + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return z5aVar;
        }
        throw null;
    }

    public static /* synthetic */ z5a onExtraCallbackWithResult(long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        long jIAuthTabCallback;
        long jOnWarmupCompleted;
        long jOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 77;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            jIAuthTabCallback = MaxDebuggerUnifiedFlowActivity.onExtraCallback.IAuthTabCallback();
        } else {
            jIAuthTabCallback = j;
        }
        long jOnNavigationEvent = (i & 2) != 0 ? MaxDebuggerUnifiedFlowActivity.onExtraCallback.onNavigationEvent() : j2;
        if ((i & 4) != 0) {
            int i8 = onExtraCallback + 83;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            jOnWarmupCompleted = MaxDebuggerUnifiedFlowActivity.onExtraCallback.onWarmupCompleted();
        } else {
            jOnWarmupCompleted = j3;
        }
        long jOnExtraCallback = (i & 8) != 0 ? MaxDebuggerUnifiedFlowActivity.onExtraCallback.onExtraCallback() : j4;
        if ((i & 16) != 0) {
            int i10 = onExtraCallback + 99;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            jOnExtraCallbackWithResult = MaxDebuggerUnifiedFlowActivity.onExtraCallback.onExtraCallbackWithResult();
        } else {
            jOnExtraCallbackWithResult = j5;
        }
        return onExtraCallbackWithResult(jIAuthTabCallback, jOnNavigationEvent, jOnWarmupCompleted, jOnExtraCallback, jOnExtraCallbackWithResult);
    }

    public static final z5a onExtraCallbackWithResult(long j, long j2, long j3, long j4, long j5) {
        int i = 2 % 2;
        z5a z5aVar = new z5a(j, j2, j3, j4, j5, null);
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return z5aVar;
    }
}
