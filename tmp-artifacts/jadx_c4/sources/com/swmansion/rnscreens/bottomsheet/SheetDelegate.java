package com.swmansion.rnscreens.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.inputmethod.InputMethodManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleEventObserver;
import com.facebook.react.views.view.ReactViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.InsetsObserverProxy;
import com.swmansion.rnscreens.KeyboardDidHide;
import com.swmansion.rnscreens.KeyboardNotVisible;
import com.swmansion.rnscreens.KeyboardState;
import com.swmansion.rnscreens.KeyboardVisible;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenContainer;
import com.swmansion.rnscreens.ScreenFooter;
import com.swmansion.rnscreens.ScreenStackFragment;
import com.swmansion.rnscreens.events.ScreenAnimationDelegate;
import com.swmansion.rnscreens.events.ScreenEventEmitter;
import com.swmansion.rnscreens.transition.ExternalBoundaryValuesEvaluator;
import com.swmansion.rnscreens.utils.DecorViewInsetsUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CameraControllerExternalSyntheticLambda0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.RenderInTransitionOverlayNodeElement;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SheetDelegate implements LifecycleEventObserver, RenderInTransitionOverlayNodeElement {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "SheetDelegate";
    private boolean isKeyboardVisible;
    private boolean isSheetAnimationInProgress;
    private final KeyboardHandler keyboardHandlerCallback;
    private KeyboardState keyboardState;
    private int lastKeyboardBottomOffset;
    private int lastStableDetentIndex;
    private int lastStableState;
    private int lastTopInset;
    private final Screen screen;
    private final SheetStateObserver sheetStateObserver;
    private View viewToRestoreFocus;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.values().length];
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getLastStableState$annotations() {
    }

    private final boolean shouldDismissSheetInState(int i) {
        return i == 5;
    }

    public SheetDelegate(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "");
        this.screen = screen;
        this.keyboardState = KeyboardNotVisible.INSTANCE;
        this.lastStableDetentIndex = screen.getSheetInitialDetentIndex();
        this.lastStableState = screen.getSheetDetents().sheetStateFromIndex$react_native_screens_release(screen.getSheetInitialDetentIndex());
        SheetStateObserver sheetStateObserver = new SheetStateObserver();
        this.sheetStateObserver = sheetStateObserver;
        this.keyboardHandlerCallback = new KeyboardHandler();
        screen.getFragment();
        Fragment fragment = screen.getFragment();
        Intrinsics.checkNotNull(fragment);
        fragment.getLifecycle().IAuthTabCallback(this);
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (sheetBehavior == null) {
            throw new IllegalStateException("[RNScreens] Sheet delegate accepts screen with initialized sheet behaviour only.");
        }
        sheetBehavior.addBottomSheetCallback(sheetStateObserver);
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final int getLastStableDetentIndex() {
        return this.lastStableDetentIndex;
    }

    public final int getLastStableState() {
        return this.lastStableState;
    }

    private final BottomSheetBehavior<Screen> getSheetBehavior() {
        return this.screen.getSheetBehavior();
    }

    private final ScreenStackFragment getStackFragment() {
        Fragment fragment = this.screen.getFragment();
        Intrinsics.checkNotNull(fragment, "");
        return (ScreenStackFragment) fragment;
    }

    private final View requireDecorView() {
        Activity currentActivity = this.screen.getReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Attempt to access activity on detached context");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "");
        return decorView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputMethodManager getInputMethodManager() {
        Object systemService = this.screen.getReactContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            return (InputMethodManager) systemService;
        }
        return null;
    }

    public void onStateChanged(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        int i = WhenMappings.$EnumSwitchMapping$0[onextracallbackwithresult.ordinal()];
        if (i == 1) {
            handleHostFragmentOnCreate();
            return;
        }
        if (i == 2) {
            handleHostFragmentOnStart();
            return;
        }
        if (i == 3) {
            handleHostFragmentOnResume();
        } else if (i == 4) {
            handleHostFragmentOnPause();
        } else {
            if (i != 5) {
                return;
            }
            handleHostFragmentOnDestroy();
        }
    }

    private final void handleHostFragmentOnCreate() {
        preserveBackgroundFocus();
    }

    private final void handleHostFragmentOnStart() {
        InsetsObserverProxy.INSTANCE.registerOnView(requireDecorView());
    }

    private final void handleHostFragmentOnResume() {
        InsetsObserverProxy.INSTANCE.addOnApplyWindowInsetsListener(this);
    }

    private final void handleHostFragmentOnPause() {
        InsetsObserverProxy.INSTANCE.removeOnApplyWindowInsetsListener(this);
    }

    private final void handleHostFragmentOnDestroy() {
        restoreBackgroundFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSheetStateChanged(int i) {
        boolean zIsStateStable = SheetUtils.INSTANCE.isStateStable(i);
        if (zIsStateStable) {
            this.lastStableState = i;
            this.lastStableDetentIndex = this.screen.getSheetDetents().indexFromSheetState$react_native_screens_release(i);
        }
        this.screen.onSheetDetentChanged$react_native_screens_release(this.lastStableDetentIndex, zIsStateStable);
        if (shouldDismissSheetInState(i)) {
            getStackFragment().dismissSelf$react_native_screens_release();
        }
    }

    private final void preserveBackgroundFocus() {
        View currentFocus;
        View decorView;
        Activity currentActivity = this.screen.getReactContext().getCurrentActivity();
        if (currentActivity == null || (currentFocus = currentActivity.getCurrentFocus()) == null) {
            return;
        }
        Window window = currentActivity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null && Intrinsics.areEqual(DecorViewInsetsUtilsKt.isSoftKeyboardVisibleOrNull(decorView), Boolean.TRUE)) {
            this.viewToRestoreFocus = currentFocus;
        }
        this.screen.setDescendantFocusability(262144);
        this.screen.requestFocus();
        InputMethodManager inputMethodManager = getInputMethodManager();
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    private final void restoreBackgroundFocus() {
        View view = this.viewToRestoreFocus;
        if (view != null) {
            view.requestFocus();
            InputMethodManager inputMethodManager = getInputMethodManager();
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(view, 0);
            }
        }
        this.viewToRestoreFocus = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateBottomSheetMetrics$react_native_screens_release(@NotNull BottomSheetBehavior<Screen> bottomSheetBehavior) throws NoWhenBranchMatchedException {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        Integer numTryResolveMaxFormSheetHeight$react_native_screens_release = tryResolveMaxFormSheetHeight$react_native_screens_release();
        if (numTryResolveMaxFormSheetHeight$react_native_screens_release == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        boolean zIsSheetFitToContents = SheetUtilsKt.isSheetFitToContents(this.screen);
        if (zIsSheetFitToContents) {
            ReactViewGroup contentWrapper = this.screen.getContentWrapper();
            if (contentWrapper != null) {
                numValueOf = Integer.valueOf(contentWrapper.getHeight());
                if (!SheetUtilsKt.isLaidOutOrHasCachedLayout(contentWrapper)) {
                    numValueOf = null;
                }
            }
        } else {
            if (zIsSheetFitToContents) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = Integer.valueOf((int) (this.screen.getSheetDetents().highest$react_native_screens_release() * numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue()));
        }
        BottomSheetBehaviorExtKt.updateMetrics(bottomSheetBehavior, numValueOf, this.screen.getSheetDetents().getCount$react_native_screens_release() == 3 ? Integer.valueOf(this.screen.getSheetDetents().expandedOffsetFromTop$react_native_screens_release(numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue(), this.lastTopInset)) : null);
    }

    public static /* synthetic */ BottomSheetBehavior configureBottomSheetBehaviour$react_native_screens_release$default(SheetDelegate sheetDelegate, BottomSheetBehavior bottomSheetBehavior, KeyboardState keyboardState, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            keyboardState = KeyboardNotVisible.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            i = sheetDelegate.lastStableDetentIndex;
        }
        return sheetDelegate.configureBottomSheetBehaviour$react_native_screens_release(bottomSheetBehavior, keyboardState, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final BottomSheetBehavior<Screen> configureBottomSheetBehaviour$react_native_screens_release(@NotNull BottomSheetBehavior<Screen> bottomSheetBehavior, @NotNull KeyboardState keyboardState, int i) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        Intrinsics.checkNotNullParameter(keyboardState, "");
        Integer numTryResolveMaxFormSheetHeight$react_native_screens_release = tryResolveMaxFormSheetHeight$react_native_screens_release();
        if (numTryResolveMaxFormSheetHeight$react_native_screens_release == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        bottomSheetBehavior.setHideable(true);
        bottomSheetBehavior.setDraggable(true);
        bottomSheetBehavior.addBottomSheetCallback(this.sheetStateObserver);
        ScreenFooter footer = this.screen.getFooter();
        if (footer != null) {
            footer.registerWithSheetBehavior(bottomSheetBehavior);
        }
        if (keyboardState instanceof KeyboardNotVisible) {
            int count$react_native_screens_release = this.screen.getSheetDetents().getCount$react_native_screens_release();
            if (count$react_native_screens_release == 1) {
                BottomSheetBehaviorExtKt.useSingleDetent$default(bottomSheetBehavior, Integer.valueOf(SheetUtilsKt.isSheetFitToContents(this.screen) ? this.screen.getSheetDetents().maxAllowedHeightForFitToContents$react_native_screens_release(this.screen) : this.screen.getSheetDetents().maxAllowedHeight$react_native_screens_release(numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue())), false, 2, null);
                return bottomSheetBehavior;
            }
            if (count$react_native_screens_release == 2) {
                return BottomSheetBehaviorExtKt.useTwoDetents(bottomSheetBehavior, Integer.valueOf(this.screen.getSheetDetents().sheetStateFromIndex$react_native_screens_release(i)), Integer.valueOf(this.screen.getSheetDetents().firstHeight$react_native_screens_release(numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue())), Integer.valueOf(this.screen.getSheetDetents().maxAllowedHeight$react_native_screens_release(numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue())));
            }
            if (count$react_native_screens_release == 3) {
                return BottomSheetBehaviorExtKt.useThreeDetents(bottomSheetBehavior, Integer.valueOf(this.screen.getSheetDetents().sheetStateFromIndex$react_native_screens_release(i)), Integer.valueOf(this.screen.getSheetDetents().firstHeight$react_native_screens_release(numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue())), Integer.valueOf(this.screen.getSheetDetents().maxAllowedHeight$react_native_screens_release(numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue())), Float.valueOf(this.screen.getSheetDetents().halfExpandedRatio$react_native_screens_release()), Integer.valueOf(this.screen.getSheetDetents().expandedOffsetFromTop$react_native_screens_release(numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue(), this.lastTopInset)));
            }
            throw new IllegalStateException("[RNScreens] Invalid detent count " + this.screen.getSheetDetents().getCount$react_native_screens_release() + ". Expected at most 3.");
        }
        if (!(keyboardState instanceof KeyboardVisible)) {
            if (!(keyboardState instanceof KeyboardDidHide)) {
                throw new NoWhenBranchMatchedException();
            }
            bottomSheetBehavior.removeBottomSheetCallback(this.keyboardHandlerCallback);
            int count$react_native_screens_release2 = this.screen.getSheetDetents().getCount$react_native_screens_release();
            if (count$react_native_screens_release2 == 1) {
                BottomSheetBehaviorExtKt.useSingleDetent(bottomSheetBehavior, Integer.valueOf(SheetUtilsKt.isSheetFitToContents(this.screen) ? this.screen.getSheetDetents().maxAllowedHeightForFitToContents$react_native_screens_release(this.screen) : this.screen.getSheetDetents().maxAllowedHeight$react_native_screens_release(numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue())), false);
                return bottomSheetBehavior;
            }
            if (count$react_native_screens_release2 == 2) {
                return BottomSheetBehaviorExtKt.useTwoDetents$default(bottomSheetBehavior, null, Integer.valueOf(this.screen.getSheetDetents().firstHeight$react_native_screens_release(numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue())), Integer.valueOf(this.screen.getSheetDetents().maxAllowedHeight$react_native_screens_release(numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue())), 1, null);
            }
            if (count$react_native_screens_release2 == 3) {
                return BottomSheetBehaviorExtKt.useThreeDetents$default(bottomSheetBehavior, null, Integer.valueOf(this.screen.getSheetDetents().firstHeight$react_native_screens_release(numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue())), Integer.valueOf(this.screen.getSheetDetents().maxAllowedHeight$react_native_screens_release(numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue())), Float.valueOf(this.screen.getSheetDetents().halfExpandedRatio$react_native_screens_release()), Integer.valueOf(this.screen.getSheetDetents().expandedOffsetFromTop$react_native_screens_release(numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue(), this.lastTopInset)), 1, null);
            }
            throw new IllegalStateException("[RNScreens] Invalid detent count " + this.screen.getSheetDetents().getCount$react_native_screens_release() + ". Expected at most 3.");
        }
        boolean z = ((KeyboardVisible) keyboardState).getHeight() != 0;
        int count$react_native_screens_release3 = this.screen.getSheetDetents().getCount$react_native_screens_release();
        if (count$react_native_screens_release3 == 1) {
            bottomSheetBehavior.addBottomSheetCallback(this.keyboardHandlerCallback);
            return bottomSheetBehavior;
        }
        if (count$react_native_screens_release3 == 2) {
            if (z) {
                BottomSheetBehaviorExtKt.useTwoDetents$default(bottomSheetBehavior, 3, null, null, 6, null);
            } else {
                BottomSheetBehaviorExtKt.useTwoDetents$default(bottomSheetBehavior, null, null, null, 7, null);
            }
            bottomSheetBehavior.addBottomSheetCallback(this.keyboardHandlerCallback);
            return bottomSheetBehavior;
        }
        if (count$react_native_screens_release3 == 3) {
            if (z) {
                BottomSheetBehaviorExtKt.useThreeDetents$default(bottomSheetBehavior, 3, null, null, null, null, 30, null);
            } else {
                BottomSheetBehaviorExtKt.useThreeDetents$default(bottomSheetBehavior, null, null, null, null, null, 31, null);
            }
            bottomSheetBehavior.addBottomSheetCallback(this.keyboardHandlerCallback);
            return bottomSheetBehavior;
        }
        throw new IllegalStateException("[RNScreens] Invalid detent count " + this.screen.getSheetDetents().getCount$react_native_screens_release() + ". Expected at most 3.");
    }

    public final int computeSheetOffsetYWithIMEPresent$react_native_screens_release(int i) {
        Integer numTryResolveMaxFormSheetHeight$react_native_screens_release = tryResolveMaxFormSheetHeight$react_native_screens_release();
        if (numTryResolveMaxFormSheetHeight$react_native_screens_release == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        if (SheetUtilsKt.isSheetFitToContents(this.screen)) {
            ReactViewGroup contentWrapper = this.screen.getContentWrapper();
            return Math.min(Math.max(numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue() - (contentWrapper != null ? contentWrapper.getHeight() : 0), 0), i);
        }
        return Math.min(numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue() - ((int) (RangesKt.coerceIn(this.screen.getSheetDetents().highest$react_native_screens_release(), 0.0d, 1.0d) * numTryResolveMaxFormSheetHeight$react_native_screens_release.intValue())), i);
    }

    public WindowInsetsCompat onApplyWindowInsets(@NotNull View view, @NotNull WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        boolean zIAuthTabCallback = windowInsetsCompat.IAuthTabCallback(WindowInsetsCompat.onTransact.IAuthTabCallback());
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.IAuthTabCallback());
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted2 = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.asBinder());
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted2, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted3 = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.onExtraCallbackWithResult());
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted3, "");
        this.lastTopInset = Math.max(cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.onWarmupCompleted, cameraControllerExternalSyntheticLambda0OnWarmupCompleted3.onWarmupCompleted);
        if (zIAuthTabCallback) {
            this.isKeyboardVisible = true;
            this.keyboardState = new KeyboardVisible(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
            BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
            if (sheetBehavior != null) {
                configureBottomSheetBehaviour$react_native_screens_release$default(this, sheetBehavior, this.keyboardState, 0, 4, null);
            }
        } else {
            BottomSheetBehavior<Screen> sheetBehavior2 = getSheetBehavior();
            if (sheetBehavior2 != null) {
                if (this.isKeyboardVisible) {
                    configureBottomSheetBehaviour$react_native_screens_release$default(this, sheetBehavior2, KeyboardDidHide.INSTANCE, 0, 4, null);
                } else {
                    KeyboardState keyboardState = this.keyboardState;
                    KeyboardNotVisible keyboardNotVisible = KeyboardNotVisible.INSTANCE;
                    if (!Intrinsics.areEqual(keyboardState, keyboardNotVisible)) {
                        configureBottomSheetBehaviour$react_native_screens_release$default(this, sheetBehavior2, keyboardNotVisible, 0, 4, null);
                    }
                }
            }
            this.keyboardState = KeyboardNotVisible.INSTANCE;
            this.isKeyboardVisible = false;
        }
        WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = new WindowInsetsCompat.onWarmupCompleted(windowInsetsCompat).onNavigationEvent(WindowInsetsCompat.onTransact.asBinder(), CameraControllerExternalSyntheticLambda0.onNavigationEvent(cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.IAuthTabCallback, cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.onWarmupCompleted, cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.onExtraCallbackWithResult, zIAuthTabCallback ? 0 : cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.onExtraCallback)).onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnExtraCallbackWithResult, "");
        return windowInsetsCompatOnExtraCallbackWithResult;
    }

    public final Integer tryResolveMaxFormSheetHeight$react_native_screens_release() {
        if (this.screen.getSheetShouldOverflowTopInset()) {
            return tryResolveContainerHeight();
        }
        return tryResolveSafeAreaSpaceForSheet();
    }

    private final Integer tryResolveSafeAreaSpaceForSheet() {
        Integer numTryResolveContainerHeight = tryResolveContainerHeight();
        if (numTryResolveContainerHeight != null) {
            return Integer.valueOf(numTryResolveContainerHeight.intValue() - this.lastTopInset);
        }
        return null;
    }

    private final Integer tryResolveContainerHeight() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        DisplayMetrics displayMetrics;
        ScreenContainer container = this.screen.getContainer();
        if (container != null) {
            return Integer.valueOf(container.getHeight());
        }
        CredentialProviderGetSignInIntentControllerhandleResponse2 reactContext = this.screen.getReactContext();
        Resources resources = reactContext.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return Integer.valueOf(displayMetrics.heightPixels);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = reactContext.getSystemService("window");
            WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
            if (windowManager != null && (currentWindowMetrics = windowManager.getCurrentWindowMetrics()) != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                return Integer.valueOf(bounds.height());
            }
        }
        return null;
    }

    public final Animator createSheetEnterAnimator$react_native_screens_release(@NotNull SheetAnimationContext sheetAnimationContext) {
        Intrinsics.checkNotNullParameter(sheetAnimationContext, "");
        AnimatorSet animatorSet = new AnimatorSet();
        DimmingViewManager dimmingDelegate = sheetAnimationContext.getDimmingDelegate();
        ScreenStackFragment fragment = sheetAnimationContext.getFragment();
        ValueAnimator valueAnimatorCreateDimmingViewAlphaAnimator = createDimmingViewAlphaAnimator(0.0f, dimmingDelegate.getMaxAlpha$react_native_screens_release(), dimmingDelegate);
        AnimatorSet.Builder builderPlay = animatorSet.play(createSheetSlideInAnimator());
        Screen screen = this.screen;
        if (!dimmingDelegate.willDimForDetentIndex(screen, screen.getSheetInitialDetentIndex())) {
            builderPlay = null;
        }
        if (builderPlay != null) {
            builderPlay.with(valueAnimatorCreateDimmingViewAlphaAnimator);
        }
        attachCommonListeners(animatorSet, true, fragment);
        return animatorSet;
    }

    public final Animator createSheetExitAnimator$react_native_screens_release(@NotNull SheetAnimationContext sheetAnimationContext) {
        Intrinsics.checkNotNullParameter(sheetAnimationContext, "");
        AnimatorSet animatorSet = new AnimatorSet();
        CoordinatorLayout coordinatorLayout = sheetAnimationContext.getCoordinatorLayout();
        DimmingViewManager dimmingDelegate = sheetAnimationContext.getDimmingDelegate();
        ScreenStackFragment fragment = sheetAnimationContext.getFragment();
        ValueAnimator valueAnimatorCreateDimmingViewAlphaAnimator = createDimmingViewAlphaAnimator(dimmingDelegate.getDimmingView$react_native_screens_release().getAlpha(), 0.0f, dimmingDelegate);
        animatorSet.play(valueAnimatorCreateDimmingViewAlphaAnimator).with(createSheetSlideOutAnimator(coordinatorLayout));
        attachCommonListeners(animatorSet, false, fragment);
        return animatorSet;
    }

    private final ValueAnimator createDimmingViewAlphaAnimator(float f, float f2, final DimmingViewManager dimmingViewManager) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.bottomsheet.SheetDelegate$$ExternalSyntheticLambda3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SheetDelegate.createDimmingViewAlphaAnimator$lambda$0$0(dimmingViewManager, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "");
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDimmingViewAlphaAnimator$lambda$0$0(DimmingViewManager dimmingViewManager, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f != null) {
            dimmingViewManager.getDimmingView$react_native_screens_release().setAlpha(f.floatValue());
        }
    }

    private final ValueAnimator createSheetSlideInAnimator() {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ExternalBoundaryValuesEvaluator(new Function1() { // from class: com.swmansion.rnscreens.bottomsheet.SheetDelegate$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return Float.valueOf(SheetDelegate.createSheetSlideInAnimator$lambda$0(this.f$0, (Number) obj));
            }
        }, new Function1() { // from class: com.swmansion.rnscreens.bottomsheet.SheetDelegate$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return SheetDelegate.createSheetSlideInAnimator$lambda$1((Number) obj);
            }
        }), Float.valueOf(this.screen.getHeight()), Float.valueOf(0.0f));
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.bottomsheet.SheetDelegate$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SheetDelegate.createSheetSlideInAnimator$lambda$2$0(this.f$0, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfObject, "");
        return valueAnimatorOfObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float createSheetSlideInAnimator$lambda$0(SheetDelegate sheetDelegate, Number number) {
        return sheetDelegate.screen.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float createSheetSlideInAnimator$lambda$1(Number number) {
        return Float.valueOf(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSheetSlideInAnimator$lambda$2$0(SheetDelegate sheetDelegate, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        sheetDelegate.updateSheetTranslationY(((Float) animatedValue).floatValue());
    }

    private final ValueAnimator createSheetSlideOutAnimator(CoordinatorLayout coordinatorLayout) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (coordinatorLayout.getBottom() - this.screen.getTop()) - this.screen.getTranslationY());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.bottomsheet.SheetDelegate$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SheetDelegate.createSheetSlideOutAnimator$lambda$0$0(this.f$0, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "");
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSheetSlideOutAnimator$lambda$0$0(SheetDelegate sheetDelegate, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        sheetDelegate.updateSheetTranslationY(((Float) animatedValue).floatValue());
    }

    private final void updateSheetTranslationY(float f) {
        this.screen.setTranslationY(f - computeSheetOffsetYWithIMEPresent$react_native_screens_release(this.lastKeyboardBottomOffset));
    }

    public final void handleKeyboardInsetsProgress$react_native_screens_release(@NotNull WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        this.lastKeyboardBottomOffset = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.IAuthTabCallback()).onExtraCallback;
        if (this.isSheetAnimationInProgress) {
            return;
        }
        updateSheetTranslationY(0.0f);
    }

    private final void attachCommonListeners(AnimatorSet animatorSet, boolean z, ScreenStackFragment screenStackFragment) {
        ScreenAnimationDelegate.AnimationType animationType;
        ScreenEventEmitter screenEventEmitter = new ScreenEventEmitter(this.screen);
        if (z) {
            animationType = ScreenAnimationDelegate.AnimationType.ENTER;
        } else {
            animationType = ScreenAnimationDelegate.AnimationType.EXIT;
        }
        animatorSet.addListener(new ScreenAnimationDelegate(screenStackFragment, screenEventEmitter, animationType));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.swmansion.rnscreens.bottomsheet.SheetDelegate.attachCommonListeners.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
                SheetDelegate.this.isSheetAnimationInProgress = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
                SheetDelegate.this.isSheetAnimationInProgress = false;
                SheetDelegate.this.getScreen().onSheetYTranslationChanged$react_native_screens_release();
            }
        });
    }

    final class KeyboardHandler extends BottomSheetBehavior.BottomSheetCallback {
        public void onSlide(@NotNull View view, float f) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public KeyboardHandler() {
        }

        public void onStateChanged(@NotNull View view, int i) {
            Intrinsics.checkNotNullParameter(view, "");
            if (i == 4 && WindowInsetsCompat.onExtraCallbackWithResult(view.getRootWindowInsets()).IAuthTabCallback(WindowInsetsCompat.onTransact.IAuthTabCallback())) {
                view.requestFocus();
                InputMethodManager inputMethodManager = SheetDelegate.this.getInputMethodManager();
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        }
    }

    final class SheetStateObserver extends BottomSheetBehavior.BottomSheetCallback {
        public void onSlide(@NotNull View view, float f) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public SheetStateObserver() {
        }

        public void onStateChanged(@NotNull View view, int i) {
            Intrinsics.checkNotNullParameter(view, "");
            SheetDelegate.this.onSheetStateChanged(i);
        }
    }

    public static final class SheetAnimationContext {
        private final CoordinatorLayout coordinatorLayout;
        private final DimmingViewManager dimmingDelegate;
        private final ScreenStackFragment fragment;
        private final Screen screen;

        public static /* synthetic */ SheetAnimationContext copy$default(SheetAnimationContext sheetAnimationContext, ScreenStackFragment screenStackFragment, Screen screen, CoordinatorLayout coordinatorLayout, DimmingViewManager dimmingViewManager, int i, Object obj) {
            if ((i & 1) != 0) {
                screenStackFragment = sheetAnimationContext.fragment;
            }
            if ((i & 2) != 0) {
                screen = sheetAnimationContext.screen;
            }
            if ((i & 4) != 0) {
                coordinatorLayout = sheetAnimationContext.coordinatorLayout;
            }
            if ((i & 8) != 0) {
                dimmingViewManager = sheetAnimationContext.dimmingDelegate;
            }
            return sheetAnimationContext.copy(screenStackFragment, screen, coordinatorLayout, dimmingViewManager);
        }

        public final ScreenStackFragment component1() {
            return this.fragment;
        }

        public final Screen component2() {
            return this.screen;
        }

        public final CoordinatorLayout component3() {
            return this.coordinatorLayout;
        }

        public final DimmingViewManager component4() {
            return this.dimmingDelegate;
        }

        public final SheetAnimationContext copy(@NotNull ScreenStackFragment screenStackFragment, @NotNull Screen screen, @NotNull CoordinatorLayout coordinatorLayout, @NotNull DimmingViewManager dimmingViewManager) {
            Intrinsics.checkNotNullParameter(screenStackFragment, "");
            Intrinsics.checkNotNullParameter(screen, "");
            Intrinsics.checkNotNullParameter(coordinatorLayout, "");
            Intrinsics.checkNotNullParameter(dimmingViewManager, "");
            return new SheetAnimationContext(screenStackFragment, screen, coordinatorLayout, dimmingViewManager);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SheetAnimationContext)) {
                return false;
            }
            SheetAnimationContext sheetAnimationContext = (SheetAnimationContext) obj;
            return Intrinsics.areEqual(this.fragment, sheetAnimationContext.fragment) && Intrinsics.areEqual(this.screen, sheetAnimationContext.screen) && Intrinsics.areEqual(this.coordinatorLayout, sheetAnimationContext.coordinatorLayout) && Intrinsics.areEqual(this.dimmingDelegate, sheetAnimationContext.dimmingDelegate);
        }

        public int hashCode() {
            return (((((this.fragment.hashCode() * 31) + this.screen.hashCode()) * 31) + this.coordinatorLayout.hashCode()) * 31) + this.dimmingDelegate.hashCode();
        }

        public String toString() {
            return "SheetAnimationContext(fragment=" + this.fragment + ", screen=" + this.screen + ", coordinatorLayout=" + this.coordinatorLayout + ", dimmingDelegate=" + this.dimmingDelegate + ")";
        }

        public SheetAnimationContext(@NotNull ScreenStackFragment screenStackFragment, @NotNull Screen screen, @NotNull CoordinatorLayout coordinatorLayout, @NotNull DimmingViewManager dimmingViewManager) {
            Intrinsics.checkNotNullParameter(screenStackFragment, "");
            Intrinsics.checkNotNullParameter(screen, "");
            Intrinsics.checkNotNullParameter(coordinatorLayout, "");
            Intrinsics.checkNotNullParameter(dimmingViewManager, "");
            this.fragment = screenStackFragment;
            this.screen = screen;
            this.coordinatorLayout = coordinatorLayout;
            this.dimmingDelegate = dimmingViewManager;
        }

        public final ScreenStackFragment getFragment() {
            return this.fragment;
        }

        public final Screen getScreen() {
            return this.screen;
        }

        public final CoordinatorLayout getCoordinatorLayout() {
            return this.coordinatorLayout;
        }

        public final DimmingViewManager getDimmingDelegate() {
            return this.dimmingDelegate;
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
