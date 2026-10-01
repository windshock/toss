package org.apache.commons.lang3.function;

import o.TTAdDislikeToast2;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FailableFunction$$ExternalSyntheticLambda2 implements TTAdDislikeToast2 {
    public final /* synthetic */ TTAdDislikeToast2 f$0;
    public final /* synthetic */ TTAdDislikeToast2 f$1;

    public /* synthetic */ FailableFunction$$ExternalSyntheticLambda2(TTAdDislikeToast2 tTAdDislikeToast2, TTAdDislikeToast2 tTAdDislikeToast22) {
        this.f$0 = tTAdDislikeToast2;
        this.f$1 = tTAdDislikeToast22;
    }

    @Override // o.TTAdDislikeToast2
    public final Object apply(Object obj) {
        return this.f$1.apply(this.f$0.apply(obj));
    }
}
