package im.toss.feature.credit.ui.scoreraise.fullscreen_banner;

import im.toss.features.credit.data.response.CreditFullscreenBannerResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditFullScreenBannerActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CreditFullScreenBannerActivity f$0;
    public final /* synthetic */ CreditFullscreenBannerResponse f$1;

    public /* synthetic */ CreditFullScreenBannerActivity$$ExternalSyntheticLambda3(CreditFullScreenBannerActivity creditFullScreenBannerActivity, CreditFullscreenBannerResponse creditFullscreenBannerResponse) {
        this.f$0 = creditFullScreenBannerActivity;
        this.f$1 = creditFullscreenBannerResponse;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = CreditFullScreenBannerActivity.IAuthTabCallback(this.f$0, this.f$1, (CreditFullscreenBannerResponse) obj);
        int i4 = onExtraCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
