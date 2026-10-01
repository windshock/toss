package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import o.jwycx;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class jwycx {
    private static final Function1<Object, Object> onNavigationEvent = new Function1() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return jwycx.onExtraCallback(obj);
        }
    };
    private static final Function2<Object, Object, Boolean> onExtraCallback = new Function2() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(jwycx.onNavigationEvent(obj, obj2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onExtraCallback(Object obj) {
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation) {
        return iAnimation instanceof setRubIn ? iAnimation : onExtraCallbackWithResult(iAnimation, onNavigationEvent, onExtraCallback);
    }

    public static final <T> IAnimation<T> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super T, Boolean> function2) {
        Function1<Object, Object> function1 = onNavigationEvent;
        Intrinsics.checkNotNull(function2, "");
        return onExtraCallbackWithResult(iAnimation, function1, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2));
    }

    public static final <T, K> IAnimation<T> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function1<? super T, ? extends K> function1) {
        return onExtraCallbackWithResult(iAnimation, function1, onExtraCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onNavigationEvent(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> IAnimation<T> onExtraCallbackWithResult(IAnimation<? extends T> iAnimation, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        if (iAnimation instanceof ok1) {
            ok1 ok1Var = (ok1) iAnimation;
            if (ok1Var.onExtraCallback == function1 && ok1Var.IAuthTabCallback == function2) {
                return iAnimation;
            }
        }
        return new ok1(iAnimation, function1, function2);
    }
}
