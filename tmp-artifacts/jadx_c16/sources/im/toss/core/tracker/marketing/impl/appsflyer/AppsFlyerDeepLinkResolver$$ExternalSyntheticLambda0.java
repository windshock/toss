package im.toss.core.tracker.marketing.impl.appsflyer;

import android.app.Application;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import o.setAssetUpdatedDate;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppsFlyerDeepLinkResolver$$ExternalSyntheticLambda0 implements DeepLinkListener {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ setAssetUpdatedDate f$0;
    public final /* synthetic */ Application f$1;

    public /* synthetic */ AppsFlyerDeepLinkResolver$$ExternalSyntheticLambda0(setAssetUpdatedDate setassetupdateddate, Application application) {
        this.f$0 = setassetupdateddate;
        this.f$1 = application;
    }

    public final void onDeepLinking(DeepLinkResult deepLinkResult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            setAssetUpdatedDate.onExtraCallback(this.f$0, this.f$1, deepLinkResult);
            int i3 = 8 / 0;
        } else {
            setAssetUpdatedDate.onExtraCallback(this.f$0, this.f$1, deepLinkResult);
        }
        int i4 = onExtraCallback + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
    }
}
