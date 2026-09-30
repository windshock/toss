package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxDebuggerAdUnitWaterfallsListActivity {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static final long onTransact;
    public static final MaxDebuggerAdUnitWaterfallsListActivity onWarmupCompleted = new MaxDebuggerAdUnitWaterfallsListActivity();

    private MaxDebuggerAdUnitWaterfallsListActivity() {
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult;
        }
        int i3 = 22 / 0;
        return onExtraCallbackWithResult;
    }

    static {
        getCustomTabsNavigationFinishedPostbacks getcustomtabsnavigationfinishedpostbacks = getCustomTabsNavigationFinishedPostbacks.onNavigationEvent;
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfinishedpostbacks.IAuthTabCallback());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfinishedpostbacks.onNavigationEvent());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfinishedpostbacks.onWarmupCompleted());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfinishedpostbacks.onExtraCallbackWithResult());
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationfinishedpostbacks.onExtraCallback());
        int i = asBinder + 109;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 107;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = onNavigationEvent;
        int i5 = i2 + 7;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 15;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallback;
        int i5 = i2 + 87;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 91;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = onTransact;
        int i4 = i2 + 121;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }
}
