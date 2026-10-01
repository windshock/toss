package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class shouldMuteAudio {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final isMultiAdsEnabled IAuthTabCallback(long j) {
        int i = 2 % 2;
        isMultiAdsEnabled ismultiadsenabled = new isMultiAdsEnabled(j, null);
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return ismultiadsenabled;
    }

    public static /* synthetic */ isMultiAdsEnabled onExtraCallback(long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 17;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            j = MaxAdapterOnCompletionListener.onExtraCallback.onWarmupCompleted();
        }
        isMultiAdsEnabled ismultiadsenabledIAuthTabCallback = IAuthTabCallback(j);
        int i5 = onExtraCallback + 31;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return ismultiadsenabledIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final isMultiAdsEnabled onWarmupCompleted(long j) {
        int i = 2 % 2;
        Object obj = null;
        isMultiAdsEnabled ismultiadsenabled = new isMultiAdsEnabled(j, null);
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return ismultiadsenabled;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ isMultiAdsEnabled onWarmupCompleted(long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            j = MaxAdapterInitializationStatus.onExtraCallbackWithResult.onExtraCallbackWithResult();
            int i4 = onNavigationEvent + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return onWarmupCompleted(j);
    }
}
