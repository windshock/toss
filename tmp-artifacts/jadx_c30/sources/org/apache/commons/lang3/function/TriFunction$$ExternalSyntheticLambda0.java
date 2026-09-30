package org.apache.commons.lang3.function;

import java.util.function.Function;
import o.wwx3;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TriFunction$$ExternalSyntheticLambda0 implements wwx3 {
    public final /* synthetic */ wwx3 f$0;
    public final /* synthetic */ Function f$1;

    public /* synthetic */ TriFunction$$ExternalSyntheticLambda0(wwx3 wwx3Var, Function function) {
        this.f$0 = wwx3Var;
        this.f$1 = function;
    }

    @Override // o.wwx3
    public final Object apply(Object obj, Object obj2, Object obj3) {
        return this.f$1.apply(this.f$0.apply(obj, obj2, obj3));
    }
}
