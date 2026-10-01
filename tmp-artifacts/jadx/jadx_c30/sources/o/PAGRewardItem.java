package o;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGRewardItem {
    public static <T, U, E extends Throwable> void IAuthTabCallback(final PAGRewardFullExpressAdListenerProxy4<T, U, E> pAGRewardFullExpressAdListenerProxy4, final T t, final U u) {
        onExtraCallback(new thx5() { // from class: org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda8
            @Override // o.thx5
            public final void run() throws Throwable {
                pAGRewardFullExpressAdListenerProxy4.accept(t, u);
            }
        });
    }

    public static <T, E extends Throwable> void onExtraCallback(final onUserEarnedReward<T, E> onuserearnedreward, final T t) {
        onExtraCallback(new thx5() { // from class: org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda19
            @Override // o.thx5
            public final void run() throws Throwable {
                onuserearnedreward.accept(t);
            }
        });
    }

    public static <T, U, R, E extends Throwable> R onExtraCallback(final PAGRewardedAd<T, U, R, E> pAGRewardedAd, final T t, final U u) {
        return (R) IAuthTabCallback(new wwx11() { // from class: org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda9
            @Override // o.wwx11
            public final Object get() {
                return pAGRewardedAd.apply(t, u);
            }
        });
    }

    public static <T, R, E extends Throwable> R IAuthTabCallback(final TTAdDislikeToast2<T, R, E> tTAdDislikeToast2, final T t) {
        return (R) IAuthTabCallback(new wwx11() { // from class: org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda7
            @Override // o.wwx11
            public final Object get() {
                return tTAdDislikeToast2.apply(t);
            }
        });
    }

    public static <V, E extends Throwable> V onExtraCallbackWithResult(final onUserEarnedRewardFail<V, E> onuserearnedrewardfail) {
        return (V) IAuthTabCallback(new wwx11() { // from class: org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda20
            @Override // o.wwx11
            public final Object get() {
                return onuserearnedrewardfail.onExtraCallback();
            }
        });
    }

    public static <T, E extends Throwable> T IAuthTabCallback(wwx11<T, E> wwx11Var) {
        try {
            return wwx11Var.get();
        } catch (Throwable th) {
            throw onNavigationEvent(th);
        }
    }

    public static <E extends Throwable> boolean onExtraCallbackWithResult(PAGRewardedAdLoadCallback<E> pAGRewardedAdLoadCallback) {
        try {
            return pAGRewardedAdLoadCallback.getAsBoolean();
        } catch (Throwable th) {
            throw onNavigationEvent(th);
        }
    }

    public static RuntimeException onNavigationEvent(Throwable th) {
        Objects.requireNonNull(th, "throwable");
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof IOException) {
            throw new UncheckedIOException((IOException) th);
        }
        throw new UndeclaredThrowableException(th);
    }

    public static <E extends Throwable> void onExtraCallback(thx5<E> thx5Var) {
        try {
            thx5Var.run();
        } catch (Throwable th) {
            throw onNavigationEvent(th);
        }
    }

    public static <T, U, E extends Throwable> boolean IAuthTabCallback(final PAGRewardedAdInteractionCallback<T, U, E> pAGRewardedAdInteractionCallback, final T t, final U u) {
        return onExtraCallbackWithResult(new PAGRewardedAdLoadCallback() { // from class: org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda15
            @Override // o.PAGRewardedAdLoadCallback
            public final boolean getAsBoolean() {
                return pAGRewardedAdInteractionCallback.test(t, u);
            }
        });
    }

    public static <T, E extends Throwable> boolean onExtraCallbackWithResult(final thxycx<T, E> thxycxVar, final T t) {
        return onExtraCallbackWithResult(new PAGRewardedAdLoadCallback() { // from class: org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda12
            @Override // o.PAGRewardedAdLoadCallback
            public final boolean getAsBoolean() {
                return thxycxVar.test(t);
            }
        });
    }
}
