package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGBannerRequest {
    public static int IAuthTabCallback(long[] jArr, onAdShowFailed onadshowfailed) {
        int i = 0;
        for (long j : jArr) {
            if (onadshowfailed.onExtraCallbackWithResult(j)) {
                i++;
            }
        }
        return i;
    }

    public static int onWarmupCompleted(long[][] jArr, onAdShowFailed onadshowfailed) {
        int iIAuthTabCallback = 0;
        for (long[] jArr2 : jArr) {
            iIAuthTabCallback += IAuthTabCallback(jArr2, onadshowfailed);
        }
        return iIAuthTabCallback;
    }
}
