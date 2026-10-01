package kotlin.coroutines.jvm.internal;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.access13600;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RunSuspend implements access13800<Unit> {
    private Result<Unit> IAuthTabCallback;

    public CoroutineContext getContext() {
        return access13600.IAuthTabCallback;
    }

    public void resumeWith(@NotNull Object obj) {
        synchronized (this) {
            this.IAuthTabCallback = Result.IAuthTabCallback(obj);
            Intrinsics.checkNotNull(this, BuildConfig.FLAVOR);
            notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }
}
