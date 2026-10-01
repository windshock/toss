package o;

/* loaded from: classes.dex */
public class AudioFocusManagerExternalSyntheticLambda1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static native long R(long j, long j2);

    public static native long Rid(long j, long j2);

    public static native long add(long j, long j2);

    public static native long run(long j, long j2);

    static {
        PlaceholderDataSourceExternalSyntheticLambda0.IAuthTabCallback();
        int i = onExtraCallback + 43;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
