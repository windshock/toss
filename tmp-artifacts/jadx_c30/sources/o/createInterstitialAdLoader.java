package o;

import java.util.List;
import java.util.function.Consumer;
import o.getCurrentOrientationInlineAdaptiveBannerAdSize;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class createInterstitialAdLoader extends createNativeAdLoader {
    ISDKTypeFactory IAuthTabCallback;
    protected final ISDKTypeFactory onExtraCallback;
    List<getCurrentOrientationInlineAdaptiveBannerAdSize> onExtraCallbackWithResult;
    short onNavigationEvent;
    transient int onTransact;
    transient int onWarmupCompleted;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        createInterstitialAdLoader createinterstitialadloader = (createInterstitialAdLoader) obj;
        return this.onExtraCallbackWithResult.equals(createinterstitialadloader.onExtraCallbackWithResult) && this.onExtraCallback.equals(createinterstitialadloader.onExtraCallback) && this.onNavigationEvent == createinterstitialadloader.onNavigationEvent && this.IAuthTabCallback.equals(createinterstitialadloader.IAuthTabCallback);
    }

    public int hashCode() {
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        return ((((((iHashCode + 31) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onNavigationEvent) * 31) + this.IAuthTabCallback.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.createNativeAdLoader
    public void onExtraCallback(final createRewardAdLoader createrewardadloader) {
        super.onExtraCallback(createrewardadloader);
        this.onTransact = createrewardadloader.IAuthTabCallback(this.IAuthTabCallback);
        this.onWarmupCompleted = createrewardadloader.IAuthTabCallback(this.onExtraCallback);
        this.onExtraCallbackWithResult.forEach(new Consumer() { // from class: org.apache.commons.compress.harmony.unpack200.bytecode.CPMember$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((getCurrentOrientationInlineAdaptiveBannerAdSize) obj).onExtraCallback(createrewardadloader);
            }
        });
    }

    public String toString() {
        return "CPMember: " + this.IAuthTabCallback + "(" + this.onExtraCallback + ")";
    }
}
