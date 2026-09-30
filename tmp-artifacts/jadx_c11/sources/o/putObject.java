package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class putObject implements putJSONObjectIfValid {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;

    /* JADX WARN: Illegal instructions before constructor call */
    public putObject() {
        Function2 function2 = null;
        this(function2, 1, function2);
    }

    public putObject(@Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2) {
        this.onExtraCallback = function2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ putObject(Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 21;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 103;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 5;
            } else {
                int i7 = 2 % 2;
            }
            function2 = null;
        }
        this(function2);
    }

    @Override // o.putJSONObjectIfValid
    public Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = this.onExtraCallback;
        int i5 = i2 + 21;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return function2;
    }
}
