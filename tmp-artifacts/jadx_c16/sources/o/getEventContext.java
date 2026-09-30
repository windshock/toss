package o;

import im.toss.features.main.ui.di.MainTabModule;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getEventContext implements captureStartValues<ExtHubPage> {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private final createAnimators<getInternalContentView> IAuthTabCallback;
    private final createAnimators<RVTabbarLayout> asInterface;
    private final createAnimators<MySubscribeProxySubscriptionsSetting> onExtraCallback;
    private final createAnimators<CacheStrategy> onExtraCallbackWithResult;
    private final createAnimators<onRenderInit> onNavigationEvent;
    private final createAnimators<getBillingPeriod> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ExtHubPage extHubPageOnExtraCallback = onExtraCallback();
        int i4 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return extHubPageOnExtraCallback;
    }

    public ExtHubPage onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ExtHubPage extHubPageIAuthTabCallback = IAuthTabCallback((MySubscribeProxySubscriptionsSetting) this.onExtraCallback.get(), (onRenderInit) this.onNavigationEvent.get(), (RVTabbarLayout) this.asInterface.get(), (CacheStrategy) this.onExtraCallbackWithResult.get(), (getInternalContentView) this.IAuthTabCallback.get(), (getBillingPeriod) this.onWarmupCompleted.get());
        int i4 = IAuthTabCallbackStub + 59;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return extHubPageIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ExtHubPage IAuthTabCallback(MySubscribeProxySubscriptionsSetting mySubscribeProxySubscriptionsSetting, onRenderInit onrenderinit, RVTabbarLayout rVTabbarLayout, CacheStrategy cacheStrategy, getInternalContentView getinternalcontentview, getBillingPeriod getbillingperiod) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return (ExtHubPage) createAnimator.onNavigationEvent(MainTabModule.onNavigationEvent.onWarmupCompleted(mySubscribeProxySubscriptionsSetting, onrenderinit, rVTabbarLayout, cacheStrategy, getinternalcontentview, getbillingperiod));
        }
        ExtHubPage extHubPage = (ExtHubPage) createAnimator.onNavigationEvent(MainTabModule.onNavigationEvent.onWarmupCompleted(mySubscribeProxySubscriptionsSetting, onrenderinit, rVTabbarLayout, cacheStrategy, getinternalcontentview, getbillingperiod));
        int i3 = 31 / 0;
        return extHubPage;
    }
}
