package o;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class getCurrentOrientationInlineAdaptiveBannerAdSize extends createNativeAdLoader {
    private int IAuthTabCallback;
    public final ISDKTypeFactory onExtraCallbackWithResult;

    protected abstract int IAuthTabCallback();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.onExtraCallbackWithResult, ((getCurrentOrientationInlineAdaptiveBannerAdSize) obj).onExtraCallbackWithResult);
    }

    protected int onExtraCallbackWithResult() {
        return IAuthTabCallback() + 6;
    }

    public int hashCode() {
        return Objects.hash(this.onExtraCallbackWithResult);
    }

    @Override // o.createNativeAdLoader
    public void onExtraCallback(createRewardAdLoader createrewardadloader) {
        super.onExtraCallback(createrewardadloader);
        this.IAuthTabCallback = createrewardadloader.IAuthTabCallback(this.onExtraCallbackWithResult);
    }
}
