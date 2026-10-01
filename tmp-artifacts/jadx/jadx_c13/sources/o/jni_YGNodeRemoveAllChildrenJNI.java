package o;

import java.util.concurrent.TimeUnit;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeRemoveAllChildrenJNI {
    public static final String onWarmupCompleted = djExternalSyntheticApiModelOutline2.onWarmupCompleted("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    public static final long onNavigationEvent = djExternalSyntheticApiModelOutline3.onExtraCallback("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);
    public static final int onExtraCallbackWithResult = djExternalSyntheticApiModelOutline3.onExtraCallbackWithResult("kotlinx.coroutines.scheduler.core.pool.size", RangesKt___RangesKt.coerceAtLeast(djExternalSyntheticApiModelOutline2.onExtraCallback(), 2), 1, 0, 8, null);
    public static final int IAuthTabCallback = djExternalSyntheticApiModelOutline3.onExtraCallbackWithResult("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
    public static final long onExtraCallback = TimeUnit.SECONDS.toNanos(djExternalSyntheticApiModelOutline3.onExtraCallback("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));
    public static jni_YGNodeNewJNI onTransact = jni_YGNodeMarkDirtyJNI.IAuthTabCallback;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String IAuthTabCallback(boolean z) {
        return z ? "Blocking" : "Non-blocking";
    }

    public static final jni_YGNodeIsDirtyJNI onExtraCallbackWithResult(@NotNull Runnable runnable, long j, boolean z) {
        return new jni_YGNodeNewWithConfigJNI(runnable, j, z);
    }
}
