package kotlinx.coroutines.rx2;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.IAnimation;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.setRipple;
import o.writeBinary;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RxConvertKt$asObservable$1$job$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ writeBinary<T> $emitter;
    final /* synthetic */ IAnimation<T> $this_asObservable;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RxConvertKt$asObservable$1$job$1(IAnimation<? extends T> iAnimation, writeBinary<T> writebinary, access13800<? super RxConvertKt$asObservable$1$job$1> access13800Var) {
        super(2, access13800Var);
        this.$this_asObservable = iAnimation;
        this.$emitter = writebinary;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        RxConvertKt$asObservable$1$job$1 rxConvertKt$asObservable$1$job$1 = new RxConvertKt$asObservable$1$job$1(this.$this_asObservable, this.$emitter, access13800Var);
        rxConvertKt$asObservable$1$job$1.L$0 = obj;
        return rxConvertKt$asObservable$1$job$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        findResAndMsg findresandmsg;
        Throwable th;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i = this.label;
        if (i == 0) {
            ResultKt.onNavigationEvent(obj);
            findResAndMsg findresandmsg2 = (findResAndMsg) this.L$0;
            try {
                IAnimation<T> iAnimation = this.$this_asObservable;
                final writeBinary<T> writebinary = this.$emitter;
                setRipple setripple = new setRipple() { // from class: kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1.1
                    public final Object emit(T t, access13800<? super Unit> access13800Var) {
                        writebinary.IAuthTabCallback(t);
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = findresandmsg2;
                this.label = 1;
                if (iAnimation.collect(setripple, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                findresandmsg = findresandmsg2;
            } catch (Throwable th2) {
                findresandmsg = findresandmsg2;
                th = th2;
                if (th instanceof CancellationException) {
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            findresandmsg = (findResAndMsg) this.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof CancellationException) {
                    if (!this.$emitter.onNavigationEvent(th)) {
                        RxCancellableKt.onNavigationEvent(th, findresandmsg.getCoroutineContext());
                    }
                } else {
                    this.$emitter.onNavigationEvent();
                }
                return Unit.INSTANCE;
            }
        }
        this.$emitter.onNavigationEvent();
        return Unit.INSTANCE;
    }
}
