package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class NestfgetmediationBannerListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static /* synthetic */ Nestfgetadapter onNavigationEvent(long j, long j2, long j3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 83;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 67;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                MaxMediatedNetworkInfoInitializationStatus.onWarmupCompleted.IAuthTabCallback();
                throw null;
            }
            j = MaxMediatedNetworkInfoInitializationStatus.onWarmupCompleted.IAuthTabCallback();
        }
        if ((i & 2) != 0) {
            j2 = MaxMediatedNetworkInfoInitializationStatus.onWarmupCompleted.onWarmupCompleted();
            int i6 = IAuthTabCallback + 25;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            int i8 = onExtraCallback + 113;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            j3 = MaxMediatedNetworkInfoInitializationStatus.onWarmupCompleted.onExtraCallback();
        }
        return onNavigationEvent(j, j4, j3);
    }

    public static final Nestfgetadapter onNavigationEvent(long j, long j2, long j3) {
        int i = 2 % 2;
        Nestfgetadapter nestfgetadapter = new Nestfgetadapter(j, j2, j3, null);
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return nestfgetadapter;
        }
        throw null;
    }

    public static /* synthetic */ Nestfgetadapter IAuthTabCallback(long j, long j2, long j3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onExtraCallback + 25;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                MaxErrorCode.onExtraCallback.onExtraCallbackWithResult();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            j = MaxErrorCode.onExtraCallback.onExtraCallbackWithResult();
            int i4 = onExtraCallback + 65;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((i & 2) != 0) {
            j2 = MaxErrorCode.onExtraCallback.onWarmupCompleted();
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            int i6 = IAuthTabCallback + 71;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            j3 = MaxErrorCode.onExtraCallback.onExtraCallback();
            int i8 = onExtraCallback + 59;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        return IAuthTabCallback(j, j4, j3);
    }

    public static final Nestfgetadapter IAuthTabCallback(long j, long j2, long j3) {
        int i = 2 % 2;
        Nestfgetadapter nestfgetadapter = new Nestfgetadapter(j, j2, j3, null);
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return nestfgetadapter;
        }
        throw null;
    }
}
