package org.apache.commons.lang3.function;

import java.util.function.BiFunction;
import o.PAGRewardItem;
import o.PAGRewardedAd;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Failable$$ExternalSyntheticLambda16 implements BiFunction {
    public final /* synthetic */ PAGRewardedAd f$0;

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return PAGRewardItem.onExtraCallback((PAGRewardedAd<Object, Object, R, E>) this.f$0, obj, obj2);
    }
}
