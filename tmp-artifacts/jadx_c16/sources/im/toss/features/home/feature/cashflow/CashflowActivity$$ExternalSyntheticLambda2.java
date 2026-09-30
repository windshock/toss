package im.toss.features.home.feature.cashflow;

import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.DefaultLoggerProxyImpl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CashflowActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (String) obj, (DefaultLoggerProxyImpl.IAuthTabCallback) obj2};
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) CashflowActivity.onExtraCallback(objArr, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, 662144010, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -662144008);
        int i4 = onExtraCallback + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
