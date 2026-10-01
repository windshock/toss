package im.toss.features.credit.ui.plus.intro;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusIntroActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        View view = (View) obj;
        if (i2 % 2 != 0) {
            return CreditPlusIntroActivity.onExtraCallback(view);
        }
        CreditPlusIntroActivity.onExtraCallback(view);
        throw null;
    }
}
