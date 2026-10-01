package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class gExternalSyntheticLambda0 {
    private static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    public static final gExternalSyntheticLambda0 onExtraCallback = new gExternalSyntheticLambda0();
    private static int onExtraCallbackWithResult;
    private static final int onNavigationEvent;
    private static final int onWarmupCompleted;

    private gExternalSyntheticLambda0() {
    }

    static {
        charset charsetVar = charset.onExtraCallbackWithResult;
        IAuthTabCallback = charsetVar.ICustomTabsService().onExtraCallbackWithResult();
        onNavigationEvent = charsetVar.RatingCompatStarStyle().onExtraCallbackWithResult();
        onWarmupCompleted = charsetVar.MediaSessionCompatResultReceiverWrapper().onExtraCallbackWithResult();
        int i = asBinder + 19;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final int onExtraCallbackWithResult() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 77;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            i = IAuthTabCallback;
            int i5 = 25 / 0;
        } else {
            i = IAuthTabCallback;
        }
        int i6 = i3 + 105;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent;
        }
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = onWarmupCompleted;
        int i6 = i3 + 101;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
