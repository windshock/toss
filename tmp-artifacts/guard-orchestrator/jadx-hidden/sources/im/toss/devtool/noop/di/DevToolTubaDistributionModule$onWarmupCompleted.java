package im.toss.devtool.noop.di;

import javax.inject.Inject;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.UtilsKtExternalSyntheticLambda5;

/* loaded from: classes.dex */
public final class DevToolTubaDistributionModule$onWarmupCompleted implements UtilsKtExternalSyntheticLambda5 {
    static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(DevToolTubaDistributionModule$onWarmupCompleted.class);

    public boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4295);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2457);
        return false;
    }

    @Inject
    public DevToolTubaDistributionModule$onWarmupCompleted() {
    }
}
