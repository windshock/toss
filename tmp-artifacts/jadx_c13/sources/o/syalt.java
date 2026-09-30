package o;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface syalt<T> extends IAnimation<T> {
    IAnimation<T> onExtraCallback(@NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils);

    public static final class onNavigationEvent {
        public static /* synthetic */ IAnimation onWarmupCompleted(syalt syaltVar, CoroutineContext coroutineContext, int i, CloseableUtils closeableUtils, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i2 & 1) != 0) {
                coroutineContext = access13600.IAuthTabCallback;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                closeableUtils = CloseableUtils.SUSPEND;
            }
            return syaltVar.onExtraCallback(coroutineContext, i, closeableUtils);
        }
    }
}
