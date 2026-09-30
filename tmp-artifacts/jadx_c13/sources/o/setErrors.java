package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setErrors {
    public static int onWarmupCompleted() {
        return 32;
    }

    public static String onNavigationEvent() {
        return "00000000000000000000000000000000";
    }

    public static boolean IAuthTabCallback(CharSequence charSequence) {
        return charSequence != null && charSequence.length() == 32 && !"00000000000000000000000000000000".contentEquals(charSequence) && copybugsnag_android_core_release.onNavigationEvent(charSequence);
    }

    public static String IAuthTabCallback(long j, long j2) {
        if (j == 0 && j2 == 0) {
            return onNavigationEvent();
        }
        char[] cArrIAuthTabCallback = setUnhandledExceptions.IAuthTabCallback(32);
        copybugsnag_android_core_release.onNavigationEvent(j, cArrIAuthTabCallback, 0);
        copybugsnag_android_core_release.onNavigationEvent(j2, cArrIAuthTabCallback, 16);
        return new String(cArrIAuthTabCallback, 0, 32);
    }
}
