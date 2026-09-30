package im.toss.features.applock.impl.manager;

import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getProxy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockCheckerImpl$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallback = i2 % 128;
        Unit unit = (Unit) obj;
        if (i2 % 2 != 0) {
            throw null;
        }
        Unit unit2 = (Unit) getProxy.onExtraCallbackWithResult(920046373, new Object[]{unit}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -920046372);
        int i3 = onExtraCallback + 87;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 65 / 0;
        }
        return unit2;
    }
}
