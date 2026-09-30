package o;

import android.content.res.Resources;
import android.graphics.fonts.Font;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class accessgetEditorp {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ Font.Builder ri_(Resources resources, int i) {
        int i2 = 2 % 2;
        Font.Builder builder = new Font.Builder(resources, i);
        int i3 = onExtraCallbackWithResult + 23;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return builder;
        }
        throw null;
    }
}
