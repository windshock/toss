package im.toss.features.home.presentation.bottomsheet;

import im.toss.features.home.core.model.CardBillAccount;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAccountBottomSheetSchemeActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeAccountBottomSheetSchemeActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        HomeAccountBottomSheetSchemeActivity homeAccountBottomSheetSchemeActivity = this.f$0;
        CardBillAccount cardBillAccount = (CardBillAccount) obj;
        if (i3 == 0) {
            return HomeAccountBottomSheetSchemeActivity.onNavigationEvent(homeAccountBottomSheetSchemeActivity, cardBillAccount);
        }
        HomeAccountBottomSheetSchemeActivity.onNavigationEvent(homeAccountBottomSheetSchemeActivity, cardBillAccount);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
