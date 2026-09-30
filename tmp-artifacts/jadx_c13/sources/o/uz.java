package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class uz {
    private static final int onWarmupCompleted = Runtime.getRuntime().availableProcessors();

    public static final int IAuthTabCallback() {
        return onWarmupCompleted;
    }

    public static final String onExtraCallback(@NotNull String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
