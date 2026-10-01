package org.apache.commons.lang3.function;

import o.thxycx;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FailablePredicate$$ExternalSyntheticLambda0 implements thxycx {
    public final /* synthetic */ thxycx f$0;
    public final /* synthetic */ thxycx f$1;

    public /* synthetic */ FailablePredicate$$ExternalSyntheticLambda0(thxycx thxycxVar, thxycx thxycxVar2) {
        this.f$0 = thxycxVar;
        this.f$1 = thxycxVar2;
    }

    @Override // o.thxycx
    public final boolean test(Object obj) {
        return thxycx.onWarmupCompleted(this.f$0, this.f$1, obj);
    }
}
