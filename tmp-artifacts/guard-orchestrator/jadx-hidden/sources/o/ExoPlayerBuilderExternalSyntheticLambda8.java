package o;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda8 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    static int onNavigationEvent = 1;
    static int onWarmupCompleted;

    public static native synchronized long read(String[][] strArr);

    static {
        PlaceholderDataSourceExternalSyntheticLambda0.IAuthTabCallback();
        int i = onExtraCallback;
        int i2 = (i ^ 71) + ((i & 71) << 1);
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw new NullPointerException();
        }
    }
}
