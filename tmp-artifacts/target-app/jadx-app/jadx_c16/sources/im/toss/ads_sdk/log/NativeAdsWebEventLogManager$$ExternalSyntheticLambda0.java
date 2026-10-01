package im.toss.ads_sdk.log;

import o.WebSocketFactory;
import o.infoForCurrentScrollPosition;
import o.isDecorView;
import o.onSecondaryPointerUp;
import o.unregisterDataSetObserver;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsWebEventLogManager$$ExternalSyntheticLambda0 implements onSecondaryPointerUp {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ isDecorView.IAuthTabCallback f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ NativeAdsWebEventLogManager$$ExternalSyntheticLambda0(isDecorView.IAuthTabCallback iAuthTabCallback, String str) {
        this.f$0 = iAuthTabCallback;
        this.f$1 = str;
    }

    public final void onResult(String str, Integer num, unregisterDataSetObserver unregisterdatasetobserver, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, this.f$1, str, num, unregisterdatasetobserver, str2};
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            infoForCurrentScrollPosition.onExtraCallbackWithResult(WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, 800910374, -800910374);
            return;
        }
        Object[] objArr2 = {this.f$0, this.f$1, str, num, unregisterdatasetobserver, str2};
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        infoForCurrentScrollPosition.onExtraCallbackWithResult(WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr2, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, 800910374, -800910374);
        throw null;
    }
}
