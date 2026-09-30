package im.toss.feature.credit.ui.scoreraise.fullscreen_banner;

import im.toss.features.credit.data.response.CreditFullscreenBannerResponse;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditFullScreenBannerActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ CreditFullScreenBannerActivity f$0;
    public final /* synthetic */ CreditFullscreenBannerResponse f$1;

    public /* synthetic */ CreditFullScreenBannerActivity$$ExternalSyntheticLambda8(CreditFullScreenBannerActivity creditFullScreenBannerActivity, CreditFullscreenBannerResponse creditFullscreenBannerResponse) {
        this.f$0 = creditFullScreenBannerActivity;
        this.f$1 = creditFullscreenBannerResponse;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditFullScreenBannerActivity creditFullScreenBannerActivity = this.f$0;
        if (i3 != 0) {
            return CreditFullScreenBannerActivity.onExtraCallbackWithResult(creditFullScreenBannerActivity, this.f$1, (SetDetectableSize) obj);
        }
        CreditFullScreenBannerActivity.onExtraCallbackWithResult(creditFullScreenBannerActivity, this.f$1, (SetDetectableSize) obj);
        throw null;
    }
}
