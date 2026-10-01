package im.toss.features.account_terminator.ui.devtool;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda5 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AccountTerminateDevToolActivity f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;

    public /* synthetic */ AccountTerminateDevToolActivity$$ExternalSyntheticLambda5(AccountTerminateDevToolActivity accountTerminateDevToolActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = accountTerminateDevToolActivity;
        this.f$1 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke() {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallback = AccountTerminateDevToolActivity.onExtraCallback(this.f$0, this.f$1);
            int i3 = 28 / 0;
        } else {
            unitOnExtraCallback = AccountTerminateDevToolActivity.onExtraCallback(this.f$0, this.f$1);
        }
        int i4 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
