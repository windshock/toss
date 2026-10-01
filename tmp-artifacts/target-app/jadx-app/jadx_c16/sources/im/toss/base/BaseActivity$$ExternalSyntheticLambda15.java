package im.toss.base;

import im.toss.uikit.widget.snackbar.TdsToastV1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SessionTracker;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseActivity$$ExternalSyntheticLambda15 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ SessionTracker f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SessionTracker sessionTracker = this.f$0;
        TdsToastV1 tdsToastV1 = (TdsToastV1) obj;
        if (i3 != 0) {
            return BaseActivity.onNavigationEvent(sessionTracker, tdsToastV1);
        }
        Unit unitOnNavigationEvent = BaseActivity.onNavigationEvent(sessionTracker, tdsToastV1);
        int i4 = 59 / 0;
        return unitOnNavigationEvent;
    }
}
