package o;

/* loaded from: classes.dex */
public final class isInited implements addPageReadyListener {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(isInited.class);
    public static final isInited onExtraCallback = new isInited();

    static {
        int i = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(737);
        int i2 = i & iOnWarmupCompleted;
        if ((((((i ^ iOnWarmupCompleted) | i2) & (~i2)) >> 22) & 1) != 0) {
            throw null;
        }
    }

    private isInited() {
    }
}
