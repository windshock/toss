package im.toss.features.home.core.ui.widget;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeInventoryStandardTermsActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ HomeInventoryStandardTermsActivity f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ HomeInventoryStandardTermsActivity$$ExternalSyntheticLambda1(HomeInventoryStandardTermsActivity homeInventoryStandardTermsActivity, long j) {
        this.f$0 = homeInventoryStandardTermsActivity;
        this.f$1 = j;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeInventoryStandardTermsActivity homeInventoryStandardTermsActivity = this.f$0;
        if (i3 == 0) {
            return HomeInventoryStandardTermsActivity.onExtraCallbackWithResult(homeInventoryStandardTermsActivity, this.f$1);
        }
        HomeInventoryStandardTermsActivity.onExtraCallbackWithResult(homeInventoryStandardTermsActivity, this.f$1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
