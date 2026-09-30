package org.apache.commons.lang3.function;

import java.util.concurrent.Callable;
import o.PAGRewardItem;
import o.onUserEarnedRewardFail;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Failable$$ExternalSyntheticLambda18 implements Callable {
    public final /* synthetic */ onUserEarnedRewardFail f$0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return PAGRewardItem.onExtraCallbackWithResult(this.f$0);
    }
}
