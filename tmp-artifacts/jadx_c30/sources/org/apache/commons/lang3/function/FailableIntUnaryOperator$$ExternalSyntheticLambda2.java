package org.apache.commons.lang3.function;

import o.ok2;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FailableIntUnaryOperator$$ExternalSyntheticLambda2 implements ok2 {
    public final /* synthetic */ ok2 f$0;
    public final /* synthetic */ ok2 f$1;

    public /* synthetic */ FailableIntUnaryOperator$$ExternalSyntheticLambda2(ok2 ok2Var, ok2 ok2Var2) {
        this.f$0 = ok2Var;
        this.f$1 = ok2Var2;
    }

    @Override // o.ok2
    public final int applyAsInt(int i) {
        return this.f$1.applyAsInt(this.f$0.applyAsInt(i));
    }
}
