package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class OkHttp {
    public static final OkHttp onExtraCallback = new OkHttp();
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private OkHttp() {
    }
}
