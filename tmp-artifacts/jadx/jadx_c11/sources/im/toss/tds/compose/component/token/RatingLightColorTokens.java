package im.toss.tds.compose.component.token;

import o.ByteOrderedDataOutputStream;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RatingLightColorTokens {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    public static final RatingLightColorTokens onExtraCallback = new RatingLightColorTokens();
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static int onWarmupCompleted;

    private RatingLightColorTokens() {
    }

    static {
        im.toss.tds.component.token.RatingLightColorTokens ratingLightColorTokens = im.toss.tds.component.token.RatingLightColorTokens.IAuthTabCallback;
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(ratingLightColorTokens.onExtraCallbackWithResult());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(ratingLightColorTokens.onNavigationEvent());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(ratingLightColorTokens.onExtraCallback());
        int i = onWarmupCompleted + 43;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallback;
        int i5 = i3 + 97;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        long j = onNavigationEvent;
        int i5 = i3 + 57;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 111;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = onExtraCallbackWithResult;
        int i4 = i2 + 71;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }
}
