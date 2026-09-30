package o;

import im.toss.feature.credit.terms.domain.usecase.RefreshCreditTermGroupCacheUseCase;
import im.toss.feature.credit.terms.module.CreditTermsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getBeehiveOptSwitch implements captureStartValues<RefreshCreditTermGroupCacheUseCase> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final createAnimators<setConfig> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RefreshCreditTermGroupCacheUseCase refreshCreditTermGroupCacheUseCaseOnNavigationEvent = onNavigationEvent();
        int i4 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return refreshCreditTermGroupCacheUseCaseOnNavigationEvent;
    }

    public RefreshCreditTermGroupCacheUseCase onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RefreshCreditTermGroupCacheUseCase refreshCreditTermGroupCacheUseCaseOnExtraCallback = onExtraCallback((setConfig) this.onExtraCallback.get());
        int i4 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return refreshCreditTermGroupCacheUseCaseOnExtraCallback;
        }
        throw null;
    }

    public static RefreshCreditTermGroupCacheUseCase onExtraCallback(setConfig setconfig) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RefreshCreditTermGroupCacheUseCase refreshCreditTermGroupCacheUseCase = (RefreshCreditTermGroupCacheUseCase) createAnimator.onNavigationEvent(CreditTermsModule.onWarmupCompleted.onExtraCallbackWithResult(setconfig));
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return refreshCreditTermGroupCacheUseCase;
    }
}
