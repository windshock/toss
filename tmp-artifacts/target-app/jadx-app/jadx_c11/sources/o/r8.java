package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ long onExtraCallbackWithResult(long j, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(j, str);
        }
        onNavigationEvent(j, str);
        throw null;
    }

    private static final long onNavigationEvent(long j, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        long jHashCode = (j << 32) | (str.hashCode() & 4294967295L);
        int i4 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return jHashCode;
    }
}
