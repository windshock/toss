package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setupPaints {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Integer IAuthTabCallback;
    private final getBacktraceNote<areCachedAdResourcesMissing, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;

    /* JADX WARN: Multi-variable type inference failed */
    public setupPaints(@Nullable Integer num, @NotNull getBacktraceNote<? super areCachedAdResourcesMissing, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        this.IAuthTabCallback = num;
        this.onExtraCallbackWithResult = getbacktracenote;
    }

    public final Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return num;
    }

    public final getBacktraceNote<areCachedAdResourcesMissing, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<areCachedAdResourcesMissing, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = this.onExtraCallbackWithResult;
        int i4 = i3 + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }
}
