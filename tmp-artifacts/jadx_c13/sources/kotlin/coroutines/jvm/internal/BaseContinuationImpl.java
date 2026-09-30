package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.access13800;
import o.access14100;
import o.access14600;
import o.access14700;
import o.access14900;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class BaseContinuationImpl implements access13800<Object>, access14900, Serializable {
    private final access13800<Object> completion;

    protected abstract Object invokeSuspend(@NotNull Object obj);

    protected void releaseIntercepted() {
    }

    public BaseContinuationImpl(@Nullable access13800<Object> access13800Var) {
        this.completion = access13800Var;
    }

    public final access13800<Object> getCompletion() {
        return this.completion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.access13800
    public final void resumeWith(@NotNull Object obj) {
        Object objInvokeSuspend;
        access13800 access13800Var = this;
        while (true) {
            access14600.onExtraCallbackWithResult(access13800Var);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) access13800Var;
            access13800 access13800Var2 = baseContinuationImpl.completion;
            Intrinsics.checkNotNull(access13800Var2);
            try {
                objInvokeSuspend = baseContinuationImpl.invokeSuspend(obj);
            } catch (Throwable th) {
                Result.Companion companion = Result.Companion;
                obj = Result.m31constructorimpl(ResultKt.createFailure(th));
            }
            if (objInvokeSuspend == access14100.onExtraCallback()) {
                return;
            }
            Result.Companion companion2 = Result.Companion;
            obj = Result.m31constructorimpl(objInvokeSuspend);
            baseContinuationImpl.releaseIntercepted();
            if (!(access13800Var2 instanceof BaseContinuationImpl)) {
                access13800Var2.resumeWith(obj);
                return;
            }
            access13800Var = access13800Var2;
        }
    }

    public access13800<Unit> create(@NotNull access13800<?> access13800Var) {
        Intrinsics.checkNotNullParameter(access13800Var, "");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
        Intrinsics.checkNotNullParameter(access13800Var, "");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @Override // o.access14900
    public access14900 getCallerFrame() {
        access13800<Object> access13800Var = this.completion;
        if (access13800Var instanceof access14900) {
            return (access14900) access13800Var;
        }
        return null;
    }

    @Override // o.access14900
    public StackTraceElement getStackTraceElement() {
        return access14700.onExtraCallbackWithResult(this);
    }
}
