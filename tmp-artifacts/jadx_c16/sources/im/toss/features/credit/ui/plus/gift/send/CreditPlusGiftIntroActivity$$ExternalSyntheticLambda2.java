package im.toss.features.credit.ui.plus.gift.send;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftIntroActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = CreditPlusGiftIntroActivity.onExtraCallbackWithResult((View) obj);
        int i4 = onExtraCallbackWithResult + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
