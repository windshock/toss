package org.apache.commons.compress.harmony.pack200;

import java.util.Map;
import java.util.function.Consumer;
import o.PAGLoadListener;
import o.onAdShow;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CpBands$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ Map f$0;
    public final /* synthetic */ Map f$1;

    public /* synthetic */ CpBands$$ExternalSyntheticLambda2(Map map, Map map2) {
        this.f$0 = map;
        this.f$1 = map2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        PAGLoadListener.onWarmupCompleted(this.f$0, this.f$1, (onAdShow) obj);
    }
}
