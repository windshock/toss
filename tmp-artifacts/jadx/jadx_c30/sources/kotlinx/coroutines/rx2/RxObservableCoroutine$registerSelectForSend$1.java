package kotlinx.coroutines.rx2;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.jni_YGNodeStyleGetBorderJNI;
import o.jni_YGNodeStyleGetFlexBasisJNI;
import o.ok;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RxObservableCoroutine$registerSelectForSend$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ jni_YGNodeStyleGetBorderJNI<?> $select;
    int label;
    final /* synthetic */ RxObservableCoroutine<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RxObservableCoroutine$registerSelectForSend$1(RxObservableCoroutine<T> rxObservableCoroutine, jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, access13800<? super RxObservableCoroutine$registerSelectForSend$1> access13800Var) {
        super(2, access13800Var);
        this.this$0 = rxObservableCoroutine;
        this.$select = jni_ygnodestylegetborderjni;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new RxObservableCoroutine$registerSelectForSend$1(this.this$0, this.$select, access13800Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i = this.label;
        if (i == 0) {
            ResultKt.onNavigationEvent(obj);
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni = ((RxObservableCoroutine) this.this$0).IAuthTabCallback;
            this.label = 1;
            if (jni_YGNodeStyleGetFlexBasisJNI.onExtraCallback.onNavigationEvent(jni_ygnodestylegetflexbasisjni, (Object) null, this, 1, (Object) null) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni = this.$select;
        ok okVar = this.this$0;
        Unit unit = Unit.INSTANCE;
        if (!jni_ygnodestylegetborderjni.onExtraCallbackWithResult(okVar, unit)) {
            jni_YGNodeStyleGetFlexBasisJNI.onExtraCallback.onExtraCallback(((RxObservableCoroutine) this.this$0).IAuthTabCallback, (Object) null, 1, (Object) null);
        }
        return unit;
    }
}
