package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CheckRequestBodyModel<T> extends ycx4<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater onExtraCallback = AtomicIntegerFieldUpdater.newUpdater(CheckRequestBodyModel.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public CheckRequestBodyModel(@NotNull CoroutineContext coroutineContext, @NotNull access13800<? super T> access13800Var) {
        super(coroutineContext, access13800Var);
    }

    private final boolean ICustomTabsCallbackStubProxy() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = onExtraCallback;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!onExtraCallback.compareAndSet(this, 0, 1));
        return true;
    }

    private final boolean onPostMessage() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = onExtraCallback;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!onExtraCallback.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // o.ycx4, o.setFullPackage
    public void b_(@Nullable Object obj) {
        onNavigationEvent(obj);
    }

    @Override // o.ycx4, o.RequestCoordinator
    public void onNavigationEvent(@Nullable Object obj) {
        if (onPostMessage()) {
            return;
        }
        setMaxLine.onNavigationEvent(access14200.onExtraCallbackWithResult(this.IAuthTabCallback), InterceptorModel.onExtraCallbackWithResult(obj, this.IAuthTabCallback));
    }

    public final Object IAuthTabCallback() {
        if (ICustomTabsCallbackStubProxy()) {
            return access14100.onExtraCallback();
        }
        Object objIAuthTabCallback = setChannelIndex.IAuthTabCallback(cq_());
        if (objIAuthTabCallback instanceof ILoader) {
            throw ((ILoader) objIAuthTabCallback).IAuthTabCallback;
        }
        return objIAuthTabCallback;
    }
}
