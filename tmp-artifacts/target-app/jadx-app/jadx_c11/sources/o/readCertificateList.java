package o;

import android.graphics.fonts.Font;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class readCertificateList {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Font rg_(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 17;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Font font = (Font) obj;
        int i5 = i2 + 105;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return font;
        }
        throw null;
    }
}
