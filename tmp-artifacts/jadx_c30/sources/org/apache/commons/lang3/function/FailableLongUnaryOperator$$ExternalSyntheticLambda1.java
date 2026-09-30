package org.apache.commons.lang3.function;

import o.thx7;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FailableLongUnaryOperator$$ExternalSyntheticLambda1 implements thx7 {
    public final /* synthetic */ thx7 f$0;
    public final /* synthetic */ thx7 f$1;

    public /* synthetic */ FailableLongUnaryOperator$$ExternalSyntheticLambda1(thx7 thx7Var, thx7 thx7Var2) {
        this.f$0 = thx7Var;
        this.f$1 = thx7Var2;
    }

    @Override // o.thx7
    public final long applyAsLong(long j) {
        return this.f$1.applyAsLong(this.f$0.applyAsLong(j));
    }
}
