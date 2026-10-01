package o;

import im.toss.features.home.ui.dst.view.asset.AssetActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class JsApiHandler2 implements setSize<AssetActivity> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static void onExtraCallback(AssetActivity assetActivity, setMaxScale setmaxscale) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        assetActivity.loanBrokerageFragmentNavigation = setmaxscale;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onExtraCallbackWithResult(AssetActivity assetActivity, getStartTimeMillis getstarttimemillis) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        assetActivity.localeManager = getstarttimemillis;
        int i4 = onNavigationEvent + 43;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
