package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class z5b {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ z5 IAuthTabCallback(long j, long j2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            int i5 = i3 + 91;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity = MaxDebuggerTestModeNetworkActivity.onExtraCallback;
            if (i6 == 0) {
                maxDebuggerTestModeNetworkActivity.onExtraCallbackWithResult();
                throw null;
            }
            j = maxDebuggerTestModeNetworkActivity.onExtraCallbackWithResult();
        }
        if ((i & 2) != 0) {
            j2 = MaxDebuggerTestModeNetworkActivity.onExtraCallback.onWarmupCompleted();
        }
        return onExtraCallbackWithResult(j, j2);
    }

    public static final z5 onExtraCallbackWithResult(long j, long j2) {
        int i = 2 % 2;
        z5 z5Var = new z5(j, j2, null);
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return z5Var;
    }

    public static final z5 onExtraCallback(long j, long j2) {
        int i = 2 % 2;
        z5 z5Var = new z5(j, j2, null);
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return z5Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ z5 onExtraCallbackWithResult(long j, long j2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 25;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 97;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            j = MaxDebuggerTcfStringActivity.onExtraCallback.onExtraCallback();
        }
        if ((i & 2) != 0) {
            j2 = MaxDebuggerTcfStringActivity.onExtraCallback.onExtraCallbackWithResult();
        }
        return onExtraCallback(j, j2);
    }
}
