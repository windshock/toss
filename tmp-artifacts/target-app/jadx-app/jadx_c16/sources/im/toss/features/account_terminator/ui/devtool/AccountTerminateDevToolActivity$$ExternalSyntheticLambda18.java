package im.toss.features.account_terminator.ui.devtool;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.findResAndMsg;
import o.getSupportedHighSpeedResolutionsFor;
import o.specToLayoutParam;
import o.v1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda18 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AccountTerminateDevToolActivity f$0;
    public final /* synthetic */ specToLayoutParam f$1;
    public final /* synthetic */ findResAndMsg f$2;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$3;
    public final /* synthetic */ v1 f$4;

    public /* synthetic */ AccountTerminateDevToolActivity$$ExternalSyntheticLambda18(AccountTerminateDevToolActivity accountTerminateDevToolActivity, specToLayoutParam spectolayoutparam, findResAndMsg findresandmsg, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, v1 v1Var) {
        this.f$0 = accountTerminateDevToolActivity;
        this.f$1 = spectolayoutparam;
        this.f$2 = findresandmsg;
        this.f$3 = getsupportedhighspeedresolutionsfor;
        this.f$4 = v1Var;
    }

    public final Object invoke() {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            unitIAuthTabCallback = AccountTerminateDevToolActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
            int i3 = 50 / 0;
        } else {
            unitIAuthTabCallback = AccountTerminateDevToolActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
        }
        int i4 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return unitIAuthTabCallback;
    }
}
