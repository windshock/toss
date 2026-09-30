package o;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda13 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    static int onExtraCallbackWithResult = 1;
    static int onWarmupCompleted;

    static native long read();

    static {
        PlaceholderDataSourceExternalSyntheticLambda0.IAuthTabCallback();
        int i = IAuthTabCallback + 63;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw new NullPointerException();
        }
    }
}
