package org.apache.commons.lang3.function;

import o.thx4;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FailableLongPredicate$$ExternalSyntheticLambda0 implements thx4 {
    public final /* synthetic */ thx4 f$0;
    public final /* synthetic */ thx4 f$1;

    public /* synthetic */ FailableLongPredicate$$ExternalSyntheticLambda0(thx4 thx4Var, thx4 thx4Var2) {
        this.f$0 = thx4Var;
        this.f$1 = thx4Var2;
    }

    @Override // o.thx4
    public final boolean test(long j) {
        return thx4.onExtraCallback(this.f$0, this.f$1, j);
    }
}
