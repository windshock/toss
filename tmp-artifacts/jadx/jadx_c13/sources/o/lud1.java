package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import o.syalt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class lud1 {
    public static /* synthetic */ IAnimation onExtraCallbackWithResult(IAnimation iAnimation, int i, CloseableUtils closeableUtils, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            closeableUtils = CloseableUtils.SUSPEND;
        }
        return ycxycx.IAuthTabCallback(iAnimation, i, closeableUtils);
    }

    public static final <T> IAnimation<T> onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, int i, @NotNull CloseableUtils closeableUtils) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
        }
        if (i == -1 && closeableUtils != CloseableUtils.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == -1) {
            closeableUtils = CloseableUtils.DROP_OLDEST;
            i = 0;
        }
        int i2 = i;
        CloseableUtils closeableUtils2 = closeableUtils;
        return iAnimation instanceof syalt ? syalt.onNavigationEvent.onWarmupCompleted((syalt) iAnimation, null, i2, closeableUtils2, 1, null) : new setScroller(iAnimation, null, i2, closeableUtils2, 2, null);
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation) {
        return onExtraCallbackWithResult(iAnimation, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull CoroutineContext coroutineContext) {
        IAuthTabCallback(coroutineContext);
        return Intrinsics.areEqual(coroutineContext, access13600.IAuthTabCallback) ? iAnimation : iAnimation instanceof syalt ? syalt.onNavigationEvent.onWarmupCompleted((syalt) iAnimation, coroutineContext, 0, null, 6, null) : new setScroller(iAnimation, coroutineContext, 0, null, 12, null);
    }

    private static final void IAuthTabCallback(CoroutineContext coroutineContext) {
        if (coroutineContext.get(getPackageType.onNavigationEvent) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }
}
