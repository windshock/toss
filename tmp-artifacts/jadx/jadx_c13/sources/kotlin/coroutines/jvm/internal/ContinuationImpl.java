package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import o.access13700;
import o.access13800;
import o.access14500;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final CoroutineContext _context;
    private transient access13800<Object> onExtraCallback;

    public ContinuationImpl(@Nullable access13800<Object> access13800Var, @Nullable CoroutineContext coroutineContext) {
        super(access13800Var);
        this._context = coroutineContext;
    }

    public ContinuationImpl(@Nullable access13800<Object> access13800Var) {
        this(access13800Var, access13800Var != null ? access13800Var.getContext() : null);
    }

    @Override // o.access13800
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    public final access13800<Object> intercepted() {
        access13800<Object> access13800VarOnWarmupCompleted = this.onExtraCallback;
        if (access13800VarOnWarmupCompleted == null) {
            access13700 access13700Var = (access13700) getContext().get(access13700.onWarmupCompleted);
            if (access13700Var == null || (access13800VarOnWarmupCompleted = access13700Var.onWarmupCompleted(this)) == null) {
                access13800VarOnWarmupCompleted = this;
            }
            this.onExtraCallback = access13800VarOnWarmupCompleted;
        }
        return access13800VarOnWarmupCompleted;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        access13800<?> access13800Var = this.onExtraCallback;
        if (access13800Var != null && access13800Var != this) {
            CoroutineContext.Element element = getContext().get(access13700.onWarmupCompleted);
            Intrinsics.checkNotNull(element);
            ((access13700) element).onExtraCallback(access13800Var);
        }
        this.onExtraCallback = access14500.onNavigationEvent;
    }
}
