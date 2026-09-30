package im.toss.ads_sdk.ui.v2.screen;

import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getWindowAreaStatus;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda11 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 101;
        onNavigationEvent = i3 % 128;
        Object[] objArr = {(useAndConfigureProgramWithTexture) obj};
        if (i3 % 2 != 0) {
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            return (Unit) getWindowAreaStatus.IAuthTabCallback(1850871048, -1850871046, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        throw null;
    }
}
