package org.apache.commons.lang3;

import java.util.function.Supplier;
import o.PAGVideoMediaView1;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Validate$$ExternalSyntheticLambda4 implements Supplier {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Object[] f$1;

    public /* synthetic */ Validate$$ExternalSyntheticLambda4(String str, Object[] objArr) {
        this.f$0 = str;
        this.f$1 = objArr;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return PAGVideoMediaView1.onExtraCallback(this.f$0, this.f$1);
    }
}
