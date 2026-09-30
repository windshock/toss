package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.RNSScreenStackManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackManagerInterface;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.access8100;
import o.getWrite;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = ScreenStackViewManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ScreenStackViewManager extends ViewGroupManager<ScreenStack> implements RNSScreenStackManagerInterface<ScreenStack> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSScreenStack";
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ScreenStack> delegate;

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void setIosPreventReattachmentOfDismissedScreens(@Nullable ScreenStack screenStack, boolean z) {
    }

    public ScreenStackViewManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.delegate = new RNSScreenStackManagerDelegate(this);
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ScreenStack createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        return new ScreenStack(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    public void addView(@NotNull ScreenStack screenStack, @NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(screenStack, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (!(view instanceof Screen)) {
            throw new IllegalArgumentException("Attempt attach child that is not of type Screen");
        }
        Screen screen = (Screen) view;
        NativeProxy.Companion.addScreenToMap(screen.getId(), screen);
        screenStack.addScreen(screen, i);
    }

    public void removeViewAt(@NotNull ScreenStack screenStack, int i) {
        Intrinsics.checkNotNullParameter(screenStack, "");
        Screen screenAt = screenStack.getScreenAt(i);
        prepareOutTransition(screenAt);
        screenStack.removeScreenAt(i);
        NativeProxy.Companion.removeScreenFromMap(screenAt.getId());
    }

    private final void prepareOutTransition(Screen screen) {
        if (screen != null) {
            screen.startRemovalTransition();
        }
    }

    public void invalidate() {
        super/*com.facebook.react.bridge.BaseJavaModule*/.invalidate();
        NativeProxy.Companion.clearMapOnInvalidate();
    }

    public int getChildCount(@NotNull ScreenStack screenStack) {
        Intrinsics.checkNotNullParameter(screenStack, "");
        return screenStack.getScreenCount();
    }

    public View getChildAt(@NotNull ScreenStack screenStack, int i) {
        Intrinsics.checkNotNullParameter(screenStack, "");
        return screenStack.getScreenAt(i);
    }

    /* renamed from: createShadowNodeInstance, reason: merged with bridge method [inline-methods] */
    public LayoutShadowNode m12createShadowNodeInstance(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return new ScreensShadowNode(reactApplicationContext);
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ScreenStack> getDelegate() {
        return this.delegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("topFinishTransitioning", access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onFinishTransitioning")}))});
    }
}
