package org.apache.commons.lang3.function;

import o.PAGRewardedAdInteractionCallback;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FailableBiPredicate$$ExternalSyntheticLambda2 implements PAGRewardedAdInteractionCallback {
    public final /* synthetic */ PAGRewardedAdInteractionCallback f$0;
    public final /* synthetic */ PAGRewardedAdInteractionCallback f$1;

    public /* synthetic */ FailableBiPredicate$$ExternalSyntheticLambda2(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback, PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback2) {
        this.f$0 = pAGRewardedAdInteractionCallback;
        this.f$1 = pAGRewardedAdInteractionCallback2;
    }

    @Override // o.PAGRewardedAdInteractionCallback
    public final boolean test(Object obj, Object obj2) {
        return PAGRewardedAdInteractionCallback.onExtraCallbackWithResult(this.f$0, this.f$1, obj, obj2);
    }
}
