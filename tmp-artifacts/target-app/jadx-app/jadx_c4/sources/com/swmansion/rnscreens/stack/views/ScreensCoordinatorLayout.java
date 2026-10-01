package com.swmansion.rnscreens.stack.views;

import android.content.Context;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.swmansion.rnscreens.PointerEventsBoxNoneImpl;
import com.swmansion.rnscreens.ScreenStackFragment;
import com.swmansion.rnscreens.bottomsheet.SheetUtilsKt;
import com.swmansion.rnscreens.stack.anim.ScreensAnimation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ScreensCoordinatorLayout extends CoordinatorLayout implements ReactPointerEventsView {
    private final Animation.AnimationListener animationListener;
    private final ScreenStackFragment fragment;
    private final ReactPointerEventsView pointerEventsImpl;

    public CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1 getPointerEvents() {
        return this.pointerEventsImpl.getPointerEvents();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreensCoordinatorLayout(@NotNull Context context, @NotNull ScreenStackFragment screenStackFragment, @NotNull ReactPointerEventsView reactPointerEventsView) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(screenStackFragment, "");
        Intrinsics.checkNotNullParameter(reactPointerEventsView, "");
        this.fragment = screenStackFragment;
        this.pointerEventsImpl = reactPointerEventsView;
        this.animationListener = new Animation.AnimationListener() { // from class: com.swmansion.rnscreens.stack.views.ScreensCoordinatorLayout$animationListener$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) throws NoWhenBranchMatchedException {
                Intrinsics.checkNotNullParameter(animation, "");
                this.this$0.getFragment$react_native_screens_release().onViewAnimationStart();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) throws NoWhenBranchMatchedException {
                Intrinsics.checkNotNullParameter(animation, "");
                this.this$0.getFragment$react_native_screens_release().onViewAnimationEnd();
            }
        };
    }

    public final ScreenStackFragment getFragment$react_native_screens_release() {
        return this.fragment;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreensCoordinatorLayout(@NotNull Context context, @NotNull ScreenStackFragment screenStackFragment) {
        this(context, screenStackFragment, new PointerEventsBoxNoneImpl());
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(screenStackFragment, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WindowInsets onApplyWindowInsets(@Nullable WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super/*android.view.View*/.onApplyWindowInsets(windowInsets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "");
        return windowInsetsOnApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void startAnimation(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "");
        ScreensAnimation screensAnimation = new ScreensAnimation(this.fragment);
        screensAnimation.setDuration(animation.getDuration());
        if ((animation instanceof AnimationSet) && !this.fragment.isRemoving()) {
            AnimationSet animationSet = (AnimationSet) animation;
            animationSet.addAnimation(screensAnimation);
            animationSet.setAnimationListener(this.animationListener);
            super/*android.view.View*/.startAnimation(animationSet);
            return;
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(animation);
        animationSet2.addAnimation(screensAnimation);
        animationSet2.setAnimationListener(this.animationListener);
        super/*android.view.View*/.startAnimation(animationSet2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void clearFocus() {
        if (getVisibility() != 4) {
            super/*android.view.View*/.clearFocus();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (SheetUtilsKt.usesFormSheetPresentation(this.fragment.getScreen())) {
            this.fragment.getScreen().onBottomSheetBehaviorDidLayout$react_native_screens_release(z);
        }
    }
}
