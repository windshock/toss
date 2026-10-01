package im.toss.feature.credit.ui.scoreraise.fullscreen_banner;

import im.toss.features.credit.data.response.CreditFullscreenBannerResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditFullScreenBannerActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditFullScreenBannerActivity f$0;
    public final /* synthetic */ CreditFullscreenBannerResponse f$1;

    public /* synthetic */ CreditFullScreenBannerActivity$$ExternalSyntheticLambda0(CreditFullScreenBannerActivity creditFullScreenBannerActivity, CreditFullscreenBannerResponse creditFullscreenBannerResponse) {
        this.f$0 = creditFullScreenBannerActivity;
        this.f$1 = creditFullscreenBannerResponse;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = CreditFullScreenBannerActivity.onExtraCallback(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onExtraCallback + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return unitOnExtraCallback;
    }
}
