package org.apache.commons.lang3.function;

import java.util.function.BiPredicate;
import o.PAGRewardItem;
import o.PAGRewardedAdInteractionCallback;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Failable$$ExternalSyntheticLambda0 implements BiPredicate {
    public final /* synthetic */ PAGRewardedAdInteractionCallback f$0;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        return PAGRewardItem.IAuthTabCallback((PAGRewardedAdInteractionCallback<Object, Object, E>) this.f$0, obj, obj2);
    }
}
