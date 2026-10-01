package im.toss.features.home.ui.view.hideamount;

import kotlin.jvm.functions.Function1;
import o.checkAppxSupportCrossVersionSnapshot;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeHideAmountBottomSheetActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        IAuthTabCallback = i2 % 128;
        checkAppxSupportCrossVersionSnapshot checkappxsupportcrossversionsnapshot = (checkAppxSupportCrossVersionSnapshot) obj;
        if (i2 % 2 != 0) {
            return HomeHideAmountBottomSheetActivity.onNavigationEvent(checkappxsupportcrossversionsnapshot);
        }
        HomeHideAmountBottomSheetActivity.onNavigationEvent(checkappxsupportcrossversionsnapshot);
        throw null;
    }
}
