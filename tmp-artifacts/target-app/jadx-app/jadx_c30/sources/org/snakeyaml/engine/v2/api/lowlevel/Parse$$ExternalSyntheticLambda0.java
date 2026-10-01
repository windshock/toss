package org.snakeyaml.engine.v2.api.lowlevel;

import java.io.Reader;
import java.util.Iterator;
import o.sya16;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Parse$$ExternalSyntheticLambda0 implements Iterable {
    public final /* synthetic */ sya16 f$0;
    public final /* synthetic */ Reader f$1;

    public /* synthetic */ Parse$$ExternalSyntheticLambda0(sya16 sya16Var, Reader reader) {
        this.f$0 = sya16Var;
        this.f$1 = reader;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return sya16.onExtraCallback(this.f$0, this.f$1);
    }
}
