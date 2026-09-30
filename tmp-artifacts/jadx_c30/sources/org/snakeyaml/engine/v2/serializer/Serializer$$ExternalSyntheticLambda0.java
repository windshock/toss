package org.snakeyaml.engine.v2.serializer;

import java.util.function.Function;
import o.lt33;
import o.uh2;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Serializer$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ lt33 f$0;
    public final /* synthetic */ uh2 f$1;

    public /* synthetic */ Serializer$$ExternalSyntheticLambda0(lt33 lt33Var, uh2 uh2Var) {
        this.f$0 = lt33Var;
        this.f$1 = uh2Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return this.f$0.onNavigationEvent.onExtraCallback().onNavigationEvent(this.f$1);
    }
}
