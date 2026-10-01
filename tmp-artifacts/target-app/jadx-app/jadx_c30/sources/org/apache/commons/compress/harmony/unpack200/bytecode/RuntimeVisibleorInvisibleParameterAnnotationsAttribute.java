package org.apache.commons.compress.harmony.unpack200.bytecode;

import o.PAGBannerAdWrapperListener;
import o.createRewardAdLoader;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RuntimeVisibleorInvisibleParameterAnnotationsAttribute extends PAGBannerAdWrapperListener {
    private final int IAuthTabCallback;
    private final ParameterAnnotation[] onNavigationEvent;

    public static class ParameterAnnotation {
        private final PAGBannerAdWrapperListener.onExtraCallbackWithResult[] IAuthTabCallback;

        public int onNavigationEvent() {
            int iOnNavigationEvent = 2;
            for (PAGBannerAdWrapperListener.onExtraCallbackWithResult onextracallbackwithresult : this.IAuthTabCallback) {
                iOnNavigationEvent += onextracallbackwithresult.onNavigationEvent();
            }
            return iOnNavigationEvent;
        }

        public void onExtraCallback(createRewardAdLoader createrewardadloader) {
            for (PAGBannerAdWrapperListener.onExtraCallbackWithResult onextracallbackwithresult : this.IAuthTabCallback) {
                onextracallbackwithresult.onWarmupCompleted(createrewardadloader);
            }
        }
    }

    @Override // o.getCurrentOrientationInlineAdaptiveBannerAdSize
    public int IAuthTabCallback() {
        int iOnNavigationEvent = 1;
        for (int i = 0; i < this.IAuthTabCallback; i++) {
            iOnNavigationEvent += this.onNavigationEvent[i].onNavigationEvent();
        }
        return iOnNavigationEvent;
    }

    @Override // o.getCurrentOrientationInlineAdaptiveBannerAdSize, o.createNativeAdLoader
    public void onExtraCallback(createRewardAdLoader createrewardadloader) {
        super.onExtraCallback(createrewardadloader);
        for (ParameterAnnotation parameterAnnotation : this.onNavigationEvent) {
            parameterAnnotation.onExtraCallback(createrewardadloader);
        }
    }

    public String toString() {
        return this.onExtraCallbackWithResult.IAuthTabCallback() + ": " + this.IAuthTabCallback + " parameter annotations";
    }
}
