package im.toss.features.account_terminator.ui.devtool;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.findResAndMsg;
import o.getSupportedHighSpeedResolutionsFor;
import o.getWidthSpec;
import o.setCurrentIndex;
import o.v1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda23 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AccountTerminateDevToolActivity f$0;
    public final /* synthetic */ getWidthSpec f$1;
    public final /* synthetic */ findResAndMsg f$2;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$3;
    public final /* synthetic */ v1 f$4;

    public /* synthetic */ AccountTerminateDevToolActivity$$ExternalSyntheticLambda23(AccountTerminateDevToolActivity accountTerminateDevToolActivity, getWidthSpec getwidthspec, findResAndMsg findresandmsg, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, v1 v1Var) {
        this.f$0 = accountTerminateDevToolActivity;
        this.f$1 = getwidthspec;
        this.f$2 = findresandmsg;
        this.f$3 = getsupportedhighspeedresolutionsfor;
        this.f$4 = v1Var;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, this.f$2, this.f$3, this.f$4};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) AccountTerminateDevToolActivity.onExtraCallback(1808540431, setCurrentIndex.onNavigationEvent(), -1808540428, setCurrentIndex.onNavigationEvent(), objArr, iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
        int i4 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
