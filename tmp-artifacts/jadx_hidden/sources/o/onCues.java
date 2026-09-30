package o;

/* loaded from: classes.dex */
public class onCues {
    static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static native long read();

    static {
        PlaceholderDataSourceExternalSyntheticLambda0.IAuthTabCallback();
        int i = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
