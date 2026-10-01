package com.swmansion.gesturehandler.react;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNGestureHandlerRootViewManagerDelegate;
import com.facebook.react.viewmanagers.RNGestureHandlerRootViewManagerInterface;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.access8100;
import o.getWrite;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;

@ReactModule(IAuthTabCallback = RNGestureHandlerRootViewManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RNGestureHandlerRootViewManager extends ViewGroupManager<RNGestureHandlerRootView> implements RNGestureHandlerRootViewManagerInterface<RNGestureHandlerRootView> {
    public static final Companion Companion = new Companion(null);
    public static final String REACT_CLASS = "RNGestureHandlerRootView";
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<RNGestureHandlerRootView> mDelegate;

    public RNGestureHandlerRootViewManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.mDelegate = new RNGestureHandlerRootViewManagerDelegate(this);
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<RNGestureHandlerRootView> getDelegate() {
        return this.mDelegate;
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RNGestureHandlerRootView createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        return new RNGestureHandlerRootView(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    public void onDropViewInstance(@NotNull RNGestureHandlerRootView rNGestureHandlerRootView) {
        Intrinsics.checkNotNullParameter(rNGestureHandlerRootView, "");
        rNGestureHandlerRootView.onNavigationEvent();
    }

    @ReactProp(IAuthTabCallbackStub = "unstable_forceActive")
    public void setUnstable_forceActive(@NotNull RNGestureHandlerRootView rNGestureHandlerRootView, boolean z) {
        Intrinsics.checkNotNullParameter(rNGestureHandlerRootView, "");
        rNGestureHandlerRootView.setUnstableForceActive(z);
    }

    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("onGestureHandlerEvent", access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onGestureHandlerEvent")})), getWrite.IAuthTabCallback("onGestureHandlerStateChange", access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onGestureHandlerStateChange")}))});
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
