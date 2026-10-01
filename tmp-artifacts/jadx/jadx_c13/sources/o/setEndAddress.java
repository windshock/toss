package o;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setEndAddress<T, R> extends setLoadBias<T, R> implements access13800<R> {
    private getBacktraceNote<? super setLoadBias<?, ?>, Object, ? super access13800<Object>, ? extends Object> IAuthTabCallback;
    private access13800<Object> onExtraCallback;
    private Object onExtraCallbackWithResult;
    private Object onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public setEndAddress(@NotNull getBacktraceNote<? super setLoadBias<T, R>, ? super T, ? super access13800<? super R>, ? extends Object> getbacktracenote, T t) {
        super(null);
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        this.IAuthTabCallback = getbacktracenote;
        this.onExtraCallbackWithResult = t;
        Intrinsics.checkNotNull(this, "");
        this.onExtraCallback = this;
        this.onNavigationEvent = clearExecute.IAuthTabCallback;
    }

    @Override // o.access13800
    public CoroutineContext getContext() {
        return access13600.IAuthTabCallback;
    }

    @Override // o.access13800
    public void resumeWith(@NotNull Object obj) {
        this.onExtraCallback = null;
        this.onNavigationEvent = obj;
    }

    @Override // o.setLoadBias
    public Object IAuthTabCallback(T t, @NotNull access13800<? super R> access13800Var) {
        Intrinsics.checkNotNull(access13800Var, "");
        this.onExtraCallback = access13800Var;
        this.onExtraCallbackWithResult = t;
        Object objOnExtraCallback = access14100.onExtraCallback();
        if (objOnExtraCallback == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objOnExtraCallback;
    }

    public final R onExtraCallback() {
        while (true) {
            R r = (R) this.onNavigationEvent;
            access13800<Object> access13800Var = this.onExtraCallback;
            if (access13800Var != null) {
                if (!Result.onExtraCallbackWithResult(clearExecute.IAuthTabCallback, r)) {
                    this.onNavigationEvent = clearExecute.IAuthTabCallback;
                    access13800Var.resumeWith(r);
                } else {
                    try {
                        getBacktraceNote<? super setLoadBias<?, ?>, Object, ? super access13800<Object>, ? extends Object> getbacktracenote = this.IAuthTabCallback;
                        Object obj = this.onExtraCallbackWithResult;
                        Object objOnExtraCallbackWithResult = !(getbacktracenote instanceof BaseContinuationImpl) ? access14200.onExtraCallbackWithResult(getbacktracenote, this, obj, access13800Var) : ((getBacktraceNote) TypeIntrinsics.beforeCheckcastToFunctionOfArity(getbacktracenote, 3)).invoke(this, obj, access13800Var);
                        if (objOnExtraCallbackWithResult != access14100.onExtraCallback()) {
                            Result.Companion companion = Result.Companion;
                            access13800Var.resumeWith(Result.m31constructorimpl(objOnExtraCallbackWithResult));
                        }
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        access13800Var.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(th)));
                    }
                }
            } else {
                ResultKt.onNavigationEvent(r);
                return r;
            }
        }
    }
}
