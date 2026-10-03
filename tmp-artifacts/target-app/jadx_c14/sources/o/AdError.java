package o;

import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdError {

    public static final class IAuthTabCallback implements Animator.AnimatorListener {
        final /* synthetic */ Function0<Unit> IAuthTabCallback;
        private boolean onWarmupCompleted;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        IAuthTabCallback(Function0<Unit> function0) {
            this.IAuthTabCallback = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.onWarmupCompleted = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            if (this.onWarmupCompleted) {
                return;
            }
            this.IAuthTabCallback.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animator.AnimatorListener onWarmupCompleted(Function0<Unit> function0) {
        return new IAuthTabCallback(function0);
    }
}
