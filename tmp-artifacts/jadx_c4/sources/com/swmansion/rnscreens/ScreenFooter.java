package com.swmansion.rnscreens;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.math.MathUtils;
import com.swmansion.rnscreens.bottomsheet.SheetUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ScreenFooter extends ReactViewGroup {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "ScreenFooter";
    private ScreenFooter$footerCallback$1 footerCallback;
    private final ScreenFooter$insetsAnimation$1 insetsAnimation;
    private boolean isAnimationControlledByKeyboard;
    private boolean isCallbackRegistered;
    private int lastBottomInset;
    private int lastContainerHeight;
    private float lastSlideOffset;
    private int lastStableSheetState;
    private final ReactContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.core.view.WindowInsetsAnimationCompat$Callback, com.swmansion.rnscreens.ScreenFooter$insetsAnimation$1] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.swmansion.rnscreens.ScreenFooter$footerCallback$1] */
    public ScreenFooter(@NotNull ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "");
        this.reactContext = reactContext;
        this.lastStableSheetState = 5;
        ?? r1 = new WindowInsetsAnimationCompat.Callback() { // from class: com.swmansion.rnscreens.ScreenFooter$insetsAnimation$1
            {
                super(0);
            }

            public WindowInsetsAnimationCompat.onExtraCallbackWithResult onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.onExtraCallbackWithResult onextracallbackwithresult) {
                Intrinsics.checkNotNullParameter(windowInsetsAnimationCompat, "");
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                this.this$0.isAnimationControlledByKeyboard = true;
                WindowInsetsAnimationCompat.onExtraCallbackWithResult onextracallbackwithresultOnStart = super.onStart(windowInsetsAnimationCompat, onextracallbackwithresult);
                Intrinsics.checkNotNullExpressionValue(onextracallbackwithresultOnStart, "");
                return onextracallbackwithresultOnStart;
            }

            public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list) {
                Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.this$0.lastBottomInset = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.IAuthTabCallback()).onExtraCallback - windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.asInterface()).onExtraCallback;
                ScreenFooter screenFooter = this.this$0;
                int i = screenFooter.lastContainerHeight;
                int reactHeight = this.this$0.getReactHeight();
                ScreenFooter screenFooter2 = this.this$0;
                screenFooter.layoutFooterOnYAxis(i, reactHeight, screenFooter2.sheetTopWhileDragging(screenFooter2.lastSlideOffset), this.this$0.lastBottomInset);
                return windowInsetsCompat;
            }

            public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
                Intrinsics.checkNotNullParameter(windowInsetsAnimationCompat, "");
                this.this$0.isAnimationControlledByKeyboard = false;
            }
        };
        this.insetsAnimation = r1;
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Context detached from activity while creating ScreenFooter");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "");
        ViewCompat.onExtraCallback(decorView, (WindowInsetsAnimationCompat.Callback) r1);
        this.footerCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.swmansion.rnscreens.ScreenFooter$footerCallback$1
            public void onStateChanged(View view, int i) {
                Intrinsics.checkNotNullParameter(view, "");
                if (SheetUtils.INSTANCE.isStateStable(i)) {
                    if (i == 3 || i == 4 || i == 6) {
                        ScreenFooter screenFooter = this.this$0;
                        screenFooter.layoutFooterOnYAxis(screenFooter.lastContainerHeight, this.this$0.getReactHeight(), this.this$0.sheetTopInStableState(i), this.this$0.lastBottomInset);
                    }
                    this.this$0.lastStableSheetState = i;
                }
            }

            public void onSlide(View view, float f) {
                Intrinsics.checkNotNullParameter(view, "");
                this.this$0.lastSlideOffset = Math.max(f, 0.0f);
                if (this.this$0.isAnimationControlledByKeyboard) {
                    return;
                }
                ScreenFooter screenFooter = this.this$0;
                int i = screenFooter.lastContainerHeight;
                int reactHeight = this.this$0.getReactHeight();
                ScreenFooter screenFooter2 = this.this$0;
                screenFooter.layoutFooterOnYAxis(i, reactHeight, screenFooter2.sheetTopWhileDragging(screenFooter2.lastSlideOffset), this.this$0.lastBottomInset);
            }
        };
    }

    public final ReactContext getReactContext() {
        return this.reactContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Screen getScreenParent() {
        ViewParent parent = getParent();
        if (parent instanceof Screen) {
            return (Screen) parent;
        }
        return null;
    }

    private final BottomSheetBehavior<Screen> getSheetBehavior() {
        return requireScreenParent().getSheetBehavior();
    }

    private final boolean getHasReceivedInitialLayoutFromParent() {
        return this.lastContainerHeight > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getReactHeight() {
        return getMeasuredHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getReactWidth() {
        return getMeasuredWidth();
    }

    private final Screen requireScreenParent() {
        Screen screenParent = getScreenParent();
        if (screenParent != null) {
            return screenParent;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final BottomSheetBehavior<Screen> requireSheetBehavior() {
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            return sheetBehavior;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getHasReceivedInitialLayoutFromParent()) {
            layoutFooterOnYAxis(this.lastContainerHeight, i4 - i2, sheetTopInStableState(requireSheetBehavior().getState()), this.lastBottomInset);
        }
    }

    public final void registerWithSheetBehavior(@NotNull BottomSheetBehavior<Screen> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        if (this.isCallbackRegistered) {
            return;
        }
        bottomSheetBehavior.addBottomSheetCallback(this.footerCallback);
        this.isCallbackRegistered = true;
    }

    public final void unregisterWithSheetBehavior(@NotNull BottomSheetBehavior<Screen> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        if (this.isCallbackRegistered) {
            bottomSheetBehavior.removeBottomSheetCallback(this.footerCallback);
            this.isCallbackRegistered = false;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            registerWithSheetBehavior(sheetBehavior);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            unregisterWithSheetBehavior(sheetBehavior);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int sheetTopInStableState(int i) {
        BottomSheetBehavior<Screen> bottomSheetBehaviorRequireSheetBehavior = requireSheetBehavior();
        if (i == 3) {
            return bottomSheetBehaviorRequireSheetBehavior.getExpandedOffset();
        }
        if (i == 4) {
            return this.lastContainerHeight - bottomSheetBehaviorRequireSheetBehavior.getPeekHeight();
        }
        if (i == 5) {
            return this.lastContainerHeight;
        }
        if (i == 6) {
            return (int) (this.lastContainerHeight * (1.0f - bottomSheetBehaviorRequireSheetBehavior.getHalfExpandedRatio()));
        }
        throw new IllegalArgumentException("[RNScreens] use of stable-state method for unstable state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int sheetTopWhileDragging(float f) {
        Screen screenParent = getScreenParent();
        return screenParent != null ? screenParent.getTop() : (int) MathUtils.lerp(sheetTopInStableState(4), sheetTopInStableState(3), f);
    }

    public final void onParentLayout(boolean z, int i, int i2, int i3, int i4, int i5) {
        this.lastContainerHeight = i5;
        layoutFooterOnYAxis$default(this, i5, getReactHeight(), sheetTopInStableState(requireSheetBehavior().getState()), 0, 8, null);
    }

    public static /* synthetic */ void layoutFooterOnYAxis$default(ScreenFooter screenFooter, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        screenFooter.layoutFooterOnYAxis(i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void layoutFooterOnYAxis(int i, int i2, int i3, int i4) {
        int iMax = Math.max(i4, 0);
        int reactHeight = getReactHeight();
        setTop(Math.max(((i - i2) - i3) - iMax, 0));
        setBottom(getTop() + reactHeight);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
