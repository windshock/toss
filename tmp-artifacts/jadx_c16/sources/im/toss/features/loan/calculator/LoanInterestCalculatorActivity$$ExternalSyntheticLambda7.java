package im.toss.features.loan.calculator;

import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import kotlin.jvm.functions.Function1;
import o.adaptAppModel;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestCalculatorActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = LoanInterestCalculatorActivity.onWarmupCompleted(492777074, -492777047, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{(adaptAppModel.onExtraCallback) obj}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
        int i4 = onWarmupCompleted + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
