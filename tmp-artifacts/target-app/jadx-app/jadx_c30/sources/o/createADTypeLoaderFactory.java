package o;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import o.getCurrentOrientationInlineAdaptiveBannerAdSize;
import o.getSdkTypeFactory;
import o.getSlotId;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class createADTypeLoaderFactory extends getCurrentOrientationAnchoredAdaptiveBannerAdSize {
    public List<getSdkTypeFactory> IAuthTabCallback;
    public int onExtraCallback;
    public List<getCurrentOrientationInlineAdaptiveBannerAdSize> onNavigationEvent;
    public List<getSlotId> onWarmupCompleted;

    @Override // o.getCurrentOrientationAnchoredAdaptiveBannerAdSize, o.getCurrentOrientationInlineAdaptiveBannerAdSize
    protected int IAuthTabCallback() {
        Iterator<getCurrentOrientationInlineAdaptiveBannerAdSize> it = this.onNavigationEvent.iterator();
        int iOnExtraCallbackWithResult = 0;
        while (it.hasNext()) {
            iOnExtraCallbackWithResult += it.next().onExtraCallbackWithResult();
        }
        return this.onExtraCallback + 10 + (this.IAuthTabCallback.size() << 3) + 2 + iOnExtraCallbackWithResult;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getCurrentOrientationInlineAdaptiveBannerAdSize, o.createNativeAdLoader
    public void onExtraCallback(final createRewardAdLoader createrewardadloader) {
        super.onExtraCallback(createrewardadloader);
        this.onNavigationEvent.forEach(new Consumer() { // from class: org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((getCurrentOrientationInlineAdaptiveBannerAdSize) obj).onExtraCallback(createrewardadloader);
            }
        });
        this.onWarmupCompleted.forEach(new Consumer() { // from class: org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute$$ExternalSyntheticLambda2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((getSlotId) obj).onExtraCallback(createrewardadloader);
            }
        });
        this.IAuthTabCallback.forEach(new Consumer() { // from class: org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute$$ExternalSyntheticLambda3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((getSdkTypeFactory) obj).onExtraCallbackWithResult(createrewardadloader);
            }
        });
    }

    public String toString() {
        return "Code: " + IAuthTabCallback() + " bytes";
    }
}
