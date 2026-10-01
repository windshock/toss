package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class aeu<T> implements rmf<T> {

    static final class onNavigationEvent extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ aeu<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(aeu<T> aeuVar, access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
            this.this$0 = aeuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    public abstract Object onWarmupCompleted(@NotNull setRipple<? super T> setripple, @NotNull access13800<? super Unit> access13800Var);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.IAnimation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(@NotNull setRipple<? super T> setripple, @NotNull access13800<? super Unit> access13800Var) throws Throwable {
        onNavigationEvent onnavigationevent;
        Throwable th;
        djzb djzbVar;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i = onnavigationevent.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(this, access13800Var);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onnavigationevent.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            djzbVar = (djzb) onnavigationevent.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
                djzbVar.releaseIntercepted();
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                djzbVar.releaseIntercepted();
                throw th;
            }
        }
        ResultKt.onNavigationEvent(obj);
        djzb djzbVar2 = new djzb(setripple, onnavigationevent.getContext());
        try {
            onnavigationevent.L$0 = djzbVar2;
            onnavigationevent.label = 1;
            if (onWarmupCompleted(djzbVar2, onnavigationevent) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
            djzbVar = djzbVar2;
            djzbVar.releaseIntercepted();
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            djzbVar = djzbVar2;
            djzbVar.releaseIntercepted();
            throw th;
        }
    }
}
