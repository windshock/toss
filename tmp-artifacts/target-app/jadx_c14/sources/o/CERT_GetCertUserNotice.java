package o;

import viva.republica.toss.account.di.AccountModule;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetCertUserNotice implements captureStartValues<interceptSwitchPage> {
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public interceptSwitchPage get() {
        return onExtraCallback();
    }

    public static interceptSwitchPage onExtraCallback() {
        return (interceptSwitchPage) createAnimator.onNavigationEvent(AccountModule.IAuthTabCallback.onWarmupCompleted());
    }
}
