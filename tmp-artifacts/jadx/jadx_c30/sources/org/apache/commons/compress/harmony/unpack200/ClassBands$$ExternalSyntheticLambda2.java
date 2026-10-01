package org.apache.commons.compress.harmony.unpack200;

import java.util.function.IntUnaryOperator;
import o.PAGBannerRequest;
import o.getBannerSize;
import o.setAdInteractionListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ClassBands$$ExternalSyntheticLambda2 implements IntUnaryOperator {
    public final /* synthetic */ getBannerSize f$0;
    public final /* synthetic */ setAdInteractionListener[] f$1;

    public /* synthetic */ ClassBands$$ExternalSyntheticLambda2(getBannerSize getbannersize, setAdInteractionListener[] setadinteractionlistenerArr) {
        this.f$0 = getbannersize;
        this.f$1 = setadinteractionlistenerArr;
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        return PAGBannerRequest.onWarmupCompleted(this.f$0.onExtraCallback, this.f$1[i]);
    }
}
