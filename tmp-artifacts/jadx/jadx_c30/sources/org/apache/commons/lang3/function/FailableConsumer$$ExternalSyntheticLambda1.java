package org.apache.commons.lang3.function;

import o.onUserEarnedReward;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FailableConsumer$$ExternalSyntheticLambda1 implements onUserEarnedReward {
    public final /* synthetic */ onUserEarnedReward f$0;
    public final /* synthetic */ onUserEarnedReward f$1;

    public /* synthetic */ FailableConsumer$$ExternalSyntheticLambda1(onUserEarnedReward onuserearnedreward, onUserEarnedReward onuserearnedreward2) {
        this.f$0 = onuserearnedreward;
        this.f$1 = onuserearnedreward2;
    }

    @Override // o.onUserEarnedReward
    public final void accept(Object obj) throws Throwable {
        onUserEarnedReward.onNavigationEvent(this.f$0, this.f$1, obj);
    }
}
