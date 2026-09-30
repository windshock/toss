package org.apache.commons.lang3.function;

import java.util.function.Consumer;
import o.PAGRewardItem;
import o.onUserEarnedReward;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Failable$$ExternalSyntheticLambda6 implements Consumer {
    public final /* synthetic */ onUserEarnedReward f$0;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        PAGRewardItem.onExtraCallback((onUserEarnedReward<Object, E>) this.f$0, obj);
    }
}
