package com.swmansion.rnscreens.gamma.tabs;

import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSBottomTabsManagerDelegate;
import com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface;
import com.swmansion.rnscreens.gamma.helpers.EventHelpersKt;
import com.swmansion.rnscreens.gamma.tabs.event.TabsHostNativeFocusChangeEvent;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.access8100;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = TabsHostViewManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TabsHostViewManager extends ViewGroupManager<TabsHost> implements RNSBottomTabsManagerInterface<TabsHost> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSBottomTabs";
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<TabsHost> delegate;

    public void setControlNavigationStateInJS(@Nullable TabsHost tabsHost, boolean z) {
    }

    public void setTabBarControllerMode(@NotNull TabsHost tabsHost, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
    }

    public void setTabBarMinimizeBehavior(@NotNull TabsHost tabsHost, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
    }

    public void setTabBarTintColor(@NotNull TabsHost tabsHost, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
    }

    public TabsHostViewManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.delegate = new RNSBottomTabsManagerDelegate(this);
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TabsHost createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        return new TabsHost(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<TabsHost> getDelegate() {
        return this.delegate;
    }

    public void addView(@NotNull TabsHost tabsHost, @NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (!(view instanceof TabScreen)) {
            throw new IllegalArgumentException("[RNScreens] Attempt to attach child that is not of type javaClass");
        }
        tabsHost.mountReactSubviewAt$react_native_screens_release((TabScreen) view, i);
    }

    public void removeView(@NotNull TabsHost tabsHost, @NotNull View view) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (!(view instanceof TabScreen)) {
            throw new IllegalArgumentException("[RNScreens] Attempt to detach child that is not of type javaClass");
        }
        tabsHost.unmountReactSubview$react_native_screens_release((TabScreen) view);
    }

    public void removeViewAt(@NotNull TabsHost tabsHost, int i) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.unmountReactSubviewAt$react_native_screens_release(i);
    }

    public void removeAllViews(@NotNull TabsHost tabsHost) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.unmountAllReactSubviews$react_native_screens_release();
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return access8100.IAuthTabCallback(new Pair[]{EventHelpersKt.makeEventRegistrationInfo(TabsHostNativeFocusChangeEvent.Companion)});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addEventEmitters(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2, @NotNull TabsHost tabsHost) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        Intrinsics.checkNotNullParameter(tabsHost, "");
        super/*com.facebook.react.uimanager.BaseViewManager*/.addEventEmitters(credentialProviderGetSignInIntentControllerhandleResponse2, tabsHost);
        tabsHost.onViewManagerAddEventEmitters$react_native_screens_release();
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarBackgroundColor", onWarmupCompleted = "Color")
    public void setTabBarBackgroundColor(@NotNull TabsHost tabsHost, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.setTabBarBackgroundColor(num);
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemTitleFontSize")
    public void setTabBarItemTitleFontSize(@Nullable TabsHost tabsHost, float f) {
        if (tabsHost != null) {
            tabsHost.setTabBarItemTitleFontSize(Float.valueOf(f));
        }
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemTitleFontFamily")
    public void setTabBarItemTitleFontFamily(@NotNull TabsHost tabsHost, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.setTabBarItemTitleFontFamily(str);
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemTitleFontWeight")
    public void setTabBarItemTitleFontWeight(@NotNull TabsHost tabsHost, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.setTabBarItemTitleFontWeight(str);
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemTitleFontStyle")
    public void setTabBarItemTitleFontStyle(@NotNull TabsHost tabsHost, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.setTabBarItemTitleFontStyle(str);
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemTitleFontColor", onWarmupCompleted = "Color")
    public void setTabBarItemTitleFontColor(@NotNull TabsHost tabsHost, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.setTabBarItemTitleFontColor(num);
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemIconColor", onWarmupCompleted = "Color")
    public void setTabBarItemIconColor(@NotNull TabsHost tabsHost, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.setTabBarItemIconColor(num);
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarHidden")
    public void setTabBarHidden(@NotNull TabsHost tabsHost, boolean z) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.setTabBarHidden(z);
    }

    @ReactProp(IAuthTabCallbackStub = "nativeContainerBackgroundColor", onWarmupCompleted = "Color")
    public void setNativeContainerBackgroundColor(@NotNull TabsHost tabsHost, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.setNativeContainerBackgroundColor(num);
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemTitleFontColorActive", onWarmupCompleted = "Color")
    public void setTabBarItemTitleFontColorActive(@NotNull TabsHost tabsHost, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.setTabBarItemTitleFontColorActive(num);
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemActiveIndicatorColor", onWarmupCompleted = "Color")
    public void setTabBarItemActiveIndicatorColor(@NotNull TabsHost tabsHost, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.setTabBarItemActiveIndicatorColor(num);
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemActiveIndicatorEnabled")
    public void setTabBarItemActiveIndicatorEnabled(@NotNull TabsHost tabsHost, boolean z) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.setTabBarItemActiveIndicatorEnabled(z);
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemIconColorActive", onWarmupCompleted = "Color")
    public void setTabBarItemIconColorActive(@NotNull TabsHost tabsHost, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.setTabBarItemIconColorActive(num);
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemTitleFontSizeActive")
    public void setTabBarItemTitleFontSizeActive(@Nullable TabsHost tabsHost, float f) {
        if (tabsHost != null) {
            tabsHost.setTabBarItemTitleFontSizeActive(Float.valueOf(f));
        }
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemRippleColor", onWarmupCompleted = "Color")
    public void setTabBarItemRippleColor(@NotNull TabsHost tabsHost, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.setTabBarItemRippleColor(num);
    }

    @ReactProp(IAuthTabCallbackStub = "tabBarItemLabelVisibilityMode")
    public void setTabBarItemLabelVisibilityMode(@NotNull TabsHost tabsHost, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tabsHost, "");
        tabsHost.setTabBarItemLabelVisibilityMode(str);
    }
}
