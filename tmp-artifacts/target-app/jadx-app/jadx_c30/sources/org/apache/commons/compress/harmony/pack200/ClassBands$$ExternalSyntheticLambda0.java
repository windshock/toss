package org.apache.commons.compress.harmony.pack200;

import java.util.function.IntFunction;
import o.addNetworkExtrasBundle;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ClassBands$$ExternalSyntheticLambda0 implements IntFunction {
    public final /* synthetic */ addNetworkExtrasBundle f$0;
    public final /* synthetic */ String[] f$1;

    public /* synthetic */ ClassBands$$ExternalSyntheticLambda0(addNetworkExtrasBundle addnetworkextrasbundle, String[] strArr) {
        this.f$0 = addnetworkextrasbundle;
        this.f$1 = strArr;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        return this.f$0.onExtraCallback.onWarmupCompleted(this.f$1[i]);
    }
}
