package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.util.List;
import java.util.function.IntUnaryOperator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class BCIRenumberedAttribute$$ExternalSyntheticLambda0 implements IntUnaryOperator {
    public final /* synthetic */ List f$0;
    public final /* synthetic */ int[] f$1;

    public /* synthetic */ BCIRenumberedAttribute$$ExternalSyntheticLambda0(List list, int[] iArr) {
        this.f$0 = list;
        this.f$1 = iArr;
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        return ((Integer) this.f$0.get(this.f$1[i])).intValue();
    }
}
