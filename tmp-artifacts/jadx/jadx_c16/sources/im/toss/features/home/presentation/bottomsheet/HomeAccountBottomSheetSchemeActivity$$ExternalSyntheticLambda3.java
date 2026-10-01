package im.toss.features.home.presentation.bottomsheet;

import im.toss.features.home.core.model.CardBillAccount;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAccountBottomSheetSchemeActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ HomeAccountBottomSheetSchemeActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallbackWithResult = HomeAccountBottomSheetSchemeActivity.onExtraCallbackWithResult(this.f$0, (CardBillAccount) obj);
            int i3 = 6 / 0;
        } else {
            unitOnExtraCallbackWithResult = HomeAccountBottomSheetSchemeActivity.onExtraCallbackWithResult(this.f$0, (CardBillAccount) obj);
        }
        int i4 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
