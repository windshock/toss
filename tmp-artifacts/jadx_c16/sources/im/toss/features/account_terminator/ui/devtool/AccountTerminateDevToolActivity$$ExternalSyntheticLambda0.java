package im.toss.features.account_terminator.ui.devtool;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import o.SessionTrackerb;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda0 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ SessionTrackerb f$0;
    public final /* synthetic */ Context f$1;

    public /* synthetic */ AccountTerminateDevToolActivity$$ExternalSyntheticLambda0(SessionTrackerb sessionTrackerb, Context context) {
        this.f$0 = sessionTrackerb;
        this.f$1 = context;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.f$0;
        if (i3 != 0) {
            return AccountTerminateDevToolActivity.IAuthTabCallback(sessionTrackerb, this.f$1);
        }
        int i4 = 79 / 0;
        return AccountTerminateDevToolActivity.IAuthTabCallback(sessionTrackerb, this.f$1);
    }
}
