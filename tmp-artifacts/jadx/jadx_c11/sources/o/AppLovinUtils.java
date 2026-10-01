package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinUtils {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ getAdError onExtraCallback(long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 123;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            int i5 = i4 + 75;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            j = isBeta.onNavigationEvent.onWarmupCompleted();
        }
        return onWarmupCompleted(j);
    }

    public static final getAdError onWarmupCompleted(long j) {
        int i = 2 % 2;
        getAdError getaderror = new getAdError(j, null);
        int i2 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return getaderror;
        }
        throw null;
    }

    public static final getAdError onExtraCallback(long j) {
        int i = 2 % 2;
        getAdError getaderror = new getAdError(j, null);
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return getaderror;
    }

    public static /* synthetic */ getAdError onNavigationEvent(long j, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                shouldInitializeOnUiThread.onExtraCallback.onWarmupCompleted();
                throw null;
            }
            j = shouldInitializeOnUiThread.onExtraCallback.onWarmupCompleted();
        }
        getAdError getaderrorOnExtraCallback = onExtraCallback(j);
        int i4 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return getaderrorOnExtraCallback;
        }
        obj2.hashCode();
        throw null;
    }
}
