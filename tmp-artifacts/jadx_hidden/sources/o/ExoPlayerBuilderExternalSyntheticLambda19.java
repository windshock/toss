package o;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda19 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    static int onExtraCallbackWithResult = 1;
    static int onWarmupCompleted;

    public static native long read(String[][] strArr);

    static {
        PlaceholderDataSourceExternalSyntheticLambda0.IAuthTabCallback();
        int i = IAuthTabCallback + 61;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException();
        }
    }
}
