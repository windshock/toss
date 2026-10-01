package im.toss.features.home.legacy.view.transaction.detail;

import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ TransactionDetailActivity f$0;

    public final Object invoke(Object obj) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, (SetDetectableSize) obj};
            unit = (Unit) TransactionDetailActivity.onNavigationEvent(-1755539297, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1755539334, objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
            int i3 = 34 / 0;
        } else {
            Object[] objArr2 = {this.f$0, (SetDetectableSize) obj};
            unit = (Unit) TransactionDetailActivity.onNavigationEvent(-1755539297, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1755539334, objArr2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        }
        int i4 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
