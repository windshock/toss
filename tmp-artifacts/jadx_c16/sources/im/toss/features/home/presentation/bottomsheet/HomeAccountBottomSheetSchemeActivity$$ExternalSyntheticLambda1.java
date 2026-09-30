package im.toss.features.home.presentation.bottomsheet;

import im.toss.features.home.core.model.CardPaymentSelectionDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAccountBottomSheetSchemeActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ HomeAccountBottomSheetSchemeActivity f$0;
    public final /* synthetic */ CardPaymentSelectionDto f$1;

    public /* synthetic */ HomeAccountBottomSheetSchemeActivity$$ExternalSyntheticLambda1(HomeAccountBottomSheetSchemeActivity homeAccountBottomSheetSchemeActivity, CardPaymentSelectionDto cardPaymentSelectionDto) {
        this.f$0 = homeAccountBottomSheetSchemeActivity;
        this.f$1 = cardPaymentSelectionDto;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            HomeAccountBottomSheetSchemeActivity.onWarmupCompleted(this.f$0, this.f$1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = HomeAccountBottomSheetSchemeActivity.onWarmupCompleted(this.f$0, this.f$1);
        int i3 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 66 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
