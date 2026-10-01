package im.toss.tds.compose.component.theme.component;

import im.toss.tds.compose.component.token.RatingDarkColorTokens;
import im.toss.tds.compose.component.token.RatingLightColorTokens;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RatingColorSchemeKt {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ RatingColorScheme onNavigationEvent(long j, long j2, long j3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 13;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 117;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            j = RatingLightColorTokens.onExtraCallback.onExtraCallbackWithResult();
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = RatingLightColorTokens.onExtraCallback.onNavigationEvent();
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = RatingLightColorTokens.onExtraCallback.onExtraCallback();
            int i8 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        return IAuthTabCallback(j4, j5, j3);
    }

    public static final RatingColorScheme IAuthTabCallback(long j, long j2, long j3) {
        int i = 2 % 2;
        RatingColorScheme ratingColorScheme = new RatingColorScheme(j, j2, j3, null);
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return ratingColorScheme;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ RatingColorScheme onWarmupCompleted(long j, long j2, long j3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            j = RatingDarkColorTokens.IAuthTabCallback.onExtraCallback();
            int i5 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 3;
            }
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = RatingDarkColorTokens.IAuthTabCallback.onExtraCallbackWithResult();
            int i7 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            int i9 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            j3 = RatingDarkColorTokens.IAuthTabCallback.IAuthTabCallback();
        }
        return onExtraCallbackWithResult(j4, j5, j3);
    }

    public static final RatingColorScheme onExtraCallbackWithResult(long j, long j2, long j3) {
        int i = 2 % 2;
        RatingColorScheme ratingColorScheme = new RatingColorScheme(j, j2, j3, null);
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 26 / 0;
        }
        return ratingColorScheme;
    }
}
