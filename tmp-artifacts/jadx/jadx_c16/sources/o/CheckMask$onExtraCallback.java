package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CheckMask$onExtraCallback {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static int onTransact;
    public static final CheckMask$onExtraCallback onExtraCallback = new CheckMask$onExtraCallback();
    private static final ResetInputBGRLivenessChecker onNavigationEvent = new ResetInputBGRLivenessChecker("yMMMdjm");
    private static final ResetInputBGRLivenessChecker IAuthTabCallback = new ResetInputBGRLivenessChecker("yMMMdjmz");
    private static final ResetInputBGRLivenessChecker onWarmupCompleted = new ResetInputBGRLivenessChecker("yMMMdHm");
    private static final ResetInputBGRLivenessChecker onExtraCallbackWithResult = new ResetInputBGRLivenessChecker("MMMdHm");

    private CheckMask$onExtraCallback() {
    }

    static {
        int i = asInterface + 59;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ResetInputBGRLivenessChecker IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 5;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        ResetInputBGRLivenessChecker resetInputBGRLivenessChecker = onWarmupCompleted;
        int i5 = i2 + 75;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return resetInputBGRLivenessChecker;
    }

    public final ResetInputBGRLivenessChecker onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        ResetInputBGRLivenessChecker resetInputBGRLivenessChecker = onExtraCallbackWithResult;
        int i5 = i3 + 95;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return resetInputBGRLivenessChecker;
        }
        throw null;
    }
}
