package im.toss.features.home.legacy.view.transaction.detail;

import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda61 implements deserializeFloat {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, obj};
        if (i3 == 0) {
            TransactionDetailActivity.onNavigationEvent(522875202, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -522875199, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        } else {
            TransactionDetailActivity.onNavigationEvent(522875202, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -522875199, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
            throw null;
        }
    }
}
