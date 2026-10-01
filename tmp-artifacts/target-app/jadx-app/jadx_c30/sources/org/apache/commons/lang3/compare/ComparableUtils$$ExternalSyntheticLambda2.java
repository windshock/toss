package org.apache.commons.lang3.compare;

import java.util.function.Predicate;
import o.PAGRewardFullExpressAdListenerProxy1;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ComparableUtils$$ExternalSyntheticLambda2 implements Predicate {
    public final /* synthetic */ Comparable f$0;
    public final /* synthetic */ Comparable f$1;

    public /* synthetic */ ComparableUtils$$ExternalSyntheticLambda2(Comparable comparable, Comparable comparable2) {
        this.f$0 = comparable;
        this.f$1 = comparable2;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return PAGRewardFullExpressAdListenerProxy1.IAuthTabCallback((Comparable) obj).onExtraCallback(this.f$0, this.f$1);
    }
}
