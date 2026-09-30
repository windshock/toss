package im.toss.ads_sdk.ui.v2.screen;

import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import kotlin.jvm.functions.Function1;
import o.SessionProcessorCaptureCallback;
import o.getSupportedHighSpeedResolutions;
import o.getWindowAreaStatus;
import o.removeObserverLocked;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ getSupportedHighSpeedResolutions f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutions f$1;

    public /* synthetic */ NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda5(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2) {
        this.f$0 = getsupportedhighspeedresolutions;
        this.f$1 = getsupportedhighspeedresolutions2;
    }

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 31;
        onExtraCallback = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.f$0, this.f$1, (SessionProcessorCaptureCallback) obj};
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1, (SessionProcessorCaptureCallback) obj};
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        removeObserverLocked removeobserverlocked = (removeObserverLocked) getWindowAreaStatus.IAuthTabCallback(-1202375217, 1202375217, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        int i4 = onNavigationEvent + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return removeobserverlocked;
        }
        obj2.hashCode();
        throw null;
    }
}
