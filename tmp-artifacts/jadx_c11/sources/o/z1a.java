package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class z1a {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ z3a onExtraCallback(long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        long jIAuthTabCallback;
        long jOnWarmupCompleted;
        int i2 = 2 % 2;
        long jOnExtraCallback = (i & 1) != 0 ? MaxDebuggerAxonEventsListActivity.onExtraCallbackWithResult.onExtraCallback() : j;
        long jOnExtraCallbackWithResult = (i & 2) != 0 ? MaxDebuggerAxonEventsListActivity.onExtraCallbackWithResult.onExtraCallbackWithResult() : j2;
        if ((i & 4) != 0) {
            int i3 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            jIAuthTabCallback = MaxDebuggerAxonEventsListActivity.onExtraCallbackWithResult.IAuthTabCallback();
            int i5 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            jIAuthTabCallback = j3;
        }
        long jOnNavigationEvent = (i & 8) != 0 ? MaxDebuggerAxonEventsListActivity.onExtraCallbackWithResult.onNavigationEvent() : j4;
        if ((i & 16) != 0) {
            int i7 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            jOnWarmupCompleted = MaxDebuggerAxonEventsListActivity.onExtraCallbackWithResult.onWarmupCompleted();
        } else {
            jOnWarmupCompleted = j5;
        }
        return IAuthTabCallback(jOnExtraCallback, jOnExtraCallbackWithResult, jIAuthTabCallback, jOnNavigationEvent, jOnWarmupCompleted);
    }

    public static final z3a IAuthTabCallback(long j, long j2, long j3, long j4, long j5) {
        int i = 2 % 2;
        z3a z3aVar = new z3a(j, j2, j3, j4, j5, null);
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return z3aVar;
        }
        throw null;
    }

    public static /* synthetic */ z3a onNavigationEvent(long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        long jOnNavigationEvent;
        long jOnExtraCallback;
        long jOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            jOnNavigationEvent = MaxDebuggerAdUnitWaterfallsListActivity.onWarmupCompleted.onNavigationEvent();
        } else {
            jOnNavigationEvent = j;
        }
        long jIAuthTabCallback = (i & 2) != 0 ? MaxDebuggerAdUnitWaterfallsListActivity.onWarmupCompleted.IAuthTabCallback() : j2;
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                MaxDebuggerAdUnitWaterfallsListActivity.onWarmupCompleted.onExtraCallback();
                obj2.hashCode();
                throw null;
            }
            jOnExtraCallback = MaxDebuggerAdUnitWaterfallsListActivity.onWarmupCompleted.onExtraCallback();
        } else {
            jOnExtraCallback = j3;
        }
        long jOnWarmupCompleted = (i & 8) != 0 ? MaxDebuggerAdUnitWaterfallsListActivity.onWarmupCompleted.onWarmupCompleted() : j4;
        if ((i & 16) != 0) {
            int i6 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                MaxDebuggerAdUnitWaterfallsListActivity.onWarmupCompleted.onExtraCallbackWithResult();
                obj2.hashCode();
                throw null;
            }
            jOnExtraCallbackWithResult = MaxDebuggerAdUnitWaterfallsListActivity.onWarmupCompleted.onExtraCallbackWithResult();
            int i7 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        } else {
            jOnExtraCallbackWithResult = j5;
        }
        return onNavigationEvent(jOnNavigationEvent, jIAuthTabCallback, jOnExtraCallback, jOnWarmupCompleted, jOnExtraCallbackWithResult);
    }

    public static final z3a onNavigationEvent(long j, long j2, long j3, long j4, long j5) {
        int i = 2 % 2;
        z3a z3aVar = new z3a(j, j2, j3, j4, j5, null);
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return z3aVar;
    }
}
