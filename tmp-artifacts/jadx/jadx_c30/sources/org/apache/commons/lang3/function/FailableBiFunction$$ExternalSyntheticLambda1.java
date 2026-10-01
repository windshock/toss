package org.apache.commons.lang3.function;

import o.PAGRewardedAd;
import o.TTAdDislikeToast2;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FailableBiFunction$$ExternalSyntheticLambda1 implements PAGRewardedAd {
    public final /* synthetic */ PAGRewardedAd f$0;
    public final /* synthetic */ TTAdDislikeToast2 f$1;

    public /* synthetic */ FailableBiFunction$$ExternalSyntheticLambda1(PAGRewardedAd pAGRewardedAd, TTAdDislikeToast2 tTAdDislikeToast2) {
        this.f$0 = pAGRewardedAd;
        this.f$1 = tTAdDislikeToast2;
    }

    @Override // o.PAGRewardedAd
    public final Object apply(Object obj, Object obj2) {
        return this.f$1.apply(this.f$0.apply(obj, obj2));
    }
}
