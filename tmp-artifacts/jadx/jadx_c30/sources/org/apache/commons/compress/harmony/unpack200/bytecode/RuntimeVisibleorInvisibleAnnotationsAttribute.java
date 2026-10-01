package org.apache.commons.compress.harmony.unpack200.bytecode;

import o.PAGBannerAdWrapperListener;
import o.createRewardAdLoader;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RuntimeVisibleorInvisibleAnnotationsAttribute extends PAGBannerAdWrapperListener {
    private final int IAuthTabCallback;
    private final PAGBannerAdWrapperListener.onExtraCallbackWithResult[] onExtraCallback;

    @Override // o.getCurrentOrientationInlineAdaptiveBannerAdSize
    public int IAuthTabCallback() {
        int iOnNavigationEvent = 2;
        for (int i = 0; i < this.IAuthTabCallback; i++) {
            iOnNavigationEvent += this.onExtraCallback[i].onNavigationEvent();
        }
        return iOnNavigationEvent;
    }

    @Override // o.getCurrentOrientationInlineAdaptiveBannerAdSize, o.createNativeAdLoader
    public void onExtraCallback(createRewardAdLoader createrewardadloader) {
        super.onExtraCallback(createrewardadloader);
        for (PAGBannerAdWrapperListener.onExtraCallbackWithResult onextracallbackwithresult : this.onExtraCallback) {
            onextracallbackwithresult.onWarmupCompleted(createrewardadloader);
        }
    }

    public String toString() {
        return this.onExtraCallbackWithResult.IAuthTabCallback() + ": " + this.IAuthTabCallback + " annotations";
    }
}
