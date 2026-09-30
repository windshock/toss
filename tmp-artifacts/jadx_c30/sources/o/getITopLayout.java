package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class getITopLayout {
    int[] IAuthTabCallback;
    private int onExtraCallbackWithResult;
    int[] onNavigationEvent;

    getITopLayout() {
    }

    static void IAuthTabCallback(getITopLayout getitoplayout, int i, int i2) {
        getitoplayout.onExtraCallbackWithResult = i;
        getitoplayout.onNavigationEvent = new int[i2 * 1080];
        getitoplayout.IAuthTabCallback = new int[i2];
    }

    static void onWarmupCompleted(getITopLayout getitoplayout, TopLayoutDislike23 topLayoutDislike23) {
        int length = getitoplayout.IAuthTabCallback.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            getitoplayout.IAuthTabCallback[i2] = i;
            TopLayoutDislike28.onExtraCallbackWithResult(getitoplayout.onExtraCallbackWithResult, getitoplayout.onNavigationEvent, i, topLayoutDislike23);
            i += 1080;
        }
    }
}
