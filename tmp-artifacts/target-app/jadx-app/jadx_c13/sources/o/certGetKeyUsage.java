package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class certGetKeyUsage implements certGetCertPolicy {

    static final class onWarmupCompleted extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        final /* synthetic */ Function1<access13800<? super R>, Object> $block;
        final /* synthetic */ Ref.ObjectRef<R> $result;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(Ref.ObjectRef<R> objectRef, Function1<? super access13800<? super R>, ? extends Object> function1, access13800<? super onWarmupCompleted> access13800Var) {
            super(1, access13800Var);
            this.$result = objectRef;
            this.$block = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(access13800<? super Unit> access13800Var) {
            return ((onWarmupCompleted) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            return new onWarmupCompleted(this.$result, this.$block, access13800Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            T t;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Ref.ObjectRef objectRef2 = this.$result;
                Function1<access13800<? super R>, Object> function1 = this.$block;
                this.L$0 = objectRef2;
                this.label = 1;
                Object objInvoke = function1.invoke(this);
                if (objInvoke == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                objectRef = objectRef2;
                t = objInvoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.onNavigationEvent(obj);
                t = obj;
            }
            objectRef.element = t;
            return Unit.INSTANCE;
        }
    }

    @Override // o.certGetCertPolicy
    public <R> R onWarmupCompleted(@NotNull Function1<? super access13800<? super R>, ? extends Object> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        access13900.onWarmupCompleted(new onWarmupCompleted(objectRef, function1, null), new onExtraCallback());
        try {
            R r = (R) objectRef.element;
            if (r != null) {
                return r;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            return (R) Unit.INSTANCE;
        } catch (Exception e) {
            throw new IllegalStateException("Seems that you are trying to use Kotlin Coroutines library from KStateMachine callbacks, use kstatemachine-coroutines support library to make that work", e);
        }
    }

    public static final class onExtraCallback implements access13800<Unit> {
        private final access13600 IAuthTabCallback = access13600.IAuthTabCallback;

        onExtraCallback() {
        }

        @Override // o.access13800
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public access13600 getContext() {
            return this.IAuthTabCallback;
        }

        @Override // o.access13800
        public void resumeWith(Object obj) {
            ResultKt.onNavigationEvent(obj);
        }
    }

    @Override // o.certGetCertPolicy
    public <R> Object onNavigationEvent(@NotNull Function1<? super access13800<? super R>, ? extends Object> function1, @NotNull access13800<? super R> access13800Var) {
        return function1.invoke(access13800Var);
    }
}
