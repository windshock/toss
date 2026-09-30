package im.toss.features.credit.ui.plus.intro;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusIntroActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ getTypedExportedConstants f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = CreditPlusIntroActivity.IAuthTabCallback(this.f$0, (View) obj);
        int i4 = onNavigationEvent + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
