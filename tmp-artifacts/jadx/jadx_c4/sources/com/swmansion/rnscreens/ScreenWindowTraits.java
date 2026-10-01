package com.swmansion.rnscreens;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.rnscreens.Screen;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.CameraControllerExternalSyntheticLambda0;
import o.RenderInTransitionOverlayNodeElement;
import o.SuspendAnimationKtExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ScreenWindowTraits {
    private static boolean didSetNavigationBarAppearance;
    private static boolean didSetOrientation;
    private static boolean didSetStatusBarAppearance;
    public static final ScreenWindowTraits INSTANCE = new ScreenWindowTraits();
    private static ScreenWindowTraits$windowInsetsListener$1 windowInsetsListener = new RenderInTransitionOverlayNodeElement() { // from class: com.swmansion.rnscreens.ScreenWindowTraits$windowInsetsListener$1
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
            WindowInsetsCompat windowInsetsCompatOnNavigationEvent = ViewCompat.onNavigationEvent(view, windowInsetsCompat);
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnNavigationEvent, "");
            if (Build.VERSION.SDK_INT >= 30) {
                CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompatOnNavigationEvent.onWarmupCompleted(WindowInsetsCompat.onTransact.IAuthTabCallbackDefault());
                Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
                WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = new WindowInsetsCompat.onWarmupCompleted().onNavigationEvent(WindowInsetsCompat.onTransact.IAuthTabCallbackDefault(), CameraControllerExternalSyntheticLambda0.onNavigationEvent(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, 0, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback)).onExtraCallbackWithResult();
                Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnExtraCallbackWithResult, "");
                return windowInsetsCompatOnExtraCallbackWithResult;
            }
            WindowInsetsCompat windowInsetsCompatOnExtraCallback = windowInsetsCompatOnNavigationEvent.onExtraCallback(windowInsetsCompatOnNavigationEvent.onTransact(), 0, windowInsetsCompatOnNavigationEvent.asBinder(), windowInsetsCompatOnNavigationEvent.IAuthTabCallbackDefault());
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnExtraCallback, "");
            return windowInsetsCompatOnExtraCallback;
        }
    };

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Screen.WindowTraits.values().length];
            try {
                iArr[Screen.WindowTraits.ORIENTATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Screen.WindowTraits.STYLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Screen.WindowTraits.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Screen.WindowTraits.ANIMATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Screen.WindowTraits.NAVIGATION_BAR_HIDDEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ScreenWindowTraits() {
    }

    public final void applyDidSetOrientation$react_native_screens_release() {
        didSetOrientation = true;
    }

    public final void applyDidSetStatusBarAppearance$react_native_screens_release() {
        didSetStatusBarAppearance = true;
    }

    public final void applyDidSetNavigationBarAppearance$react_native_screens_release() {
        didSetNavigationBarAppearance = true;
    }

    public final void setOrientation$react_native_screens_release(@NotNull Screen screen, @Nullable Activity activity) {
        Integer screenOrientation;
        Intrinsics.checkNotNullParameter(screen, "");
        if (activity == null) {
            return;
        }
        Screen screenFindScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.ORIENTATION);
        activity.setRequestedOrientation((screenFindScreenForTrait == null || (screenOrientation = screenFindScreenForTrait.getScreenOrientation()) == null) ? -1 : screenOrientation.intValue());
    }

    public final void setStyle$react_native_screens_release(@NotNull Screen screen, @Nullable final Activity activity, @Nullable ReactContext reactContext) {
        final String statusBarStyle;
        Intrinsics.checkNotNullParameter(screen, "");
        if (activity == null || reactContext == null) {
            return;
        }
        Screen screenFindScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.STYLE);
        if (screenFindScreenForTrait == null || (statusBarStyle = screenFindScreenForTrait.getStatusBarStyle()) == null) {
            statusBarStyle = "light";
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.ScreenWindowTraits$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ScreenWindowTraits.setStyle$lambda$0(activity, statusBarStyle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStyle$lambda$0(Activity activity, String str) {
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "");
        new SuspendAnimationKtExternalSyntheticLambda0(activity.getWindow(), decorView).onNavigationEvent(Intrinsics.areEqual(str, "dark"));
    }

    public final void setHidden$react_native_screens_release(@NotNull Screen screen, @Nullable Activity activity) {
        Boolean boolIsStatusBarHidden;
        Intrinsics.checkNotNullParameter(screen, "");
        if (activity == null) {
            return;
        }
        Screen screenFindScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.HIDDEN);
        final boolean zBooleanValue = (screenFindScreenForTrait == null || (boolIsStatusBarHidden = screenFindScreenForTrait.isStatusBarHidden()) == null) ? false : boolIsStatusBarHidden.booleanValue();
        Window window = activity.getWindow();
        final SuspendAnimationKtExternalSyntheticLambda0 suspendAnimationKtExternalSyntheticLambda0 = new SuspendAnimationKtExternalSyntheticLambda0(window, window.getDecorView());
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.ScreenWindowTraits$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ScreenWindowTraits.setHidden$lambda$0(zBooleanValue, suspendAnimationKtExternalSyntheticLambda0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHidden$lambda$0(boolean z, SuspendAnimationKtExternalSyntheticLambda0 suspendAnimationKtExternalSyntheticLambda0) {
        if (z) {
            suspendAnimationKtExternalSyntheticLambda0.onExtraCallback(WindowInsetsCompat.onTransact.IAuthTabCallbackDefault());
        } else {
            suspendAnimationKtExternalSyntheticLambda0.onExtraCallbackWithResult(WindowInsetsCompat.onTransact.IAuthTabCallbackDefault());
        }
    }

    public final void setNavigationBarHidden$react_native_screens_release(@NotNull Screen screen, @Nullable Activity activity) {
        Boolean boolIsNavigationBarHidden;
        Intrinsics.checkNotNullParameter(screen, "");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        Screen screenFindScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.NAVIGATION_BAR_HIDDEN);
        if (screenFindScreenForTrait != null && (boolIsNavigationBarHidden = screenFindScreenForTrait.isNavigationBarHidden()) != null && boolIsNavigationBarHidden.booleanValue()) {
            SuspendAnimationKtExternalSyntheticLambda0 suspendAnimationKtExternalSyntheticLambda0 = new SuspendAnimationKtExternalSyntheticLambda0(window, window.getDecorView());
            suspendAnimationKtExternalSyntheticLambda0.onExtraCallback(WindowInsetsCompat.onTransact.asInterface());
            suspendAnimationKtExternalSyntheticLambda0.onWarmupCompleted(2);
            return;
        }
        new SuspendAnimationKtExternalSyntheticLambda0(window, window.getDecorView()).onExtraCallbackWithResult(WindowInsetsCompat.onTransact.asInterface());
    }

    public final void trySetWindowTraits$react_native_screens_release(@NotNull Screen screen, @Nullable Activity activity, @Nullable ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(screen, "");
        if (didSetOrientation) {
            setOrientation$react_native_screens_release(screen, activity);
        }
        if (didSetStatusBarAppearance) {
            setStyle$react_native_screens_release(screen, activity, reactContext);
            setHidden$react_native_screens_release(screen, activity);
        }
        if (didSetNavigationBarAppearance) {
            setNavigationBarHidden$react_native_screens_release(screen, activity);
        }
    }

    private final Screen findScreenForTrait(Screen screen, Screen.WindowTraits windowTraits) {
        Screen screenChildScreenWithTraitSet = childScreenWithTraitSet(screen, windowTraits);
        return screenChildScreenWithTraitSet != null ? screenChildScreenWithTraitSet : checkTraitForScreen(screen, windowTraits) ? screen : findParentWithTraitSet(screen, windowTraits);
    }

    private final Screen findParentWithTraitSet(Screen screen, Screen.WindowTraits windowTraits) {
        for (ViewParent container = screen.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof Screen) {
                Screen screen2 = (Screen) container;
                if (checkTraitForScreen(screen2, windowTraits)) {
                    return screen2;
                }
            }
        }
        return null;
    }

    private final Screen childScreenWithTraitSet(Screen screen, Screen.WindowTraits windowTraits) {
        ScreenFragmentWrapper fragmentWrapper;
        if (screen == null || (fragmentWrapper = screen.getFragmentWrapper()) == null) {
            return null;
        }
        Iterator<ScreenContainer> it = fragmentWrapper.getChildScreenContainers().iterator();
        while (it.hasNext()) {
            Screen topScreen = it.next().getTopScreen();
            ScreenWindowTraits screenWindowTraits = INSTANCE;
            Screen screenChildScreenWithTraitSet = screenWindowTraits.childScreenWithTraitSet(topScreen, windowTraits);
            if (screenChildScreenWithTraitSet != null) {
                return screenChildScreenWithTraitSet;
            }
            if (topScreen != null && screenWindowTraits.checkTraitForScreen(topScreen, windowTraits)) {
                return topScreen;
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final boolean checkTraitForScreen(Screen screen, Screen.WindowTraits windowTraits) throws NoWhenBranchMatchedException {
        int i = WhenMappings.$EnumSwitchMapping$0[windowTraits.ordinal()];
        if (i == 1) {
            return screen.getScreenOrientation() != null;
        }
        if (i == 2) {
            return screen.getStatusBarStyle() != null;
        }
        if (i == 3) {
            return screen.isStatusBarHidden() != null;
        }
        if (i == 4) {
            return screen.isStatusBarAnimated() != null;
        }
        if (i == 5) {
            return screen.isNavigationBarHidden() != null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
