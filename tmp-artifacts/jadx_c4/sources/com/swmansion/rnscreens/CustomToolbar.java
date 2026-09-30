package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.modules.core.ReactChoreographer;
import com.swmansion.rnscreens.utils.InsetsKtKt;
import kotlin.jvm.internal.Intrinsics;
import o.CameraControllerExternalSyntheticLambda0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class CustomToolbar extends Toolbar {
    private final ScreenStackHeaderConfig config;
    private boolean isForceShadowStateUpdateOnLayoutRequested;
    private boolean isLayoutEnqueued;
    private CameraControllerExternalSyntheticLambda0 lastInsets;
    private final Choreographer.FrameCallback layoutCallback;
    private boolean shouldApplyLayoutCorrectionForTopInset;
    private final boolean shouldApplyTopInset;
    private final boolean shouldAvoidDisplayCutout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomToolbar(@NotNull Context context, @NotNull ScreenStackHeaderConfig screenStackHeaderConfig) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        this.config = screenStackHeaderConfig;
        this.shouldAvoidDisplayCutout = true;
        this.shouldApplyTopInset = true;
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0 = CameraControllerExternalSyntheticLambda0.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0, "");
        this.lastInsets = cameraControllerExternalSyntheticLambda0;
        getMenu();
        this.layoutCallback = new Choreographer.FrameCallback() { // from class: com.swmansion.rnscreens.CustomToolbar$layoutCallback$1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                this.this$0.isLayoutEnqueued = false;
                Toolbar toolbar = this.this$0;
                toolbar.measure(View.MeasureSpec.makeMeasureSpec(toolbar.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.this$0.getHeight(), Integer.MIN_VALUE));
                Toolbar toolbar2 = this.this$0;
                toolbar2.layout(toolbar2.getLeft(), this.this$0.getTop(), this.this$0.getRight(), this.this$0.getBottom());
            }
        };
    }

    public final ScreenStackHeaderConfig getConfig() {
        return this.config;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.swmansion.rnscreens.CustomAppBarLayout] */
    public void requestLayout() {
        Window window;
        WindowManager.LayoutParams attributes;
        super/*android.view.View*/.requestLayout();
        Object parent = getParent();
        Integer numValueOf = null;
        ?? r0 = parent instanceof CustomAppBarLayout ? (CustomAppBarLayout) parent : 0;
        if (r0 != 0 && this.shouldApplyLayoutCorrectionForTopInset && !r0.isInLayout()) {
            r0.applyToolbarLayoutCorrection$react_native_screens_release(getPaddingTop());
            this.shouldApplyLayoutCorrectionForTopInset = false;
        }
        CredentialProviderGetSignInIntentControllerhandleResponse2 context = getContext();
        Intrinsics.checkNotNull(context, "");
        Activity currentActivity = context.getCurrentActivity();
        if (currentActivity != null && (window = currentActivity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            numValueOf = Integer.valueOf(attributes.softInputMode);
        }
        if (Build.VERSION.SDK_INT > 29 || numValueOf == null || numValueOf.intValue() != 32 || this.isLayoutEnqueued || this.layoutCallback == null) {
            return;
        }
        this.isLayoutEnqueued = true;
        ReactChoreographer.Companion.IAuthTabCallback().onWarmupCompleted(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.layoutCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WindowInsets onApplyWindowInsets(@Nullable WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super/*android.view.View*/.onApplyWindowInsets(windowInsets);
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0ResolveInsetsOrZero$default = InsetsKtKt.resolveInsetsOrZero$default(this, WindowInsetsCompat.onTransact.onExtraCallbackWithResult(), windowInsetsOnApplyWindowInsets, false, 4, null);
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0ResolveInsetsOrZero$default2 = InsetsKtKt.resolveInsetsOrZero$default(this, WindowInsetsCompat.onTransact.asBinder(), windowInsetsOnApplyWindowInsets, false, 4, null);
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnNavigationEvent = CameraControllerExternalSyntheticLambda0.onNavigationEvent(cameraControllerExternalSyntheticLambda0ResolveInsetsOrZero$default.IAuthTabCallback + cameraControllerExternalSyntheticLambda0ResolveInsetsOrZero$default2.IAuthTabCallback, 0, cameraControllerExternalSyntheticLambda0ResolveInsetsOrZero$default.onExtraCallbackWithResult + cameraControllerExternalSyntheticLambda0ResolveInsetsOrZero$default2.onExtraCallbackWithResult, 0);
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnNavigationEvent, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnNavigationEvent2 = CameraControllerExternalSyntheticLambda0.onNavigationEvent(0, Math.max(cameraControllerExternalSyntheticLambda0ResolveInsetsOrZero$default.onWarmupCompleted, this.shouldApplyTopInset ? cameraControllerExternalSyntheticLambda0ResolveInsetsOrZero$default2.onWarmupCompleted : 0), 0, Math.max(cameraControllerExternalSyntheticLambda0ResolveInsetsOrZero$default.onExtraCallback, 0));
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnNavigationEvent2, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnExtraCallbackWithResult = CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(cameraControllerExternalSyntheticLambda0OnNavigationEvent, cameraControllerExternalSyntheticLambda0OnNavigationEvent2);
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnExtraCallbackWithResult, "");
        if (!Intrinsics.areEqual(this.lastInsets, cameraControllerExternalSyntheticLambda0OnExtraCallbackWithResult)) {
            this.lastInsets = cameraControllerExternalSyntheticLambda0OnExtraCallbackWithResult;
            applyExactPadding(cameraControllerExternalSyntheticLambda0OnExtraCallbackWithResult.IAuthTabCallback, cameraControllerExternalSyntheticLambda0OnExtraCallbackWithResult.onWarmupCompleted, cameraControllerExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallbackWithResult, cameraControllerExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallback);
        }
        return windowInsetsOnApplyWindowInsets;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.config.onNativeToolbarLayout(this, z || this.isForceShadowStateUpdateOnLayoutRequested);
        this.isForceShadowStateUpdateOnLayoutRequested = false;
    }

    public final void updateContentInsets() {
        setContentInsetStartWithNavigation(this.config.getPreferredContentInsetStartWithNavigation());
        setContentInsetsRelative(this.config.getPreferredContentInsetStart(), this.config.getPreferredContentInsetEnd());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyExactPadding(int i, int i2, int i3, int i4) {
        this.shouldApplyLayoutCorrectionForTopInset = true;
        requestForceShadowStateUpdateOnLayout();
        setPadding(i, i2, i3, i4);
    }

    private final void requestForceShadowStateUpdateOnLayout() {
        this.isForceShadowStateUpdateOnLayoutRequested = this.shouldAvoidDisplayCutout;
    }
}
