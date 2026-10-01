package org.apache.commons.compress.harmony.pack200;

import java.util.List;
import java.util.function.IntUnaryOperator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CpBands$$ExternalSyntheticLambda5 implements IntUnaryOperator {
    public final /* synthetic */ List f$0;

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        return ((Character) this.f$0.remove(0)).charValue();
    }
}
