package im.toss.features.applock.impl.manager;

import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getProxy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockCheckerImpl$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) getProxy.onExtraCallbackWithResult(-947438927, new Object[]{(Throwable) obj}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 947438929);
        int i4 = onExtraCallback + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
