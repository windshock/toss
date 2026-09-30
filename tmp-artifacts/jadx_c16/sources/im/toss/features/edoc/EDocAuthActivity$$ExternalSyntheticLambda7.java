package im.toss.features.edoc;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.removeAnimatorListener;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocAuthActivity$$ExternalSyntheticLambda7 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ EDocAuthActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            EDocAuthActivity.onExtraCallback(this.f$0, (removeAnimatorListener) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            throw null;
        }
        Unit unitOnExtraCallback = EDocAuthActivity.onExtraCallback(this.f$0, (removeAnimatorListener) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i3 = onNavigationEvent + 119;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 58 / 0;
        }
        return unitOnExtraCallback;
    }
}
