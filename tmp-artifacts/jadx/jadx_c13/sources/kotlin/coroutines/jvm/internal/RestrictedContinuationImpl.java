package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;
import o.access13600;
import o.access13800;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(@Nullable access13800<Object> access13800Var) {
        super(access13800Var);
        if (access13800Var != null && access13800Var.getContext() != access13600.IAuthTabCallback) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // o.access13800
    public CoroutineContext getContext() {
        return access13600.IAuthTabCallback;
    }
}
