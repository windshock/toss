package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class showAppOpenAd {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static int onTransact = 1;
    public static final showAppOpenAd onWarmupCompleted = new showAppOpenAd();

    private showAppOpenAd() {
    }

    static {
        r8lambdacaQtkLLbj_w3lhUsfEQiulbGHYk r8lambdacaqtkllbj_w3lhusfeqiulbghyk = r8lambdacaQtkLLbj_w3lhUsfEQiulbGHYk.onExtraCallbackWithResult;
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambdacaqtkllbj_w3lhusfeqiulbghyk.onNavigationEvent());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(r8lambdacaqtkllbj_w3lhusfeqiulbghyk.onExtraCallbackWithResult());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambdacaqtkllbj_w3lhusfeqiulbghyk.IAuthTabCallback());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(r8lambdacaqtkllbj_w3lhusfeqiulbghyk.onWarmupCompleted());
        int i = IAuthTabCallbackDefault + 29;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 101;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        long j = onExtraCallback;
        int i5 = i2 + 43;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = onNavigationEvent;
        int i4 = i3 + 9;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 5;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallback;
        int i5 = i2 + 23;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i3 + 45;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }
}
