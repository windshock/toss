package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface finishVideo {
    static /* synthetic */ void onExtraCallbackWithResult(finishVideo finishvideo, Integer num, getBacktraceNote getbacktracenote, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ordered");
        }
        if ((i & 1) != 0) {
            num = null;
        }
        finishvideo.onNavigationEvent(num, getbacktracenote);
    }

    default void onNavigationEvent(@Nullable Integer num, @NotNull getBacktraceNote<? super areCachedAdResourcesMissing, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        throw new IllegalStateException("");
    }
}
