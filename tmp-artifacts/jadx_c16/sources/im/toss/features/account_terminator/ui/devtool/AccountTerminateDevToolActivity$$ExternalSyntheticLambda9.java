package im.toss.features.account_terminator.ui.devtool;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.findResAndMsg;
import o.setCurrentIndex;
import o.v1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda9 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ findResAndMsg f$0;
    public final /* synthetic */ v1 f$1;

    public /* synthetic */ AccountTerminateDevToolActivity$$ExternalSyntheticLambda9(findResAndMsg findresandmsg, v1 v1Var) {
        this.f$0 = findresandmsg;
        this.f$1 = v1Var;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, this.f$1};
            int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1};
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) AccountTerminateDevToolActivity.onExtraCallback(1316122999, setCurrentIndex.onNavigationEvent(), -1316122995, setCurrentIndex.onNavigationEvent(), objArr2, iOnNavigationEvent2, setCurrentIndex.onNavigationEvent());
        int i3 = IAuthTabCallback + 117;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
