package im.toss.features.home.ui.view.transaction.amount;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeTransactionAmountEditBottomSheetActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ HomeTransactionAmountEditView f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            HomeTransactionAmountEditBottomSheetActivity.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
            throw null;
        }
        Unit unitOnNavigationEvent = HomeTransactionAmountEditBottomSheetActivity.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
        int i3 = onExtraCallbackWithResult + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
