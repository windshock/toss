package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.RootView;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootHelper$;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.addChangePayload;
import o.doesTransientStatePreventRecycling;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RNGestureHandlerRootHelper {
    public static final Companion Companion = new Companion(null);
    private final ViewGroup IAuthTabCallback;
    private final addChangePayload onExtraCallback;
    private final ReactContext onExtraCallbackWithResult;
    private final doesTransientStatePreventRecycling onNavigationEvent;
    private boolean onTransact;
    private boolean onWarmupCompleted;

    public RNGestureHandlerRootHelper(@NotNull ReactContext reactContext, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(reactContext, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.onExtraCallbackWithResult = reactContext;
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        RNGestureHandlerModule nativeModule = reactContext.getNativeModule(RNGestureHandlerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = nativeModule;
        RNGestureHandlerRegistry registry = rNGestureHandlerModule.getRegistry();
        ViewGroup viewGroupIAuthTabCallback = Companion.IAuthTabCallback(viewGroup);
        this.IAuthTabCallback = viewGroupIAuthTabCallback;
        Objects.toString(viewGroupIAuthTabCallback);
        doesTransientStatePreventRecycling doestransientstatepreventrecycling = new doesTransientStatePreventRecycling(viewGroup, registry, new RNViewConfigurationHelper(), viewGroupIAuthTabCallback);
        doestransientstatepreventrecycling.onExtraCallbackWithResult(0.1f);
        this.onNavigationEvent = doestransientstatepreventrecycling;
        RootViewGestureHandler rootViewGestureHandler = new RootViewGestureHandler(-id);
        this.onExtraCallback = rootViewGestureHandler;
        registry.onWarmupCompleted(rootViewGestureHandler);
        registry.onExtraCallbackWithResult(rootViewGestureHandler.onUnminimized(), id, 3);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    public final ViewGroup onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public final void onNavigationEvent() {
        Objects.toString(this.IAuthTabCallback);
        CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2 = this.onExtraCallbackWithResult;
        Intrinsics.checkNotNull(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        RNGestureHandlerModule nativeModule = credentialProviderGetSignInIntentControllerhandleResponse2.onExtraCallbackWithResult().getNativeModule(RNGestureHandlerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = nativeModule;
        RNGestureHandlerRegistry registry = rNGestureHandlerModule.getRegistry();
        addChangePayload addchangepayload = this.onExtraCallback;
        Intrinsics.checkNotNull(addchangepayload);
        registry.onWarmupCompleted(addchangepayload.onUnminimized());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }

    public final class RootViewGestureHandler extends addChangePayload {
        public RootViewGestureHandler(int i) {
            asBinder(i);
        }

        private final void onExtraCallbackWithResult(MotionEvent motionEvent) {
            doesTransientStatePreventRecycling doestransientstatepreventrecyclingOnPostMessage;
            if (onRelationshipValidationResult() == 0 && (!RNGestureHandlerRootHelper.this.onTransact || (doestransientstatepreventrecyclingOnPostMessage = onPostMessage()) == null || !doestransientstatepreventrecyclingOnPostMessage.onExtraCallbackWithResult())) {
                IAuthTabCallbackStub();
                RNGestureHandlerRootHelper.this.onTransact = false;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 10) {
                getInterfaceDescriptor();
            }
        }

        @Override // o.addChangePayload
        public void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            Intrinsics.checkNotNullParameter(motionEvent2, "");
            onExtraCallbackWithResult(motionEvent);
        }

        @Override // o.addChangePayload
        public void onWarmupCompleted(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            Intrinsics.checkNotNullParameter(motionEvent2, "");
            onExtraCallbackWithResult(motionEvent);
        }

        @Override // o.addChangePayload
        public void onWarmupCompleted() {
            RNGestureHandlerRootHelper.this.onTransact = true;
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setAction(3);
            if (RNGestureHandlerRootHelper.this.onWarmupCompleted() instanceof RootView) {
                RootView rootViewOnWarmupCompleted = RNGestureHandlerRootHelper.this.onWarmupCompleted();
                ViewGroup viewGroupOnWarmupCompleted = RNGestureHandlerRootHelper.this.onWarmupCompleted();
                Intrinsics.checkNotNull(motionEventObtain);
                rootViewOnWarmupCompleted.onChildStartedNativeGesture(viewGroupOnWarmupCompleted, motionEventObtain);
            }
            motionEventObtain.recycle();
        }
    }

    public final void IAuthTabCallback() {
        if (this.onNavigationEvent == null || this.onWarmupCompleted) {
            return;
        }
        onExtraCallback();
    }

    public final boolean onWarmupCompleted(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.onWarmupCompleted = true;
        doesTransientStatePreventRecycling doestransientstatepreventrecycling = this.onNavigationEvent;
        Intrinsics.checkNotNull(doestransientstatepreventrecycling);
        doestransientstatepreventrecycling.onExtraCallback(motionEvent);
        this.onWarmupCompleted = false;
        return this.onTransact;
    }

    private final void onExtraCallback() {
        addChangePayload addchangepayload = this.onExtraCallback;
        if (addchangepayload == null || addchangepayload.onRelationshipValidationResult() != 2) {
            return;
        }
        addchangepayload.asInterface();
        addchangepayload.getInterfaceDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(RNGestureHandlerRootHelper rNGestureHandlerRootHelper) {
        rNGestureHandlerRootHelper.onExtraCallback();
    }

    public final void onNavigationEvent(int i, boolean z) {
        if (z) {
            UiThreadUtil.runOnUiThread(new RNGestureHandlerRootHelper$.ExternalSyntheticLambda0(this));
        }
    }

    public final void onWarmupCompleted(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        doesTransientStatePreventRecycling doestransientstatepreventrecycling = this.onNavigationEvent;
        if (doestransientstatepreventrecycling != null) {
            doestransientstatepreventrecycling.onNavigationEvent(view);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ViewGroup IAuthTabCallback(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewParent parent = viewGroup;
            while (parent != null && !(parent instanceof RootView)) {
                parent = parent.getParent();
            }
            if (parent == null) {
                throw new IllegalStateException(("View " + viewGroup + " has not been mounted under ReactRootView").toString());
            }
            return (ViewGroup) parent;
        }
    }
}
