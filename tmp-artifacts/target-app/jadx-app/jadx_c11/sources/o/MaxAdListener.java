package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxAdListener {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    public static final MaxAdListener onExtraCallback = new MaxAdListener();
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    private MaxAdListener() {
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 23;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = onExtraCallbackWithResult;
        int i4 = i2 + 111;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    static {
        getCustomTabsHeaders getcustomtabsheaders = getCustomTabsHeaders.onNavigationEvent;
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsheaders.onExtraCallbackWithResult());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsheaders.onWarmupCompleted());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsheaders.IAuthTabCallback());
        int i = onWarmupCompleted + 89;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent;
        }
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallback;
        int i5 = i2 + 91;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
