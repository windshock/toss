package org.apache.commons.lang3.function;

import o.getSkipText;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FailableDoubleUnaryOperator$$ExternalSyntheticLambda3 implements getSkipText {
    public final /* synthetic */ getSkipText f$0;
    public final /* synthetic */ getSkipText f$1;

    public /* synthetic */ FailableDoubleUnaryOperator$$ExternalSyntheticLambda3(getSkipText getskiptext, getSkipText getskiptext2) {
        this.f$0 = getskiptext;
        this.f$1 = getskiptext2;
    }

    @Override // o.getSkipText
    public final double applyAsDouble(double d) {
        return this.f$1.applyAsDouble(this.f$0.applyAsDouble(d));
    }
}
