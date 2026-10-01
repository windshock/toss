package im.toss.features.credit.ui.plus.gift.send;

import im.toss.features.credit.data.response.DisclaimerV2;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftSelectItemActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ DisclaimerV2 f$0;
    public final /* synthetic */ CreditPlusGiftSelectItemActivity f$1;

    public /* synthetic */ CreditPlusGiftSelectItemActivity$$ExternalSyntheticLambda3(DisclaimerV2 disclaimerV2, CreditPlusGiftSelectItemActivity creditPlusGiftSelectItemActivity) {
        this.f$0 = disclaimerV2;
        this.f$1 = creditPlusGiftSelectItemActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        Unit unit = (Unit) CreditPlusGiftSelectItemActivity.onNavigationEvent(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, objArr, 1157614672, -1157614670, iIAuthTabCallback2);
        int i4 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
