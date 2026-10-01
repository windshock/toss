package o;

import android.graphics.Typeface;
import android.graphics.fonts.FontFamily;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class body {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Typeface.CustomFallbackBuilder rk_(FontFamily fontFamily) {
        int i = 2 % 2;
        Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamily);
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
        return customFallbackBuilder;
    }
}
