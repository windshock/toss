package o;

import im.toss.feature.credit.terms.module.CreditTermsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getAntSpOptSwitch implements captureStartValues<setSwitchJudgmentListener> {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public /* synthetic */ Object get() {
        setSwitchJudgmentListener setswitchjudgmentlistenerOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            setswitchjudgmentlistenerOnWarmupCompleted = onWarmupCompleted();
            int i3 = 95 / 0;
        } else {
            setswitchjudgmentlistenerOnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = IAuthTabCallback + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return setswitchjudgmentlistenerOnWarmupCompleted;
    }

    public setSwitchJudgmentListener onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        throw null;
    }

    public static setSwitchJudgmentListener onExtraCallback() {
        setSwitchJudgmentListener setswitchjudgmentlistener;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            setswitchjudgmentlistener = (setSwitchJudgmentListener) createAnimator.onNavigationEvent(CreditTermsModule.onWarmupCompleted.IAuthTabCallback());
            int i3 = 45 / 0;
        } else {
            setswitchjudgmentlistener = (setSwitchJudgmentListener) createAnimator.onNavigationEvent(CreditTermsModule.onWarmupCompleted.IAuthTabCallback());
        }
        int i4 = onWarmupCompleted + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return setswitchjudgmentlistener;
    }
}
