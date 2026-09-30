package org.apache.commons.compress.harmony.unpack200;

import java.util.Iterator;
import java.util.function.IntFunction;
import o.PAGBannerAdLoadCallback;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class MetadataBandGroup$$ExternalSyntheticLambda0 implements IntFunction {
    public final /* synthetic */ PAGBannerAdLoadCallback f$0;
    public final /* synthetic */ int[] f$1;
    public final /* synthetic */ Iterator f$2;

    public /* synthetic */ MetadataBandGroup$$ExternalSyntheticLambda0(PAGBannerAdLoadCallback pAGBannerAdLoadCallback, int[] iArr, Iterator it) {
        this.f$0 = pAGBannerAdLoadCallback;
        this.f$1 = iArr;
        this.f$2 = it;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        PAGBannerAdLoadCallback pAGBannerAdLoadCallback = this.f$0;
        return pAGBannerAdLoadCallback.onNavigationEvent(pAGBannerAdLoadCallback.IAuthTabCallback_Parcel[pAGBannerAdLoadCallback.access100 - 1][i], this.f$1[i], this.f$2);
    }
}
