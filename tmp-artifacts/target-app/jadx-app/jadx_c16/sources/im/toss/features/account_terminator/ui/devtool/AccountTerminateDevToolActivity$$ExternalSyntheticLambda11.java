package im.toss.features.account_terminator.ui.devtool;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getSupportedHighSpeedResolutionsFor;
import o.setCurrentIndex;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda11 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ AccountTerminateDevToolActivity f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;

    public /* synthetic */ AccountTerminateDevToolActivity$$ExternalSyntheticLambda11(AccountTerminateDevToolActivity accountTerminateDevToolActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = accountTerminateDevToolActivity;
        this.f$1 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, this.f$1};
            int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1};
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) AccountTerminateDevToolActivity.onExtraCallback(-988032472, setCurrentIndex.onNavigationEvent(), 988032474, setCurrentIndex.onNavigationEvent(), objArr2, iOnNavigationEvent2, setCurrentIndex.onNavigationEvent());
        int i3 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 48 / 0;
        }
        return unit;
    }
}
