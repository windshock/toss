package o;

import o.ViewTransitionExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setTransition<R> implements ViewTransitionExternalSyntheticLambda0<R> {
    static final setTransition<?> onNavigationEvent = new setTransition<>();
    private static final setAllowsGoneWidget<?> onWarmupCompleted = new onExtraCallbackWithResult();

    @Override // o.ViewTransitionExternalSyntheticLambda0
    public boolean IAuthTabCallback(Object obj, ViewTransitionExternalSyntheticLambda0.onNavigationEvent onnavigationevent) {
        return false;
    }

    public static class onExtraCallbackWithResult<R> implements setAllowsGoneWidget<R> {
        @Override // o.setAllowsGoneWidget
        public ViewTransitionExternalSyntheticLambda0<R> IAuthTabCallback(SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, boolean z) {
            return setTransition.onNavigationEvent;
        }
    }

    public static <R> setAllowsGoneWidget<R> IAuthTabCallback() {
        return (setAllowsGoneWidget<R>) onWarmupCompleted;
    }
}
