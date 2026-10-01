package com.reactnativecommunity.blurview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.initech.pkix.cmp.client.util.URI;
import eightbitlab.com.blurview.BlurView;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.RecyclerViewAdapter;
import o.obtainAccessibilityNodeInfo;
import o.onFocusChanged;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;

@ReactModule(IAuthTabCallback = "AndroidBlurView")
/* loaded from: /tmp/toss_alldex/classes16.dex */
public class BlurViewManager extends ViewGroupManager<BlurView> implements obtainAccessibilityNodeInfo<BlurView> {
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<BlurView> mDelegate = new onFocusChanged(this);

    public void setBlurAmount(BlurView blurView, int i) {
    }

    public void setBlurType(BlurView blurView, @Nullable String str) {
    }

    @ReactProp(IAuthTabCallbackStub = "downsampleFactor", onExtraCallback = 10)
    public void setDownsampleFactor(BlurView blurView, int i) {
    }

    public BlurViewManager(ReactApplicationContext reactApplicationContext) {
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<BlurView> getDelegate() {
        return this.mDelegate;
    }

    public String getName() {
        return "AndroidBlurView";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BlurView createViewInstance(@NonNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        return RecyclerViewAdapter.onExtraCallback(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    @ReactProp(IAuthTabCallbackStub = "blurRadius", onExtraCallback = 10)
    public void setBlurRadius(BlurView blurView, int i) {
        RecyclerViewAdapter.onExtraCallback(blurView, i);
    }

    @ReactProp(IAuthTabCallbackStub = "overlayColor", onWarmupCompleted = "Color")
    public void setOverlayColor(BlurView blurView, Integer num) {
        RecyclerViewAdapter.onWarmupCompleted(blurView, num.intValue());
    }

    @ReactProp(IAuthTabCallbackStub = "autoUpdate", onExtraCallbackWithResult = URI.ENABLE_BACKWARDS_COMPATIBILITY)
    public void setAutoUpdate(BlurView blurView, boolean z) {
        RecyclerViewAdapter.onWarmupCompleted(blurView, z);
    }

    @ReactProp(IAuthTabCallbackStub = "enabled", onExtraCallbackWithResult = URI.ENABLE_BACKWARDS_COMPATIBILITY)
    public void setEnabled(BlurView blurView, boolean z) {
        RecyclerViewAdapter.onExtraCallbackWithResult(blurView, z);
    }
}
