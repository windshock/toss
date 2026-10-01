package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.RNSScreenContainerManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenContainerManagerInterface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;

@ReactModule(IAuthTabCallback = ScreenContainerViewManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ScreenContainerViewManager extends ViewGroupManager<ScreenContainer> implements RNSScreenContainerManagerInterface<ScreenContainer> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSScreenContainer";
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ScreenContainer> delegate;

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public ScreenContainerViewManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.delegate = new RNSScreenContainerManagerDelegate(this);
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ScreenContainer> getDelegate() {
        return this.delegate;
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ScreenContainer createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        return new ScreenContainer(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    public void addView(@NotNull ScreenContainer screenContainer, @NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(screenContainer, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (!(view instanceof Screen)) {
            throw new IllegalArgumentException("Attempt attach child that is not of type RNScreens");
        }
        screenContainer.addScreen((Screen) view, i);
    }

    public void removeViewAt(@NotNull ScreenContainer screenContainer, int i) {
        Intrinsics.checkNotNullParameter(screenContainer, "");
        screenContainer.removeScreenAt(i);
    }

    public void removeAllViews(@NotNull ScreenContainer screenContainer) {
        Intrinsics.checkNotNullParameter(screenContainer, "");
        screenContainer.removeAllScreens();
    }

    public int getChildCount(@NotNull ScreenContainer screenContainer) {
        Intrinsics.checkNotNullParameter(screenContainer, "");
        return screenContainer.getScreenCount();
    }

    public View getChildAt(@NotNull ScreenContainer screenContainer, int i) {
        Intrinsics.checkNotNullParameter(screenContainer, "");
        return screenContainer.getScreenAt(i);
    }

    /* renamed from: createShadowNodeInstance, reason: merged with bridge method [inline-methods] */
    public LayoutShadowNode m5createShadowNodeInstance(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return new ScreensShadowNode(reactApplicationContext);
    }
}
