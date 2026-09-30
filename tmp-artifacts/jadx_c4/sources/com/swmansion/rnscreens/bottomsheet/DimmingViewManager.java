package com.swmansion.rnscreens.bottomsheet;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenStackFragment;
import com.swmansion.rnscreens.bottomsheet.DimmingViewManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DimmingViewManager {
    private final DimmingView dimmingView;
    private BottomSheetBehavior.BottomSheetCallback dimmingViewCallback;
    private final float maxAlpha;
    private final CredentialProviderGetSignInIntentControllerhandleResponse2 reactContext;

    public DimmingViewManager(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2, @NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        Intrinsics.checkNotNullParameter(screen, "");
        this.reactContext = credentialProviderGetSignInIntentControllerhandleResponse2;
        this.dimmingView = createDimmingView(screen);
        this.maxAlpha = 0.3f;
    }

    public final CredentialProviderGetSignInIntentControllerhandleResponse2 getReactContext() {
        return this.reactContext;
    }

    public final DimmingView getDimmingView$react_native_screens_release() {
        return this.dimmingView;
    }

    public final float getMaxAlpha$react_native_screens_release() {
        return this.maxAlpha;
    }

    public final void onViewHierarchyCreated(@NotNull Screen screen, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(screen, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        viewGroup.addView(this.dimmingView, 0);
        if (!willDimForDetentIndex(screen, screen.getSheetInitialDetentIndex())) {
            this.dimmingView.setAlpha(0.0f);
        } else {
            this.dimmingView.setAlpha(this.maxAlpha);
        }
    }

    public final void onBehaviourAttached(@NotNull Screen screen, @NotNull BottomSheetBehavior<Screen> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(screen, "");
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        bottomSheetBehavior.addBottomSheetCallback(requireBottomSheetCallback(screen, true));
    }

    public final boolean willDimForDetentIndex(@NotNull Screen screen, int i) {
        Intrinsics.checkNotNullParameter(screen, "");
        return i > screen.getSheetLargestUndimmedDetentIndex();
    }

    public final void invalidate(@Nullable BottomSheetBehavior<Screen> bottomSheetBehavior) {
        BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.dimmingViewCallback;
        if (bottomSheetCallback == null || bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.removeBottomSheetCallback(bottomSheetCallback);
    }

    static final class AnimateDimmingViewCallback extends BottomSheetBehavior.BottomSheetCallback {
        private final ValueAnimator animator;
        private float firstDimmedOffset;
        private float intervalLength;
        private float largestUndimmedOffset;
        private final float maxAlpha;
        private final Screen screen;
        private final View viewToAnimate;

        public AnimateDimmingViewCallback(@NotNull Screen screen, @NotNull View view, float f) {
            Intrinsics.checkNotNullParameter(screen, "");
            Intrinsics.checkNotNullParameter(view, "");
            this.screen = screen;
            this.viewToAnimate = view;
            this.maxAlpha = f;
            this.largestUndimmedOffset = computeOffsetFromDetentIndex(screen.getSheetLargestUndimmedDetentIndex());
            float fComputeOffsetFromDetentIndex = computeOffsetFromDetentIndex(RangesKt.coerceIn(screen.getSheetLargestUndimmedDetentIndex() + 1, 0, screen.getSheetDetents().getCount$react_native_screens_release() - 1));
            this.firstDimmedOffset = fComputeOffsetFromDetentIndex;
            this.intervalLength = fComputeOffsetFromDetentIndex - this.largestUndimmedOffset;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f);
            valueAnimatorOfFloat.setDuration(1L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.bottomsheet.DimmingViewManager$AnimateDimmingViewCallback$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DimmingViewManager.AnimateDimmingViewCallback.animator$lambda$0$0(this.f$0, valueAnimator);
                }
            });
            this.animator = valueAnimatorOfFloat;
        }

        public final Screen getScreen() {
            return this.screen;
        }

        public final View getViewToAnimate() {
            return this.viewToAnimate;
        }

        public final float getMaxAlpha() {
            return this.maxAlpha;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void animator$lambda$0$0(AnimateDimmingViewCallback animateDimmingViewCallback, ValueAnimator valueAnimator) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            View view = animateDimmingViewCallback.viewToAnimate;
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            view.setAlpha(((Float) animatedValue).floatValue());
        }

        public void onStateChanged(@NotNull View view, int i) {
            Intrinsics.checkNotNullParameter(view, "");
            if (i == 1 || i == 2) {
                this.largestUndimmedOffset = computeOffsetFromDetentIndex(this.screen.getSheetLargestUndimmedDetentIndex());
                float fComputeOffsetFromDetentIndex = computeOffsetFromDetentIndex(RangesKt.coerceIn(this.screen.getSheetLargestUndimmedDetentIndex() + 1, 0, this.screen.getSheetDetents().getCount$react_native_screens_release() - 1));
                this.firstDimmedOffset = fComputeOffsetFromDetentIndex;
                this.intervalLength = fComputeOffsetFromDetentIndex - this.largestUndimmedOffset;
            }
        }

        public void onSlide(@NotNull View view, float f) {
            Intrinsics.checkNotNullParameter(view, "");
            float f2 = this.largestUndimmedOffset;
            if (f2 >= f || f >= this.firstDimmedOffset) {
                return;
            }
            this.animator.setCurrentFraction((f - f2) / this.intervalLength);
        }

        private final float computeOffsetFromDetentIndex(int i) {
            int count$react_native_screens_release = this.screen.getSheetDetents().getCount$react_native_screens_release();
            if (count$react_native_screens_release == 1) {
                return (i == -1 || i != 0) ? -1.0f : 1.0f;
            }
            if (count$react_native_screens_release == 2) {
                if (i == -1) {
                    return -1.0f;
                }
                if (i != 0) {
                    return i != 1 ? -1.0f : 1.0f;
                }
                return 0.0f;
            }
            if (count$react_native_screens_release != 3 || i == -1) {
                return -1.0f;
            }
            if (i == 0) {
                return 0.0f;
            }
            if (i != 1) {
                return i != 2 ? -1.0f : 1.0f;
            }
            BottomSheetBehavior<Screen> sheetBehavior = this.screen.getSheetBehavior();
            Intrinsics.checkNotNull(sheetBehavior);
            return sheetBehavior.getHalfExpandedRatio();
        }
    }

    private final DimmingView createDimmingView(final Screen screen) {
        DimmingView dimmingView = new DimmingView(this.reactContext, this.maxAlpha);
        dimmingView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dimmingView.setOnClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.bottomsheet.DimmingViewManager$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DimmingViewManager.createDimmingView$lambda$0$0(screen, view);
            }
        });
        return dimmingView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDimmingView$lambda$0$0(Screen screen, View view) {
        if (screen.getSheetClosesOnTouchOutside()) {
            Fragment fragment = screen.getFragment();
            Intrinsics.checkNotNull(fragment, "");
            ((ScreenStackFragment) fragment).dismissSelf$react_native_screens_release();
        }
    }

    static /* synthetic */ BottomSheetBehavior.BottomSheetCallback requireBottomSheetCallback$default(DimmingViewManager dimmingViewManager, Screen screen, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return dimmingViewManager.requireBottomSheetCallback(screen, z);
    }

    private final BottomSheetBehavior.BottomSheetCallback requireBottomSheetCallback(Screen screen, boolean z) {
        if (this.dimmingViewCallback == null || z) {
            this.dimmingViewCallback = new AnimateDimmingViewCallback(screen, this.dimmingView, this.maxAlpha);
        }
        BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.dimmingViewCallback;
        Intrinsics.checkNotNull(bottomSheetCallback);
        return bottomSheetCallback;
    }
}
