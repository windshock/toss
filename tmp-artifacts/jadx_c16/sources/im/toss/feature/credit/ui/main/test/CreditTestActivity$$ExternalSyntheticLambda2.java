package im.toss.feature.credit.ui.main.test;

import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, Boolean.valueOf(((Boolean) obj).booleanValue())};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) CreditTestActivity.onWarmupCompleted(1319177815, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1319177802, objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
        int i4 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
