package im.toss.tds.compose.component.theme.component;

import im.toss.tds.compose.component.token.RedDotDarkColorTokens;
import im.toss.tds.compose.component.token.RedDotLightColorTokens;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RedDotColorSchemeKt {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final RedDotColorScheme onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        RedDotColorScheme redDotColorScheme = new RedDotColorScheme(j, null);
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return redDotColorScheme;
        }
        throw null;
    }

    public static /* synthetic */ RedDotColorScheme onWarmupCompleted(long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            j = RedDotLightColorTokens.onNavigationEvent.onNavigationEvent();
        }
        RedDotColorScheme redDotColorSchemeOnExtraCallbackWithResult = onExtraCallbackWithResult(j);
        int i5 = onNavigationEvent + 11;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return redDotColorSchemeOnExtraCallbackWithResult;
    }

    public static final RedDotColorScheme IAuthTabCallback(long j) {
        int i = 2 % 2;
        RedDotColorScheme redDotColorScheme = new RedDotColorScheme(j, null);
        int i2 = onNavigationEvent + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return redDotColorScheme;
        }
        throw null;
    }

    public static /* synthetic */ RedDotColorScheme IAuthTabCallback(long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 107;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            j = RedDotDarkColorTokens.onNavigationEvent.onExtraCallbackWithResult();
            int i4 = onExtraCallback + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return IAuthTabCallback(j);
    }
}
