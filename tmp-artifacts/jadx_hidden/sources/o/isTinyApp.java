package o;

/* loaded from: classes.dex */
public final class isTinyApp implements createAppMsgReceiver {
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(isTinyApp.class);
    public static final isTinyApp onExtraCallbackWithResult = new isTinyApp();

    static {
        int i = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1443);
        int i2 = (~iOnWarmupCompleted) & i;
        int i3 = (~i) & iOnWarmupCompleted;
        if (((((i3 & i2) | (i2 ^ i3)) >> 14) & 1) != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isTinyApp() {
    }
}
