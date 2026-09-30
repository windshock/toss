package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface;
import com.swmansion.rnscreens.events.HeaderAttachedEvent;
import com.swmansion.rnscreens.events.HeaderDetachedEvent;
import java.util.Map;
import javax.annotation.Nonnull;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderControllermaybeReportErrorFromResultReceiver1;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.access8100;
import o.getWrite;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = ScreenStackHeaderConfigViewManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<ScreenStackHeaderConfig> implements RNSScreenStackHeaderConfigManagerInterface<ScreenStackHeaderConfig> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ScreenStackHeaderConfig> delegate;

    private final void logNotAvailable(String str) {
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void setSynchronousShadowStateUpdatesEnabled(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, boolean z) {
    }

    public ScreenStackHeaderConfigViewManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.delegate = new RNSScreenStackHeaderConfigManagerDelegate(this);
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ScreenStackHeaderConfig createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        return new ScreenStackHeaderConfig(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    /* renamed from: createShadowNodeInstance, reason: merged with bridge method [inline-methods] */
    public LayoutShadowNode m9createShadowNodeInstance(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return new ScreenStackHeaderConfigShadowNode(reactApplicationContext);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.react.bridge.JSApplicationCausedNativeException */
    public void addView(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, @NotNull View view, int i) throws JSApplicationCausedNativeException {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (!(view instanceof ScreenStackHeaderSubview)) {
            throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
        }
        screenStackHeaderConfig.addConfigSubview((ScreenStackHeaderSubview) view, i);
    }

    public Object updateState(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.setStateWrapper(credentialProviderControllermaybeReportErrorFromResultReceiver1);
        return super/*com.facebook.react.uimanager.ViewManager*/.updateState(screenStackHeaderConfig, reactStylesDiffMap, credentialProviderControllermaybeReportErrorFromResultReceiver1);
    }

    public void onDropViewInstance(@Nonnull @NotNull ScreenStackHeaderConfig screenStackHeaderConfig) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.destroy();
    }

    public void removeAllViews(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.removeAllConfigSubviews();
    }

    public void removeViewAt(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, int i) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.removeConfigSubview(i);
    }

    public int getChildCount(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        return screenStackHeaderConfig.getConfigSubviewsCount();
    }

    public View getChildAt(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, int i) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        return screenStackHeaderConfig.getConfigSubview(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAfterUpdateTransaction(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        super/*com.facebook.react.uimanager.BaseViewManager*/.onAfterUpdateTransaction(screenStackHeaderConfig);
        screenStackHeaderConfig.onUpdate();
    }

    @ReactProp(IAuthTabCallbackStub = "title")
    public void setTitle(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable String str) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.setTitle(str);
    }

    @ReactProp(IAuthTabCallbackStub = "titleFontFamily")
    public void setTitleFontFamily(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable String str) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.setTitleFontFamily(str);
    }

    @ReactProp(IAuthTabCallbackStub = "titleFontSize")
    public void setTitleFontSize(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, int i) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.setTitleFontSize(i);
    }

    @ReactProp(IAuthTabCallbackStub = "titleFontWeight")
    public void setTitleFontWeight(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable String str) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.setTitleFontWeight(str);
    }

    @ReactProp(IAuthTabCallbackStub = "titleColor", onWarmupCompleted = "Color")
    public void setTitleColor(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        if (num != null) {
            screenStackHeaderConfig.setTitleColor(num.intValue());
        }
    }

    @ReactProp(IAuthTabCallbackStub = "backgroundColor", onWarmupCompleted = "Color")
    public void setBackgroundColor(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.setBackgroundColor(num);
    }

    @ReactProp(IAuthTabCallbackStub = "hideShadow")
    public void setHideShadow(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, boolean z) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.setHideShadow(z);
    }

    @ReactProp(IAuthTabCallbackStub = "hideBackButton")
    public void setHideBackButton(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, boolean z) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.setHideBackButton(z);
    }

    @ReactProp(IAuthTabCallbackStub = "topInsetEnabled")
    public void setTopInsetEnabled(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, boolean z) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        logNotAvailable("topInsetEnabled");
    }

    @ReactProp(IAuthTabCallbackStub = "color", onWarmupCompleted = "Color")
    public void setColor(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.setTintColor(num != null ? num.intValue() : 0);
    }

    @ReactProp(IAuthTabCallbackStub = "hidden")
    public void setHidden(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, boolean z) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.setHidden(z);
    }

    @ReactProp(IAuthTabCallbackStub = "translucent")
    public void setTranslucent(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, boolean z) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.setTranslucent(z);
    }

    @ReactProp(IAuthTabCallbackStub = "backButtonInCustomView")
    public void setBackButtonInCustomView(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, boolean z) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.setBackButtonInCustomView(z);
    }

    @ReactProp(IAuthTabCallbackStub = "direction")
    public void setDirection(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable String str) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        screenStackHeaderConfig.setDirection(str);
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback(HeaderAttachedEvent.EVENT_NAME, access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onAttached")})), getWrite.IAuthTabCallback(HeaderDetachedEvent.EVENT_NAME, access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onDetached")}))});
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ScreenStackHeaderConfig> getDelegate() {
        return this.delegate;
    }

    public void setBackTitle(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable String str) {
        logNotAvailable("backTitle");
    }

    public void setBackTitleFontFamily(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable String str) {
        logNotAvailable("backTitleFontFamily");
    }

    public void setBackTitleFontSize(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, int i) {
        logNotAvailable("backTitleFontSize");
    }

    public void setBackTitleVisible(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, boolean z) {
        logNotAvailable("backTitleVisible");
    }

    public void setLargeTitle(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, boolean z) {
        logNotAvailable("largeTitle");
    }

    public void setLargeTitleFontFamily(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable String str) {
        logNotAvailable("largeTitleFontFamily");
    }

    public void setLargeTitleFontSize(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, int i) {
        logNotAvailable("largeTitleFontSize");
    }

    public void setLargeTitleFontWeight(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable String str) {
        logNotAvailable("largeTitleFontWeight");
    }

    public void setLargeTitleBackgroundColor(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable Integer num) {
        logNotAvailable("largeTitleBackgroundColor");
    }

    public void setLargeTitleHideShadow(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, boolean z) {
        logNotAvailable("largeTitleHideShadow");
    }

    public void setLargeTitleColor(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable Integer num) {
        logNotAvailable("largeTitleColor");
    }

    public void setDisableBackButtonMenu(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, boolean z) {
        logNotAvailable("disableBackButtonMenu");
    }

    public void setBackButtonDisplayMode(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable String str) {
        logNotAvailable("backButtonDisplayMode");
    }

    public void setBlurEffect(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable String str) {
        logNotAvailable("blurEffect");
    }

    public void setHeaderLeftBarButtonItems(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable ReadableArray readableArray) {
        logNotAvailable("headerLeftBarButtonItems");
    }

    public void setHeaderRightBarButtonItems(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable ReadableArray readableArray) {
        logNotAvailable("headerRightBarButtonItems");
    }

    public void setUserInterfaceStyle(@Nullable ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable String str) {
        logNotAvailable("userInterfaceStyle");
    }
}
