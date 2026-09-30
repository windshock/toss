package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.events.ScreenTransitionProgressEvent;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import org.jetbrains.annotations.NotNull;

@ReactModule(IAuthTabCallback = "RNSModule")
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ScreensModule extends NativeScreensModuleSpec implements LifecycleEventListener {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RNSModule";
    private final AtomicBoolean isActiveTransition;
    private NativeProxy proxy;
    private final ReactApplicationContext reactContext;
    private int topScreenId;

    private final native void nativeInstall(long j);

    private final native void nativeUninstall();

    public void onHostPause() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreensModule(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        this.reactContext = reactApplicationContext;
        this.topScreenId = -1;
        this.isActiveTransition = new AtomicBoolean(false);
        try {
            System.loadLibrary("rnscreens");
            JavaScriptContextHolder javaScriptContextHolder = getReactApplicationContext().getJavaScriptContextHolder();
            if (javaScriptContextHolder != null) {
                nativeInstall(javaScriptContextHolder.get());
            }
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public void invalidate() {
        super/*com.facebook.react.bridge.BaseJavaModule*/.invalidate();
        NativeProxy nativeProxy = this.proxy;
        if (nativeProxy != null) {
            nativeProxy.invalidateNative();
        }
        this.proxy = null;
        this.reactContext.removeLifecycleEventListener(this);
        nativeUninstall();
    }

    public void initialize() {
        super/*com.facebook.react.bridge.BaseJavaModule*/.initialize();
        this.proxy = new NativeProxy();
        this.reactContext.addLifecycleEventListener(this);
        setupFabric();
    }

    private final void setupFabric() {
        FabricUIManager fabricUIManagerOnExtraCallback = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(this.reactContext, 2);
        Intrinsics.checkNotNull(fabricUIManagerOnExtraCallback, "");
        FabricUIManager fabricUIManager = fabricUIManagerOnExtraCallback;
        NativeProxy nativeProxy = this.proxy;
        if (nativeProxy != null) {
            nativeProxy.nativeAddMutationsListener(fabricUIManager);
        }
    }

    @Override // com.swmansion.rnscreens.NativeScreensModuleSpec
    public String getName() {
        return "RNSModule";
    }

    private final int[] startTransition(Integer num) {
        ScreenStack screenStack;
        ArrayList<ScreenStackFragmentWrapper> fragments;
        int size;
        UiThreadUtil.assertOnUiThread();
        if (this.isActiveTransition.get() || num == null) {
            return new int[]{-1, -1};
        }
        this.topScreenId = -1;
        int[] iArr = {-1, -1};
        UIManager uIManagerIAuthTabCallback = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.IAuthTabCallback(this.reactContext, num.intValue());
        View viewResolveView = uIManagerIAuthTabCallback != null ? uIManagerIAuthTabCallback.resolveView(num.intValue()) : null;
        if ((viewResolveView instanceof ScreenStack) && (size = (fragments = (screenStack = (ScreenStack) viewResolveView).getFragments()).size()) > 1) {
            this.isActiveTransition.set(true);
            screenStack.attachBelowTop();
            int id = fragments.get(size - 1).getScreen().getId();
            this.topScreenId = id;
            iArr[0] = id;
            iArr[1] = fragments.get(size - 2).getScreen().getId();
        }
        return iArr;
    }

    private final void updateTransition(double d) {
        UiThreadUtil.assertOnUiThread();
        if (this.topScreenId != -1) {
            float f = (float) d;
            short coalescingKey = ScreenFragment.Companion.getCoalescingKey(f);
            EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(this.reactContext, this.topScreenId);
            if (eventDispatcherOnExtraCallbackWithResult != null) {
                eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new ScreenTransitionProgressEvent(r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onWarmupCompleted(this.reactContext), this.topScreenId, f, true, true, coalescingKey));
            }
        }
    }

    private final void finishTransition(Integer num, boolean z) {
        UiThreadUtil.assertOnUiThread();
        if (!this.isActiveTransition.get() || num == null) {
            return;
        }
        UIManager uIManagerIAuthTabCallback = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.IAuthTabCallback(this.reactContext, num.intValue());
        View viewResolveView = uIManagerIAuthTabCallback != null ? uIManagerIAuthTabCallback.resolveView(num.intValue()) : null;
        if (viewResolveView instanceof ScreenStack) {
            if (z) {
                ((ScreenStack) viewResolveView).detachBelowTop();
            } else {
                ((ScreenStack) viewResolveView).notifyTopDetached();
            }
            this.isActiveTransition.set(false);
        }
        this.topScreenId = -1;
    }

    public void onHostResume() {
        setupFabric();
    }

    public void onHostDestroy() {
        NativeProxy nativeProxy = this.proxy;
        if (nativeProxy != null) {
            nativeProxy.cleanupExpiredMountingCoordinators();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
