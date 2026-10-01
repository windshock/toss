package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxRewardedAdapter {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 1;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    public static final MaxRewardedAdapter onWarmupCompleted = new MaxRewardedAdapter();

    private MaxRewardedAdapter() {
    }

    static {
        r8lambdaI4XbiLIAnlhhHW60sC2_lyCTncM r8lambdai4xbilianlhhhw60sc2_lyctncm = r8lambdaI4XbiLIAnlhhHW60sC2_lyCTncM.onNavigationEvent;
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(r8lambdai4xbilianlhhhw60sc2_lyctncm.onWarmupCompleted());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambdai4xbilianlhhhw60sc2_lyctncm.IAuthTabCallback());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambdai4xbilianlhhhw60sc2_lyctncm.onExtraCallback());
        int i = onNavigationEvent + 119;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 1;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i2 + 85;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = IAuthTabCallback;
        int i4 = i3 + 1;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 41;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        long j = onExtraCallback;
        int i5 = i2 + 55;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }
}
