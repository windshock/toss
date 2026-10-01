package im.toss.tds.compose.component.token;

import o.ByteOrderedDataOutputStream;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RatingDarkColorTokens {
    public static final RatingDarkColorTokens IAuthTabCallback = new RatingDarkColorTokens();
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static int onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static int onTransact;
    private static final long onWarmupCompleted;

    private RatingDarkColorTokens() {
    }

    static {
        im.toss.tds.component.token.RatingDarkColorTokens ratingDarkColorTokens = im.toss.tds.component.token.RatingDarkColorTokens.onNavigationEvent;
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(ratingDarkColorTokens.onExtraCallbackWithResult());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(ratingDarkColorTokens.onExtraCallback());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(ratingDarkColorTokens.onWarmupCompleted());
        int i = asBinder + 121;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 96 / 0;
        }
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 113;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i2 + 11;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 101;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        long j = onWarmupCompleted;
        int i5 = i2 + 71;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        long j = onNavigationEvent;
        int i5 = i3 + 3;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }
}
