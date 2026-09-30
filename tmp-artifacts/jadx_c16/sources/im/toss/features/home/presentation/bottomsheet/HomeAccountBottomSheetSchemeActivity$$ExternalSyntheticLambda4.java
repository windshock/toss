package im.toss.features.home.presentation.bottomsheet;

import im.toss.features.home.core.model.CardPaymentSelectionDto;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAccountBottomSheetSchemeActivity$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeAccountBottomSheetSchemeActivity f$0;
    public final /* synthetic */ CardPaymentSelectionDto f$1;

    public /* synthetic */ HomeAccountBottomSheetSchemeActivity$$ExternalSyntheticLambda4(HomeAccountBottomSheetSchemeActivity homeAccountBottomSheetSchemeActivity, CardPaymentSelectionDto cardPaymentSelectionDto) {
        this.f$0 = homeAccountBottomSheetSchemeActivity;
        this.f$1 = cardPaymentSelectionDto;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HomeAccountBottomSheetSchemeActivity homeAccountBottomSheetSchemeActivity = this.f$0;
        if (i3 != 0) {
            return HomeAccountBottomSheetSchemeActivity.onExtraCallbackWithResult(homeAccountBottomSheetSchemeActivity, this.f$1);
        }
        HomeAccountBottomSheetSchemeActivity.onExtraCallbackWithResult(homeAccountBottomSheetSchemeActivity, this.f$1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
