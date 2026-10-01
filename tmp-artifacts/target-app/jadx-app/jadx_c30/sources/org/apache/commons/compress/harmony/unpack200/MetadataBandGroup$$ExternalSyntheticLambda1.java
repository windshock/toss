package org.apache.commons.compress.harmony.unpack200;

import java.util.Iterator;
import java.util.function.IntFunction;
import o.ISDKTypeFactory;
import o.PAGBannerAdLoadCallback;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class MetadataBandGroup$$ExternalSyntheticLambda1 implements IntFunction {
    public final /* synthetic */ PAGBannerAdLoadCallback f$0;
    public final /* synthetic */ ISDKTypeFactory[] f$1;
    public final /* synthetic */ int[] f$2;
    public final /* synthetic */ Iterator f$3;

    public /* synthetic */ MetadataBandGroup$$ExternalSyntheticLambda1(PAGBannerAdLoadCallback pAGBannerAdLoadCallback, ISDKTypeFactory[] iSDKTypeFactoryArr, int[] iArr, Iterator it) {
        this.f$0 = pAGBannerAdLoadCallback;
        this.f$1 = iSDKTypeFactoryArr;
        this.f$2 = iArr;
        this.f$3 = it;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        return this.f$0.onNavigationEvent(this.f$1[i], this.f$2[i], this.f$3);
    }
}
