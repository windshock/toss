package kotlinx.coroutines.rx2;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14100;
import o.av;
import o.bigDecimalOrDouble;
import o.deserializeUriNullableCollection;
import o.jw;
import o.lt;
import o.ok;
import o.serializeRaw;
import o.setSupportImageTintList;
import o.writeQuoted;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: /tmp/toss_alldex/classes13.dex */
final class RxConvertKt$asFlow$1<T> extends SuspendLambda implements Function2<ok<? super T>, access13800<? super Unit>, Object> {
    final /* synthetic */ serializeRaw<T> $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RxConvertKt$asFlow$1(serializeRaw<T> serializeraw, access13800<? super RxConvertKt$asFlow$1> access13800Var) {
        super(2, access13800Var);
        this.$this_asFlow = serializeraw;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ok<? super T> okVar, access13800<? super Unit> access13800Var) {
        return ((RxConvertKt$asFlow$1) create(okVar, access13800Var)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        RxConvertKt$asFlow$1 rxConvertKt$asFlow$1 = new RxConvertKt$asFlow$1(this.$this_asFlow, access13800Var);
        rxConvertKt$asFlow$1.L$0 = obj;
        return rxConvertKt$asFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i = this.label;
        if (i == 0) {
            ResultKt.onNavigationEvent(obj);
            final ok okVar = (ok) this.L$0;
            final AtomicReference atomicReference = new AtomicReference();
            this.$this_asFlow.subscribe(new writeQuoted<T>() { // from class: kotlinx.coroutines.rx2.RxConvertKt$asFlow$1$observer$1
                @Override // o.writeQuoted
                public void onExtraCallback() {
                    lt.onWarmupCompleted.onExtraCallbackWithResult(okVar, null, 1, null);
                }

                @Override // o.writeQuoted
                public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
                    if (setSupportImageTintList.onNavigationEvent(atomicReference, (Object) null, deserializeurinullablecollection)) {
                        return;
                    }
                    deserializeurinullablecollection.dispose();
                }

                @Override // o.writeQuoted
                public void onExtraCallback(T t) {
                    try {
                        av.onExtraCallbackWithResult(okVar, t);
                    } catch (InterruptedException unused) {
                    }
                }

                @Override // o.writeQuoted
                public void onExtraCallbackWithResult(Throwable th) {
                    okVar.onExtraCallback(th);
                }
            });
            Function0 function0 = new Function0() { // from class: kotlinx.coroutines.rx2.RxConvertKt$asFlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RxConvertKt$asFlow$1.onExtraCallback(atomicReference);
                }
            };
            this.label = 1;
            if (jw.onWarmupCompleted(okVar, function0, this) == objOnExtraCallback) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(AtomicReference atomicReference) {
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) atomicReference.getAndSet(bigDecimalOrDouble.onExtraCallback());
        if (deserializeurinullablecollection != null) {
            deserializeurinullablecollection.dispose();
        }
        return Unit.INSTANCE;
    }
}
