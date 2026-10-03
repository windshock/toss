package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NetscapeRevocationURL {
    public static final boolean onWarmupCompleted(@NotNull View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        if (z) {
            view.animate().setDuration(200L).rotation(180.0f);
            return true;
        }
        view.animate().setDuration(200L).rotation(0.0f);
        return false;
    }

    public static final void IAuthTabCallback(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        view.startAnimation(onExtraCallbackWithResult(view));
    }

    private static final Animation onExtraCallbackWithResult(View view) {
        view.measure(-1, -2);
        int measuredHeight = view.getMeasuredHeight();
        view.getLayoutParams().height = 0;
        view.setVisibility(0);
        onExtraCallback onextracallback = new onExtraCallback(view, measuredHeight);
        long j = (long) (measuredHeight / view.getContext().getResources().getDisplayMetrics().density);
        if (j > 300) {
            j = 300;
        }
        onextracallback.setDuration(j);
        view.startAnimation(onextracallback);
        return onextracallback;
    }

    public static final class onExtraCallback extends Animation {
        final /* synthetic */ View IAuthTabCallback;
        final /* synthetic */ int onExtraCallback;

        onExtraCallback(View view, int i) {
            this.IAuthTabCallback = view;
            this.onExtraCallback = i;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f, Transformation transformation) {
            this.IAuthTabCallback.getLayoutParams().height = f == 1.0f ? -2 : (int) (this.onExtraCallback * f);
            this.IAuthTabCallback.requestLayout();
        }
    }

    public static final void onExtraCallback(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        int measuredHeight = view.getMeasuredHeight();
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(view, measuredHeight);
        long j = (long) (measuredHeight / view.getContext().getResources().getDisplayMetrics().density);
        if (j > 300) {
            j = 300;
        }
        iAuthTabCallback.setDuration(j);
        view.startAnimation(iAuthTabCallback);
    }

    public static final class IAuthTabCallback extends Animation {
        final /* synthetic */ int onExtraCallbackWithResult;
        final /* synthetic */ View onWarmupCompleted;

        IAuthTabCallback(View view, int i) {
            this.onWarmupCompleted = view;
            this.onExtraCallbackWithResult = i;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f, Transformation transformation) {
            if (f == 1.0f) {
                this.onWarmupCompleted.setVisibility(8);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.onWarmupCompleted.getLayoutParams();
            float f2 = this.onExtraCallbackWithResult;
            layoutParams.height = (int) (f2 - (f * f2));
            this.onWarmupCompleted.requestLayout();
        }
    }
}
