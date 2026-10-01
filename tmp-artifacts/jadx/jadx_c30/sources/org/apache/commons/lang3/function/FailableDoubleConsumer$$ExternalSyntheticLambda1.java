package org.apache.commons.lang3.function;

import o.PAGRewardedAdLoadListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FailableDoubleConsumer$$ExternalSyntheticLambda1 implements PAGRewardedAdLoadListener {
    public final /* synthetic */ PAGRewardedAdLoadListener f$0;
    public final /* synthetic */ PAGRewardedAdLoadListener f$1;

    public /* synthetic */ FailableDoubleConsumer$$ExternalSyntheticLambda1(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAdLoadListener pAGRewardedAdLoadListener2) {
        this.f$0 = pAGRewardedAdLoadListener;
        this.f$1 = pAGRewardedAdLoadListener2;
    }

    @Override // o.PAGRewardedAdLoadListener
    public final void accept(double d) throws Throwable {
        PAGRewardedAdLoadListener.onExtraCallbackWithResult(this.f$0, this.f$1, d);
    }
}
