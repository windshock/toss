package org.snakeyaml.engine.v2.api.lowlevel;

import java.io.InputStream;
import java.util.Iterator;
import o.sya16;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Parse$$ExternalSyntheticLambda1 implements Iterable {
    public final /* synthetic */ sya16 f$0;
    public final /* synthetic */ InputStream f$1;

    public /* synthetic */ Parse$$ExternalSyntheticLambda1(sya16 sya16Var, InputStream inputStream) {
        this.f$0 = sya16Var;
        this.f$1 = inputStream;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return sya16.IAuthTabCallback(this.f$0, this.f$1);
    }
}
