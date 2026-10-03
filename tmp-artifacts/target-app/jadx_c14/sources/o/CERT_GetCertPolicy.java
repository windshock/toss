package o;

import viva.republica.toss.account.di.AccountModule;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetCertPolicy implements captureStartValues<PageSwitchInterceptPoint> {
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public PageSwitchInterceptPoint get() {
        return onWarmupCompleted();
    }

    public static PageSwitchInterceptPoint onWarmupCompleted() {
        return (PageSwitchInterceptPoint) createAnimator.onNavigationEvent(AccountModule.IAuthTabCallback.onNavigationEvent());
    }
}
