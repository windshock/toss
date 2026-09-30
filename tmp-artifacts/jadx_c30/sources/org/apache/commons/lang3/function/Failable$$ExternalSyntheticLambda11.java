package org.apache.commons.lang3.function;

import o.PAGRewardedAdLoadListener;
import o.thx5;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Failable$$ExternalSyntheticLambda11 implements thx5 {
    public final /* synthetic */ PAGRewardedAdLoadListener f$0;
    public final /* synthetic */ double f$1;

    public /* synthetic */ Failable$$ExternalSyntheticLambda11(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, double d) {
        this.f$0 = pAGRewardedAdLoadListener;
        this.f$1 = d;
    }

    @Override // o.thx5
    public final void run() throws Throwable {
        this.f$0.accept(this.f$1);
    }
}
