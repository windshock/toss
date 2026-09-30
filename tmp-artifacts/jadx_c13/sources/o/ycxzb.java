package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ycxzb {
    private final UpdatePackageStrategy<Object>[] IAuthTabCallback;
    private final Object[] onExtraCallback;
    private int onNavigationEvent;
    public final CoroutineContext onWarmupCompleted;

    public ycxzb(@NotNull CoroutineContext coroutineContext, int i) {
        this.onWarmupCompleted = coroutineContext;
        this.onExtraCallback = new Object[i];
        this.IAuthTabCallback = new UpdatePackageStrategy[i];
    }

    public final void IAuthTabCallback(@NotNull UpdatePackageStrategy<?> updatePackageStrategy, @Nullable Object obj) {
        Object[] objArr = this.onExtraCallback;
        int i = this.onNavigationEvent;
        objArr[i] = obj;
        UpdatePackageStrategy<Object>[] updatePackageStrategyArr = this.IAuthTabCallback;
        this.onNavigationEvent = i + 1;
        Intrinsics.checkNotNull(updatePackageStrategy, "");
        updatePackageStrategyArr[i] = updatePackageStrategy;
    }

    public final void onWarmupCompleted(@NotNull CoroutineContext coroutineContext) {
        int length = this.IAuthTabCallback.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            UpdatePackageStrategy<Object> updatePackageStrategy = this.IAuthTabCallback[length];
            Intrinsics.checkNotNull(updatePackageStrategy);
            updatePackageStrategy.onExtraCallbackWithResult(coroutineContext, this.onExtraCallback[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
