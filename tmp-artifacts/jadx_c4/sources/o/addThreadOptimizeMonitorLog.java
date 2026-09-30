package o;

import im.toss.feature.credit.terms.data.source.impl.RemoteCreditTermDataSource;
import im.toss.feature.credit.terms.module.CreditTermsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addThreadOptimizeMonitorLog implements captureStartValues<RemoteCreditTermDataSource> {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<getQuestionnaireOptSwitch> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RemoteCreditTermDataSource remoteCreditTermDataSourceOnWarmupCompleted = onWarmupCompleted();
        int i4 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return remoteCreditTermDataSourceOnWarmupCompleted;
    }

    public RemoteCreditTermDataSource onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        RemoteCreditTermDataSource remoteCreditTermDataSourceOnExtraCallback = onExtraCallback((getQuestionnaireOptSwitch) this.onExtraCallback.get());
        int i4 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return remoteCreditTermDataSourceOnExtraCallback;
    }

    public static RemoteCreditTermDataSource onExtraCallback(getQuestionnaireOptSwitch getquestionnaireoptswitch) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        RemoteCreditTermDataSource remoteCreditTermDataSource = (RemoteCreditTermDataSource) createAnimator.onNavigationEvent(CreditTermsModule.onWarmupCompleted.onExtraCallbackWithResult(getquestionnaireoptswitch));
        int i3 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return remoteCreditTermDataSource;
        }
        throw null;
    }
}
