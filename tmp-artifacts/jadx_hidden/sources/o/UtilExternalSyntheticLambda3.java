package o;

/* loaded from: classes.dex */
public final class UtilExternalSyntheticLambda3 {
    public int IAuthTabCallback;
    public int onExtraCallback;
    public int onNavigationEvent;

    public static void onWarmupCompleted(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int onNavigationEvent(int i) {
        NetworkTypeObserverExternalSyntheticLambda0 networkTypeObserverExternalSyntheticLambda0 = NetworkTypeObserverExternalSyntheticLambda0.onNavigationEvent;
        return ((networkTypeObserverExternalSyntheticLambda0.IAuthTabCallback[0][i >>> 24] + networkTypeObserverExternalSyntheticLambda0.IAuthTabCallback[1][(i >>> 16) & 255]) ^ networkTypeObserverExternalSyntheticLambda0.IAuthTabCallback[2][(i >>> 8) & 255]) + networkTypeObserverExternalSyntheticLambda0.IAuthTabCallback[3][i & 255];
    }
}
