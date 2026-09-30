package im.toss.features.home.core.ui.widget;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeInventoryStandardTermsActivity$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return HomeInventoryStandardTermsActivity.IAuthTabCallback();
        }
        HomeInventoryStandardTermsActivity.IAuthTabCallback();
        throw null;
    }
}
