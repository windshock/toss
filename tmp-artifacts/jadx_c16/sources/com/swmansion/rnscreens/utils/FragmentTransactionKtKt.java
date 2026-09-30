package com.swmansion.rnscreens.utils;

import com.swmansion.rnscreens.R;
import com.swmansion.rnscreens.Screen$StackAnimation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class FragmentTransactionKtKt {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void setTweenAnimations(@NotNull FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4, @NotNull Screen$StackAnimation screen$StackAnimation, boolean z) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(flowRowOverflowCompanionExternalSyntheticLambda4, "");
        Intrinsics.checkNotNullParameter(screen$StackAnimation, "");
        if (z) {
            switch (WhenMappings.$EnumSwitchMapping$0[screen$StackAnimation.ordinal()]) {
                case 1:
                    flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_default_enter_in, R.anim.rns_default_enter_out);
                    return;
                case 2:
                    int i = R.anim.rns_no_animation_20;
                    flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(i, i);
                    return;
                case 3:
                    flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_fade_in, R.anim.rns_fade_out);
                    return;
                case 4:
                    flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_slide_in_from_right, R.anim.rns_slide_out_to_left);
                    return;
                case 5:
                    flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_slide_in_from_left, R.anim.rns_slide_out_to_right);
                    return;
                case 6:
                    flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_slide_in_from_bottom, R.anim.rns_no_animation_medium);
                    return;
                case 7:
                    flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_fade_from_bottom, R.anim.rns_no_animation_350);
                    return;
                case 8:
                    flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_ios_from_right_foreground_open, R.anim.rns_ios_from_right_background_open);
                    return;
                case 9:
                    flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_ios_from_left_foreground_open, R.anim.rns_ios_from_left_background_open);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        switch (WhenMappings.$EnumSwitchMapping$0[screen$StackAnimation.ordinal()]) {
            case 1:
                flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_default_exit_in, R.anim.rns_default_exit_out);
                return;
            case 2:
                int i2 = R.anim.rns_no_animation_20;
                flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(i2, i2);
                return;
            case 3:
                flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_fade_in, R.anim.rns_fade_out);
                return;
            case 4:
                flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_slide_in_from_left, R.anim.rns_slide_out_to_right);
                return;
            case 5:
                flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_slide_in_from_right, R.anim.rns_slide_out_to_left);
                return;
            case 6:
                flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_no_animation_medium, R.anim.rns_slide_out_to_bottom);
                return;
            case 7:
                flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_no_animation_250, R.anim.rns_fade_to_bottom);
                return;
            case 8:
                flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_ios_from_right_background_close, R.anim.rns_ios_from_right_foreground_close);
                return;
            case 9:
                flowRowOverflowCompanionExternalSyntheticLambda4.onExtraCallback(R.anim.rns_ios_from_left_background_close, R.anim.rns_ios_from_left_foreground_close);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
