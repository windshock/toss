package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getTraceCorrelation {
    public static int onWarmupCompleted() {
        return 16;
    }

    public static String IAuthTabCallback() {
        return "0000000000000000";
    }

    public static boolean onWarmupCompleted(CharSequence charSequence) {
        return charSequence != null && charSequence.length() == 16 && !"0000000000000000".contentEquals(charSequence) && copybugsnag_android_core_release.onNavigationEvent(charSequence);
    }

    public static String onNavigationEvent(long j) {
        if (j == 0) {
            return IAuthTabCallback();
        }
        char[] cArrIAuthTabCallback = setUnhandledExceptions.IAuthTabCallback(16);
        copybugsnag_android_core_release.onNavigationEvent(j, cArrIAuthTabCallback, 0);
        return new String(cArrIAuthTabCallback, 0, 16);
    }
}
