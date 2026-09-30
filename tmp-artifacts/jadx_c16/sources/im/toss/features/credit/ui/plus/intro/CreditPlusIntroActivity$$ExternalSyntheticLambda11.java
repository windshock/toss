package im.toss.features.credit.ui.plus.intro;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusIntroActivity$$ExternalSyntheticLambda11 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        DialogInterface dialogInterface = (DialogInterface) obj;
        if (i2 % 2 != 0) {
            CreditPlusIntroActivity.onWarmupCompleted(dialogInterface);
            throw null;
        }
        Unit unitOnWarmupCompleted = CreditPlusIntroActivity.onWarmupCompleted(dialogInterface);
        int i3 = onExtraCallback + 9;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
