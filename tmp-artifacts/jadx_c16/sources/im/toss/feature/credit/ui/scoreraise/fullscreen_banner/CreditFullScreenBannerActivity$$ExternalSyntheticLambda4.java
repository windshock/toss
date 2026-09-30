package im.toss.feature.credit.ui.scoreraise.fullscreen_banner;

import im.toss.features.credit.data.response.CreditFullscreenBannerResponse;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditFullScreenBannerActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditFullScreenBannerActivity f$0;
    public final /* synthetic */ CreditFullscreenBannerResponse f$1;

    public /* synthetic */ CreditFullScreenBannerActivity$$ExternalSyntheticLambda4(CreditFullScreenBannerActivity creditFullScreenBannerActivity, CreditFullscreenBannerResponse creditFullscreenBannerResponse) {
        this.f$0 = creditFullScreenBannerActivity;
        this.f$1 = creditFullscreenBannerResponse;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditFullScreenBannerActivity creditFullScreenBannerActivity = this.f$0;
        if (i3 != 0) {
            return CreditFullScreenBannerActivity.onExtraCallback(creditFullScreenBannerActivity, this.f$1, (CreditFullscreenBannerResponse) obj);
        }
        CreditFullScreenBannerActivity.onExtraCallback(creditFullScreenBannerActivity, this.f$1, (CreditFullscreenBannerResponse) obj);
        throw null;
    }
}
