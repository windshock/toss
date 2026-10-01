package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxDebuggerAxonEventsListActivity {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static int asInterface;
    private static final long onExtraCallback;
    public static final MaxDebuggerAxonEventsListActivity onExtraCallbackWithResult = new MaxDebuggerAxonEventsListActivity();
    private static final long onNavigationEvent;
    private static final long onTransact;
    private static final long onWarmupCompleted;

    private MaxDebuggerAxonEventsListActivity() {
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        int i3 = 53 / 0;
        return onWarmupCompleted;
    }

    static {
        isCustomTabsEnabled iscustomtabsenabled = isCustomTabsEnabled.onExtraCallback;
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(iscustomtabsenabled.IAuthTabCallback());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(iscustomtabsenabled.onExtraCallback());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(iscustomtabsenabled.onExtraCallbackWithResult());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(iscustomtabsenabled.onWarmupCompleted());
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(iscustomtabsenabled.onNavigationEvent());
        int i = asInterface + 27;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 63 / 0;
        }
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback;
        }
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = onNavigationEvent;
        int i4 = i3 + 65;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 73;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = onExtraCallback;
        int i5 = i2 + 17;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 29;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        long j = onTransact;
        int i5 = i2 + 119;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
