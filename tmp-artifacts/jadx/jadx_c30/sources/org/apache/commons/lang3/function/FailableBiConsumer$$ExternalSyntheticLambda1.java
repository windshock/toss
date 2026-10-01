package org.apache.commons.lang3.function;

import o.PAGRewardFullExpressAdListenerProxy4;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FailableBiConsumer$$ExternalSyntheticLambda1 implements PAGRewardFullExpressAdListenerProxy4 {
    public final /* synthetic */ PAGRewardFullExpressAdListenerProxy4 f$0;
    public final /* synthetic */ PAGRewardFullExpressAdListenerProxy4 f$1;

    public /* synthetic */ FailableBiConsumer$$ExternalSyntheticLambda1(PAGRewardFullExpressAdListenerProxy4 pAGRewardFullExpressAdListenerProxy4, PAGRewardFullExpressAdListenerProxy4 pAGRewardFullExpressAdListenerProxy42) {
        this.f$0 = pAGRewardFullExpressAdListenerProxy4;
        this.f$1 = pAGRewardFullExpressAdListenerProxy42;
    }

    @Override // o.PAGRewardFullExpressAdListenerProxy4
    public final void accept(Object obj, Object obj2) throws Throwable {
        PAGRewardFullExpressAdListenerProxy4.onWarmupCompleted(this.f$0, this.f$1, obj, obj2);
    }
}
