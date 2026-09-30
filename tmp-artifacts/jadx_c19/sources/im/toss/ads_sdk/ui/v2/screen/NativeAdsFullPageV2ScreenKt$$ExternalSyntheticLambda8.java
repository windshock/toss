package im.toss.ads_sdk.ui.v2.screen;

import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getWindowAreaStatus;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda8 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 85;
        onNavigationEvent = i3 % 128;
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
        if (i3 % 2 != 0) {
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            throw null;
        }
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        Unit unit = (Unit) getWindowAreaStatus.IAuthTabCallback(-1431877216, 1431877224, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{useandconfigureprogramwithtexture}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        int i4 = IAuthTabCallback + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
