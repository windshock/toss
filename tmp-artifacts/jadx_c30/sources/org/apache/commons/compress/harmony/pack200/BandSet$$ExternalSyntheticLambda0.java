package org.apache.commons.compress.harmony.pack200;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import o.PAGConstant;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class BandSet$$ExternalSyntheticLambda0 implements BiConsumer {
    public final /* synthetic */ Map f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ BandSet$$ExternalSyntheticLambda0(Map map, List list) {
        this.f$0 = map;
        this.f$1 = list;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        PAGConstant.onExtraCallback(this.f$0, this.f$1, (Integer) obj, (Integer) obj2);
    }
}
