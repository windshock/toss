package o;

import java.util.GregorianCalendar;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryLandingPageActivity8 {
    private static final byte[] onExtraCallbackWithResult = new byte[0];
    private static final int onNavigationEvent = -1;

    public static final int IAuthTabCallback() {
        return onNavigationEvent;
    }

    public static final long onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i, i2 - 1, i3, i4, i5, i6);
        return gregorianCalendar.getTime().getTime();
    }

    public static final byte[] onExtraCallback() {
        return onExtraCallbackWithResult;
    }
}
