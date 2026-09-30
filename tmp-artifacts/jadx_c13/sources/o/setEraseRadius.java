package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setEraseRadius<T> implements setRipple<T> {
    private final Function2<setRipple<? super T>, access13800<? super Unit>, Object> onExtraCallback;
    private final setRipple<T> onWarmupCompleted;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ setEraseRadius<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(setEraseRadius<T> seteraseradius, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
            this.this$0 = seteraseradius;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onNavigationEvent(this);
        }
    }

    @Override // o.setRipple
    public Object emit(T t, @NotNull access13800<? super Unit> access13800Var) {
        return this.onWarmupCompleted.emit(t, access13800Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setEraseRadius(@NotNull setRipple<? super T> setripple, @NotNull Function2<? super setRipple<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        this.onWarmupCompleted = setripple;
        this.onExtraCallback = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (((o.setEraseRadius) r7).onNavigationEvent(r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        djzb djzbVar;
        setEraseRadius<T> seteraseradius;
        setRipple<T> setripple;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i = onextracallbackwithresult.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(this, access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onextracallbackwithresult.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            djzb djzbVar2 = new djzb(this.onWarmupCompleted, onextracallbackwithresult.getContext());
            try {
                Function2<setRipple<? super T>, access13800<? super Unit>, Object> function2 = this.onExtraCallback;
                onextracallbackwithresult.L$0 = this;
                onextracallbackwithresult.L$1 = djzbVar2;
                onextracallbackwithresult.label = 1;
                if (function2.invoke(djzbVar2, onextracallbackwithresult) != objOnExtraCallback) {
                    seteraseradius = this;
                    djzbVar = djzbVar2;
                    djzbVar.releaseIntercepted();
                    setripple = seteraseradius.onWarmupCompleted;
                    if (setripple instanceof setEraseRadius) {
                    }
                }
                return objOnExtraCallback;
            } catch (Throwable th) {
                th = th;
                djzbVar = djzbVar2;
                djzbVar.releaseIntercepted();
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return Unit.INSTANCE;
        }
        djzbVar = (djzb) onextracallbackwithresult.L$1;
        seteraseradius = (setEraseRadius) onextracallbackwithresult.L$0;
        try {
            ResultKt.onNavigationEvent(obj);
            djzbVar.releaseIntercepted();
            setripple = seteraseradius.onWarmupCompleted;
            if (setripple instanceof setEraseRadius) {
                return Unit.INSTANCE;
            }
            onextracallbackwithresult.L$0 = null;
            onextracallbackwithresult.L$1 = null;
            onextracallbackwithresult.label = 2;
        } catch (Throwable th2) {
            th = th2;
            djzbVar.releaseIntercepted();
            throw th;
        }
    }
}
