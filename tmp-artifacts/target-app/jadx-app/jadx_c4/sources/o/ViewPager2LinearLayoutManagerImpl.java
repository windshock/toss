package o;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ViewPager2LinearLayoutManagerImpl {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final Map<String, getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> onWarmupCompleted;

    public final getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = this.onWarmupCompleted.get(str);
        int i4 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return getbacktracenote;
        }
        throw null;
    }
}
