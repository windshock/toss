package com.swmansion.rnscreens.gamma.stack.host;

import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.RNSStackHostManagerDelegate;
import com.facebook.react.viewmanagers.RNSStackHostManagerInterface;
import com.swmansion.rnscreens.gamma.stack.screen.StackScreen;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;

@ReactModule(IAuthTabCallback = StackHostViewManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class StackHostViewManager extends ViewGroupManager<StackHost> implements RNSStackHostManagerInterface<StackHost> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSStackHost";
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<StackHost> delegate;

    public StackHostViewManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.delegate = new RNSStackHostManagerDelegate(this);
    }

    public String getName() {
        return REACT_CLASS;
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<StackHost> getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public StackHost createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        return new StackHost(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    public void addView(@NotNull StackHost stackHost, @NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(stackHost, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (!(view instanceof StackScreen)) {
            throw new IllegalArgumentException("[RNScreens] Attempt to attach child that is not of type javaClass");
        }
        stackHost.mountReactSubviewAt$react_native_screens_release((StackScreen) view, i);
    }

    public void removeView(@NotNull StackHost stackHost, @NotNull View view) {
        Intrinsics.checkNotNullParameter(stackHost, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (!(view instanceof StackScreen)) {
            throw new IllegalArgumentException("[RNScreens] Attempt to attach child that is not of type javaClass");
        }
        stackHost.unmountReactSubview$react_native_screens_release((StackScreen) view);
    }

    public void removeViewAt(@NotNull StackHost stackHost, int i) {
        Intrinsics.checkNotNullParameter(stackHost, "");
        stackHost.unmountReactSubviewAt$react_native_screens_release(i);
    }

    public void removeAllViews(@NotNull StackHost stackHost) {
        Intrinsics.checkNotNullParameter(stackHost, "");
        stackHost.unmountAllReactSubviews$react_native_screens_release();
    }

    public View getChildAt(@NotNull StackHost stackHost, int i) {
        Intrinsics.checkNotNullParameter(stackHost, "");
        return (View) CollectionsKt.getOrNull(stackHost.getRenderedScreens$react_native_screens_release(), i);
    }

    public int getChildCount(@NotNull StackHost stackHost) {
        Intrinsics.checkNotNullParameter(stackHost, "");
        return stackHost.getRenderedScreens$react_native_screens_release().size();
    }
}
