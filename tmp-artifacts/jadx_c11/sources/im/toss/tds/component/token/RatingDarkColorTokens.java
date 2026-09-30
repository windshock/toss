package im.toss.tds.component.token;

import android.graphics.Color;
import o.charset;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RatingDarkColorTokens {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static final int onExtraCallback;
    private static final int onExtraCallbackWithResult;
    public static final RatingDarkColorTokens onNavigationEvent = new RatingDarkColorTokens();
    private static final int onWarmupCompleted;

    private RatingDarkColorTokens() {
    }

    static {
        charset charsetVar = charset.onExtraCallbackWithResult;
        onWarmupCompleted = charsetVar.prefetchWithMultipleUrls().onExtraCallbackWithResult();
        onExtraCallback = charsetVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4().onExtraCallbackWithResult();
        onExtraCallbackWithResult = Color.argb(0, 255, 187, 47);
        int i = asInterface + 75;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = onWarmupCompleted;
        int i6 = i3 + 47;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = onExtraCallbackWithResult;
        int i6 = i3 + 3;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
