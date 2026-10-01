package org.snakeyaml.engine.v2.api.lowlevel;

import java.io.InputStream;
import java.util.Iterator;
import o.sya13;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Compose$$ExternalSyntheticLambda1 implements Iterable {
    public final /* synthetic */ sya13 f$0;
    public final /* synthetic */ InputStream f$1;

    public /* synthetic */ Compose$$ExternalSyntheticLambda1(sya13 sya13Var, InputStream inputStream) {
        this.f$0 = sya13Var;
        this.f$1 = inputStream;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return sya13.onExtraCallbackWithResult(this.f$0, this.f$1);
    }
}
