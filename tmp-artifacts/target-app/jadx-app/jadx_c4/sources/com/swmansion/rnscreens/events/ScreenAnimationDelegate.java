package com.swmansion.rnscreens.events;

import android.animation.Animator;
import com.swmansion.rnscreens.ScreenStackFragmentWrapper;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.access15300;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ScreenAnimationDelegate implements Animator.AnimatorListener {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "ScreenEventDelegate";
    private final AnimationType animationType;
    private LifecycleState currentState;
    private final ScreenEventEmitter eventEmitter;
    private final ScreenStackFragmentWrapper wrapper;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LifecycleState.values().length];
            try {
                iArr[LifecycleState.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LifecycleState.START_DISPATCHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LifecycleState.END_DISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AnimationType.values().length];
            try {
                iArr2[AnimationType.ENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AnimationType.EXIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@NotNull Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@NotNull Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "");
    }

    public ScreenAnimationDelegate(@NotNull ScreenStackFragmentWrapper screenStackFragmentWrapper, @Nullable ScreenEventEmitter screenEventEmitter, @NotNull AnimationType animationType) {
        Intrinsics.checkNotNullParameter(screenStackFragmentWrapper, "");
        Intrinsics.checkNotNullParameter(animationType, "");
        this.wrapper = screenStackFragmentWrapper;
        this.eventEmitter = screenEventEmitter;
        this.animationType = animationType;
        this.currentState = LifecycleState.INITIALIZED;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AnimationType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType ENTER = new AnimationType("ENTER", 0);
        public static final AnimationType EXIT = new AnimationType("EXIT", 1);

        private static final /* synthetic */ AnimationType[] $values() {
            return new AnimationType[]{ENTER, EXIT};
        }

        public static EnumEntries<AnimationType> getEntries() {
            return $ENTRIES;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }

        private AnimationType(String str, int i) {
        }

        static {
            AnimationType[] animationTypeArr$values = $values();
            $VALUES = animationTypeArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(animationTypeArr$values);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void progressState() throws NoWhenBranchMatchedException {
        LifecycleState lifecycleState;
        int i = WhenMappings.$EnumSwitchMapping$0[this.currentState.ordinal()];
        if (i == 1) {
            lifecycleState = LifecycleState.START_DISPATCHED;
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            lifecycleState = LifecycleState.END_DISPATCHED;
        }
        this.currentState = lifecycleState;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@NotNull Animator animator) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(animator, "");
        if (this.currentState == LifecycleState.INITIALIZED) {
            progressState();
            int i = WhenMappings.$EnumSwitchMapping$1[this.animationType.ordinal()];
            if (i == 1) {
                ScreenEventEmitter screenEventEmitter = this.eventEmitter;
                if (screenEventEmitter != null) {
                    screenEventEmitter.dispatchOnWillAppear();
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ScreenEventEmitter screenEventEmitter2 = this.eventEmitter;
                if (screenEventEmitter2 != null) {
                    screenEventEmitter2.dispatchOnWillDisappear();
                }
            }
            boolean z = this.animationType == AnimationType.EXIT;
            ScreenEventEmitter screenEventEmitter3 = this.eventEmitter;
            if (screenEventEmitter3 != null) {
                screenEventEmitter3.dispatchTransitionProgress(0.0f, z, z);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@NotNull Animator animator) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(animator, "");
        if (this.currentState == LifecycleState.START_DISPATCHED) {
            progressState();
            animator.removeListener(this);
            int i = WhenMappings.$EnumSwitchMapping$1[this.animationType.ordinal()];
            if (i == 1) {
                ScreenEventEmitter screenEventEmitter = this.eventEmitter;
                if (screenEventEmitter != null) {
                    screenEventEmitter.dispatchOnAppear();
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ScreenEventEmitter screenEventEmitter2 = this.eventEmitter;
                if (screenEventEmitter2 != null) {
                    screenEventEmitter2.dispatchOnDisappear();
                }
            }
            boolean z = this.animationType == AnimationType.EXIT;
            ScreenEventEmitter screenEventEmitter3 = this.eventEmitter;
            if (screenEventEmitter3 != null) {
                screenEventEmitter3.dispatchTransitionProgress(1.0f, z, z);
            }
            this.wrapper.getScreen().endRemovalTransition();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class LifecycleState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LifecycleState[] $VALUES;
        public static final LifecycleState INITIALIZED = new LifecycleState("INITIALIZED", 0);
        public static final LifecycleState START_DISPATCHED = new LifecycleState("START_DISPATCHED", 1);
        public static final LifecycleState END_DISPATCHED = new LifecycleState("END_DISPATCHED", 2);

        private static final /* synthetic */ LifecycleState[] $values() {
            return new LifecycleState[]{INITIALIZED, START_DISPATCHED, END_DISPATCHED};
        }

        public static EnumEntries<LifecycleState> getEntries() {
            return $ENTRIES;
        }

        public static LifecycleState valueOf(String str) {
            return (LifecycleState) Enum.valueOf(LifecycleState.class, str);
        }

        public static LifecycleState[] values() {
            return (LifecycleState[]) $VALUES.clone();
        }

        private LifecycleState(String str, int i) {
        }

        static {
            LifecycleState[] lifecycleStateArr$values = $values();
            $VALUES = lifecycleStateArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(lifecycleStateArr$values);
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
