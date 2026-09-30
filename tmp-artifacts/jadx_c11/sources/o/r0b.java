package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r0b {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final String onNavigationEvent(int i) {
        int i2 = 2 % 2;
        String str = "alpha_" + i;
        int i3 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public static final String onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        String str = "display_setting_" + i;
        int i3 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
