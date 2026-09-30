package o;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getAlignContent<T> implements access13800<T>, access14900 {
    private final CoroutineContext IAuthTabCallback;
    private final access13800<T> onExtraCallbackWithResult;

    @Override // o.access14900
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getAlignContent(@NotNull access13800<? super T> access13800Var, @NotNull CoroutineContext coroutineContext) {
        this.onExtraCallbackWithResult = access13800Var;
        this.IAuthTabCallback = coroutineContext;
    }

    @Override // o.access13800
    public CoroutineContext getContext() {
        return this.IAuthTabCallback;
    }

    @Override // o.access14900
    public access14900 getCallerFrame() {
        access13800<T> access13800Var = this.onExtraCallbackWithResult;
        if (access13800Var instanceof access14900) {
            return (access14900) access13800Var;
        }
        return null;
    }

    @Override // o.access13800
    public void resumeWith(@NotNull Object obj) {
        this.onExtraCallbackWithResult.resumeWith(obj);
    }
}
