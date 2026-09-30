package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface LottieCompositionFactoryExternalSyntheticLambda13 {
    void IAuthTabCallback();

    void onExtraCallback(long j, int i, boolean z);

    void onNavigationEvent(boolean z);

    boolean onNavigationEvent();

    float onWarmupCompleted();

    static /* synthetic */ void IAuthTabCallback(LottieCompositionFactoryExternalSyntheticLambda13 lottieCompositionFactoryExternalSyntheticLambda13, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hide");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        lottieCompositionFactoryExternalSyntheticLambda13.onNavigationEvent(z);
    }
}
