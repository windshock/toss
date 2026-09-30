package im.toss.features.credit.ui.plus.intro;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusIntroActivity$$ExternalSyntheticLambda12 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditPlusIntroActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusIntroActivity creditPlusIntroActivity = this.f$0;
        DialogInterface dialogInterface = (DialogInterface) obj;
        if (i3 != 0) {
            return CreditPlusIntroActivity.onExtraCallback(creditPlusIntroActivity, dialogInterface);
        }
        CreditPlusIntroActivity.onExtraCallback(creditPlusIntroActivity, dialogInterface);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
