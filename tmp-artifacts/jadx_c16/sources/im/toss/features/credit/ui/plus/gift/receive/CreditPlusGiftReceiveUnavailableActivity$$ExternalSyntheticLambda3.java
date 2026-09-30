package im.toss.features.credit.ui.plus.gift.receive;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftReceiveUnavailableActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CreditPlusGiftReceiveUnavailableActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ CreditPlusGiftReceiveUnavailableActivity$$ExternalSyntheticLambda3(CreditPlusGiftReceiveUnavailableActivity creditPlusGiftReceiveUnavailableActivity, String str) {
        this.f$0 = creditPlusGiftReceiveUnavailableActivity;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallbackWithResult = CreditPlusGiftReceiveUnavailableActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (View) obj);
            int i3 = 74 / 0;
        } else {
            unitOnExtraCallbackWithResult = CreditPlusGiftReceiveUnavailableActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (View) obj);
        }
        int i4 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
