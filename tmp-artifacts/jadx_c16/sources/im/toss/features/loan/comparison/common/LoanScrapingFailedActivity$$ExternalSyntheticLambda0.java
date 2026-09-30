package im.toss.features.loan.comparison.common;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanScrapingFailedActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanScrapingFailedActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallback = LoanScrapingFailedActivity.onExtraCallback(this.f$0, (View) obj);
            int i3 = 14 / 0;
        } else {
            unitOnExtraCallback = LoanScrapingFailedActivity.onExtraCallback(this.f$0, (View) obj);
        }
        int i4 = onNavigationEvent + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
