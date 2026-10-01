package org.apache.commons.lang3;

import o.PAGRewardFullExpressAdListenerProxy4;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ObjectUtils$$ExternalSyntheticLambda0 implements PAGRewardFullExpressAdListenerProxy4 {
    public final /* synthetic */ Object f$0;

    @Override // o.PAGRewardFullExpressAdListenerProxy4
    public final void accept(Object obj, Object obj2) throws InterruptedException {
        this.f$0.wait(((Long) obj).longValue(), ((Integer) obj2).intValue());
    }
}
