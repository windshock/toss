package im.toss.tds.compose.component.compound.tablerow;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.x4b;
import o.x5b;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    public static int onExtraCallbackWithResult;
    public static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        x5b x5bVar = (x5b) obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (i3 != 0) {
            x4b.onExtraCallback(x5bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = x4b.onExtraCallback(x5bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onExtraCallback + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static int IAuthTabCallback() {
        int i = onNavigationEvent;
        int i2 = i % 5891648;
        onNavigationEvent = i + 1;
        if (i2 != 0) {
            return onExtraCallbackWithResult;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        onExtraCallbackWithResult = i3;
        return i3;
    }
}
