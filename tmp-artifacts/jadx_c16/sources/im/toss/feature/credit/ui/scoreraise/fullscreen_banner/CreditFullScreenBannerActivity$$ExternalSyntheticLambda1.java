package im.toss.feature.credit.ui.scoreraise.fullscreen_banner;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditFullScreenBannerActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditFullScreenBannerActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = CreditFullScreenBannerActivity.IAuthTabCallback(this.f$0);
        int i4 = onWarmupCompleted + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
