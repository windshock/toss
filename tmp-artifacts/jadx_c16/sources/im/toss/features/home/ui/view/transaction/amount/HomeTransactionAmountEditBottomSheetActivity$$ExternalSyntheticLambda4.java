package im.toss.features.home.ui.view.transaction.amount;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeTransactionAmountEditBottomSheetActivity$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ HomeTransactionAmountEditBottomSheetActivity f$0;
    public final /* synthetic */ getTypedExportedConstants f$1;
    public final /* synthetic */ HomeTransactionAmountEditView f$2;

    public /* synthetic */ HomeTransactionAmountEditBottomSheetActivity$$ExternalSyntheticLambda4(HomeTransactionAmountEditBottomSheetActivity homeTransactionAmountEditBottomSheetActivity, getTypedExportedConstants gettypedexportedconstants, HomeTransactionAmountEditView homeTransactionAmountEditView) {
        this.f$0 = homeTransactionAmountEditBottomSheetActivity;
        this.f$1 = gettypedexportedconstants;
        this.f$2 = homeTransactionAmountEditView;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = HomeTransactionAmountEditBottomSheetActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2);
        int i4 = onExtraCallbackWithResult + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
