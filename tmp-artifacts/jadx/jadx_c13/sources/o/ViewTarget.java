package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ViewTarget extends ILoader {
    private static final /* synthetic */ AtomicIntegerFieldUpdater onExtraCallback = AtomicIntegerFieldUpdater.newUpdater(ViewTarget.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public ViewTarget(@NotNull access13800<?> access13800Var, @Nullable Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + access13800Var + " was cancelled normally");
        }
        super(th, z);
    }

    public final boolean IAuthTabCallback() {
        return onExtraCallback.compareAndSet(this, 0, 1);
    }
}
