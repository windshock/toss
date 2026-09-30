package org.apache.commons.lang3.function;

import o.PAGRewardedAdInteractionListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Failable$$ExternalSyntheticLambda1 {
    public final /* synthetic */ PAGRewardedAdInteractionListener f$0;
    public final /* synthetic */ double f$1;
    public final /* synthetic */ double f$2;

    public /* synthetic */ Failable$$ExternalSyntheticLambda1(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener, double d, double d2) {
        this.f$0 = pAGRewardedAdInteractionListener;
        this.f$1 = d;
        this.f$2 = d2;
    }

    public final double getAsDouble() {
        return this.f$0.onWarmupCompleted(this.f$1, this.f$2);
    }
}
