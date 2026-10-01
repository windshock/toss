package im.toss.feature.credit.ui.scoreraise.fullscreen_banner;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditFullScreenBannerActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditFullScreenBannerActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditFullScreenBannerActivity creditFullScreenBannerActivity = this.f$0;
        DialogInterface dialogInterface = (DialogInterface) obj;
        if (i3 == 0) {
            return CreditFullScreenBannerActivity.onWarmupCompleted(creditFullScreenBannerActivity, dialogInterface);
        }
        CreditFullScreenBannerActivity.onWarmupCompleted(creditFullScreenBannerActivity, dialogInterface);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
