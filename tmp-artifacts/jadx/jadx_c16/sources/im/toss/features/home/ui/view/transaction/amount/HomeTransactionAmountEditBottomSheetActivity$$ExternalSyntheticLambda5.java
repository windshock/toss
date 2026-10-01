package im.toss.features.home.ui.view.transaction.amount;

import android.view.View;
import kotlin.jvm.functions.Function1;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeTransactionAmountEditBottomSheetActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ HomeTransactionAmountEditView f$0;
    public final /* synthetic */ HomeTransactionAmountEditBottomSheetActivity f$1;
    public final /* synthetic */ getTypedExportedConstants f$2;

    public /* synthetic */ HomeTransactionAmountEditBottomSheetActivity$$ExternalSyntheticLambda5(HomeTransactionAmountEditView homeTransactionAmountEditView, HomeTransactionAmountEditBottomSheetActivity homeTransactionAmountEditBottomSheetActivity, getTypedExportedConstants gettypedexportedconstants) {
        this.f$0 = homeTransactionAmountEditView;
        this.f$1 = homeTransactionAmountEditBottomSheetActivity;
        this.f$2 = gettypedexportedconstants;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeTransactionAmountEditView homeTransactionAmountEditView = this.f$0;
        if (i3 != 0) {
            return HomeTransactionAmountEditBottomSheetActivity.onExtraCallbackWithResult(homeTransactionAmountEditView, this.f$1, this.f$2, (View) obj);
        }
        HomeTransactionAmountEditBottomSheetActivity.onExtraCallbackWithResult(homeTransactionAmountEditView, this.f$1, this.f$2, (View) obj);
        throw null;
    }
}
