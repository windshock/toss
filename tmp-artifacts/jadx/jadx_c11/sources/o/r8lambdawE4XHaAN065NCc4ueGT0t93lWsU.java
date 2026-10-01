package o;

import im.toss.securities.widget.common.ui.TossSecWidgetBridgeActivity;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdawE4XHaAN065NCc4ueGT0t93lWsU implements setSize<TossSecWidgetBridgeActivity> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static void onNavigationEvent(TossSecWidgetBridgeActivity tossSecWidgetBridgeActivity, AFLogger4 aFLogger4) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        tossSecWidgetBridgeActivity.widgetNavigationPort = aFLogger4;
        int i4 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
