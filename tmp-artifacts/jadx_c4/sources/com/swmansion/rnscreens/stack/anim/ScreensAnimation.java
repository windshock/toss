package com.swmansion.rnscreens.stack.anim;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.swmansion.rnscreens.ScreenFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ScreensAnimation extends Animation {
    private final ScreenFragment mFragment;

    public ScreensAnimation(@NotNull ScreenFragment screenFragment) {
        Intrinsics.checkNotNullParameter(screenFragment, "");
        this.mFragment = screenFragment;
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, @NotNull Transformation transformation) {
        Intrinsics.checkNotNullParameter(transformation, "");
        super.applyTransformation(f, transformation);
        this.mFragment.dispatchTransitionProgressEvent(f, !r3.isResumed());
    }
}
