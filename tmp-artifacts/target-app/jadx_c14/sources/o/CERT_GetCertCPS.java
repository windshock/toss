package o;

import viva.republica.toss.account.di.AccountModule;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetCertCPS implements captureStartValues<onStarted> {
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public onStarted get() {
        return onExtraCallback();
    }

    public static onStarted onExtraCallback() {
        return (onStarted) createAnimator.onNavigationEvent(AccountModule.IAuthTabCallback.onExtraCallback());
    }
}
