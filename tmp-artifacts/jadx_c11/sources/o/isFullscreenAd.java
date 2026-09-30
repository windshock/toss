package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isFullscreenAd {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    public static final isFullscreenAd onExtraCallback = new isFullscreenAd();
    private static int onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static final long onWarmupCompleted;

    private isFullscreenAd() {
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 35;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallback;
        int i5 = i2 + 103;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    static {
        getCustomTabsNavigationAbortedPostbacks getcustomtabsnavigationabortedpostbacks = getCustomTabsNavigationAbortedPostbacks.IAuthTabCallback;
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationabortedpostbacks.IAuthTabCallback());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationabortedpostbacks.onWarmupCompleted());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(getcustomtabsnavigationabortedpostbacks.onExtraCallbackWithResult());
        int i = asBinder + 35;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        int i3 = 36 / 0;
        return onWarmupCompleted;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 105;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = onNavigationEvent;
        int i5 = i2 + 81;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
