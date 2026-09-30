package im.toss.features.credit.ui.plus.intro;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusIntroActivity$$ExternalSyntheticLambda13 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = CreditPlusIntroActivity.onNavigationEvent((DialogInterface) obj);
        int i4 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return unitOnNavigationEvent;
    }
}
