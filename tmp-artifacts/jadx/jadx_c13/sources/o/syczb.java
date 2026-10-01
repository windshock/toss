package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class syczb {
    public static final Object onExtraCallbackWithResult(@NotNull IAnimation<?> iAnimation, @NotNull access13800<? super Unit> access13800Var) {
        Object objCollect = iAnimation.collect(syaycx.onNavigationEvent, access13800Var);
        return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ IAnimation<T> $this_launchIn;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(IAnimation<? extends T> iAnimation, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$this_launchIn = iAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallback(this.$this_launchIn, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((onExtraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                IAnimation<T> iAnimation = this.$this_launchIn;
                this.label = 1;
                if (ycxycx.onExtraCallbackWithResult((IAnimation<?>) iAnimation, (access13800<? super Unit>) this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final <T> getPackageType onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull findResAndMsg findresandmsg) {
        return onLoadStarted.onExtraCallback(findresandmsg, null, null, new onExtraCallback(iAnimation, null), 3, null);
    }

    public static final <T> Object IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super Unit>, ? extends Object> function2, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult((IAnimation<?>) lud1.onExtraCallbackWithResult(ycxycx.onNavigationEvent(iAnimation, function2), 0, null, 2, null), access13800Var);
        return objOnExtraCallbackWithResult == access14100.onExtraCallback() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
    }

    public static final <T> Object IAuthTabCallback(@NotNull setRipple<? super T> setripple, @NotNull IAnimation<? extends T> iAnimation, @NotNull access13800<? super Unit> access13800Var) {
        ycxycx.onExtraCallback(setripple);
        Object objCollect = iAnimation.collect(setripple, access13800Var);
        return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
    }
}
