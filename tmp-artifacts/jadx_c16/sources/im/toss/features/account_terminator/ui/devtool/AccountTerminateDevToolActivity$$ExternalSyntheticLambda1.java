package im.toss.features.account_terminator.ui.devtool;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.findResAndMsg;
import o.v1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ findResAndMsg f$0;
    public final /* synthetic */ v1 f$1;

    public /* synthetic */ AccountTerminateDevToolActivity$$ExternalSyntheticLambda1(findResAndMsg findresandmsg, v1 v1Var) {
        this.f$0 = findresandmsg;
        this.f$1 = v1Var;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            AccountTerminateDevToolActivity.onExtraCallback(this.f$0, this.f$1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = AccountTerminateDevToolActivity.onExtraCallback(this.f$0, this.f$1);
        int i3 = onNavigationEvent + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
