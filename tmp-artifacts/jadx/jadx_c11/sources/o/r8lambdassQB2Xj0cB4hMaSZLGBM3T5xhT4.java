package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdawm4poh0toUcK03Yte94uAzTj6Xc;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4<S extends r8lambdawm4poh0toUcK03Yte94uAzTj6Xc> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final getBacktraceNote<S, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback;
    private final int onExtraCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4(int i, @NotNull getBacktraceNote<? super S, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        this.onExtraCallback = i;
        this.IAuthTabCallback = getbacktracenote;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.onExtraCallback;
        int i5 = i3 + 75;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final getBacktraceNote<S, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<S, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = this.IAuthTabCallback;
        int i5 = i2 + 61;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return getbacktracenote;
    }
}
