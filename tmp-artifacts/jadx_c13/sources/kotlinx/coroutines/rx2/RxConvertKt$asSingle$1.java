package kotlinx.coroutines.rx2;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.GeckoHubImp1;
import o.access13800;
import o.access14100;
import o.findResAndMsg;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: /tmp/toss_alldex/classes13.dex */
final class RxConvertKt$asSingle$1<T> extends SuspendLambda implements Function2<findResAndMsg, access13800<? super T>, Object> {
    final /* synthetic */ GeckoHubImp1<T> $this_asSingle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RxConvertKt$asSingle$1(GeckoHubImp1<? extends T> geckoHubImp1, access13800<? super RxConvertKt$asSingle$1> access13800Var) {
        super(2, access13800Var);
        this.$this_asSingle = geckoHubImp1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new RxConvertKt$asSingle$1(this.$this_asSingle, access13800Var);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super T> access13800Var) {
        return ((RxConvertKt$asSingle$1) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return obj;
        }
        ResultKt.onNavigationEvent(obj);
        GeckoHubImp1<T> geckoHubImp1 = this.$this_asSingle;
        this.label = 1;
        Object objIAuthTabCallback = geckoHubImp1.IAuthTabCallback(this);
        return objIAuthTabCallback == objOnExtraCallback ? objOnExtraCallback : objIAuthTabCallback;
    }
}
