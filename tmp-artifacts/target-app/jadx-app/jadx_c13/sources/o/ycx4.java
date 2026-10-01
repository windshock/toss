package o;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ycx4<T> extends RequestCoordinator<T> implements access14900 {
    public final access13800<T> IAuthTabCallback;

    @Override // o.access14900
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // o.setFullPackage
    public final boolean onExtraCallbackWithResult() {
        return true;
    }

    public void onTransact() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ycx4(@NotNull CoroutineContext coroutineContext, @NotNull access13800<? super T> access13800Var) {
        super(coroutineContext, true, true);
        this.IAuthTabCallback = access13800Var;
    }

    @Override // o.access14900
    public final access14900 getCallerFrame() {
        access13800<T> access13800Var = this.IAuthTabCallback;
        if (access13800Var instanceof access14900) {
            return (access14900) access13800Var;
        }
        return null;
    }

    @Override // o.setFullPackage
    public void b_(@Nullable Object obj) {
        setMaxLine.onNavigationEvent(access14200.onExtraCallbackWithResult(this.IAuthTabCallback), InterceptorModel.onExtraCallbackWithResult(obj, this.IAuthTabCallback));
    }

    @Override // o.RequestCoordinator
    public void onNavigationEvent(@Nullable Object obj) {
        access13800<T> access13800Var = this.IAuthTabCallback;
        access13800Var.resumeWith(InterceptorModel.onExtraCallbackWithResult(obj, access13800Var));
    }
}
