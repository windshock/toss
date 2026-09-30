package im.toss.features.credit.ui.plus.gift.send;

import android.view.View;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftSelectItemActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CreditPlusGiftSelectItemActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, (View) obj};
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
            throw null;
        }
        Object[] objArr2 = {this.f$0, (View) obj};
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
        Unit unit = (Unit) CreditPlusGiftSelectItemActivity.onNavigationEvent(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback3, objArr2, -1253716889, 1253716890, iIAuthTabCallback4);
        int i3 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
