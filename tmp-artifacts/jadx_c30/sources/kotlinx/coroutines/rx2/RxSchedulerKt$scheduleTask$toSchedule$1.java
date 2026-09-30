package kotlinx.coroutines.rx2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.access13800;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final /* synthetic */ class RxSchedulerKt$scheduleTask$toSchedule$1 extends FunctionReferenceImpl implements Function1<access13800<? super Unit>, Object> {
    final /* synthetic */ CoroutineContext $ctx;
    final /* synthetic */ Runnable $decoratedBlock;
    final /* synthetic */ deserializeUriNullableCollection $disposable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RxSchedulerKt$scheduleTask$toSchedule$1(deserializeUriNullableCollection deserializeurinullablecollection, CoroutineContext coroutineContext, Runnable runnable) {
        super(1, Intrinsics.Kotlin.class, "task", "scheduleTask$task(Lio/reactivex/disposables/Disposable;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.$disposable = deserializeurinullablecollection;
        this.$ctx = coroutineContext;
        this.$decoratedBlock = runnable;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(access13800<? super Unit> access13800Var) {
        return RxSchedulerKt.IAuthTabCallback(this.$disposable, this.$ctx, this.$decoratedBlock, access13800Var);
    }
}
