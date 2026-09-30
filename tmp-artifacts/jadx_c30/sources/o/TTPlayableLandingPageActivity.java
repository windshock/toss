package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TTPlayableLandingPageActivity {
    long[] IAuthTabCallback;
    TTRewardVideoActivity3 asBinder;
    long onNavigationEvent;
    long[] onExtraCallback = new long[0];
    TTRewardExpressVideoActivity[] onExtraCallbackWithResult = TTRewardExpressVideoActivity.onNavigationEvent;
    TTPlayableLandingPageActivity71[] onWarmupCompleted = TTPlayableLandingPageActivity71.onNavigationEvent;

    TTPlayableLandingPageActivity() {
    }

    private static String onWarmupCompleted(long[] jArr) {
        return jArr == null ? "(null)" : String.valueOf(jArr.length);
    }

    private static String onExtraCallback(Object[] objArr) {
        return objArr == null ? "(null)" : String.valueOf(objArr.length);
    }

    public String toString() {
        return "Archive with packed streams starting at offset " + this.onNavigationEvent + ", " + onWarmupCompleted(this.onExtraCallback) + " pack sizes, " + onWarmupCompleted(this.IAuthTabCallback) + " CRCs, " + onExtraCallback(this.onExtraCallbackWithResult) + " folders, " + onExtraCallback(this.onWarmupCompleted) + " files and " + this.asBinder;
    }
}
