package im.toss.features.home.ui.view.lock;

import com.iap.android.mppclient.container.constant.JsParamKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeHideAmountOfferBottomSheetActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeHideAmountOfferBottomSheetActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (SetDetectableSize) obj};
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        Unit unit = (Unit) HomeHideAmountOfferBottomSheetActivity.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2020907241, JsParamKeys.onExtraCallbackWithResult(), objArr, 2020907242, iOnExtraCallbackWithResult2);
        int i4 = onWarmupCompleted + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
