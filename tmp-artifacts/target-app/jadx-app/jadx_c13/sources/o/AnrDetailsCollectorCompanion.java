package o;

import android.text.TextPaint;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class AnrDetailsCollectorCompanion {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ void onExtraCallback(TextPaint textPaint, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        textPaint.underlineColor = i;
        int i5 = onNavigationEvent + 95;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
