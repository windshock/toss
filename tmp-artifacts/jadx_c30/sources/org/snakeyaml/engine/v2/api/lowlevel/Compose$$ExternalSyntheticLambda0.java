package org.snakeyaml.engine.v2.api.lowlevel;

import java.io.Reader;
import java.util.Iterator;
import o.sya13;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Compose$$ExternalSyntheticLambda0 implements Iterable {
    public final /* synthetic */ sya13 f$0;
    public final /* synthetic */ Reader f$1;

    public /* synthetic */ Compose$$ExternalSyntheticLambda0(sya13 sya13Var, Reader reader) {
        this.f$0 = sya13Var;
        this.f$1 = reader;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return sya13.onExtraCallback(this.f$0, this.f$1);
    }
}
