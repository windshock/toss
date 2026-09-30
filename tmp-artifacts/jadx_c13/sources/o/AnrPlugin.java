package o;

import android.text.TextPaint;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class AnrPlugin {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static /* synthetic */ void onNavigationEvent(TextPaint textPaint, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        textPaint.underlineThickness = f;
        int i4 = IAuthTabCallback + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
