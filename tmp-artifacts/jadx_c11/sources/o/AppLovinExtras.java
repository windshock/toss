package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinExtras {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ setMuteAudio onExtraCallback(long j, long j2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 123;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            j = MaxSegment.onExtraCallbackWithResult.onExtraCallback();
        }
        if ((i & 2) != 0) {
            j2 = MaxSegment.onExtraCallbackWithResult.onWarmupCompleted();
            int i4 = IAuthTabCallback + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        setMuteAudio setmuteaudioOnNavigationEvent = onNavigationEvent(j, j2);
        int i6 = IAuthTabCallback + 71;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return setmuteaudioOnNavigationEvent;
    }

    public static final setMuteAudio onNavigationEvent(long j, long j2) {
        int i = 2 % 2;
        setMuteAudio setmuteaudio = new setMuteAudio(j, j2, null);
        int i2 = IAuthTabCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return setmuteaudio;
    }

    public static /* synthetic */ setMuteAudio onNavigationEvent(long j, long j2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 17;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 63;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            j = MaxSegmentCollectionBuilder.onNavigationEvent.onExtraCallback();
            if (i7 == 0) {
                int i8 = 13 / 0;
            }
        }
        if ((i & 2) != 0) {
            int i9 = IAuthTabCallback + 23;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            j2 = MaxSegmentCollectionBuilder.onNavigationEvent.onExtraCallbackWithResult();
            int i11 = onNavigationEvent + 75;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        }
        return onWarmupCompleted(j, j2);
    }

    public static final setMuteAudio onWarmupCompleted(long j, long j2) {
        int i = 2 % 2;
        setMuteAudio setmuteaudio = new setMuteAudio(j, j2, null);
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return setmuteaudio;
        }
        throw null;
    }
}
