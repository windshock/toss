package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.y1a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonTopErrorFinishActivity$$ExternalSyntheticLambda6 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ MobileIdCommonTopErrorFinishActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            MobileIdCommonTopErrorFinishActivity.onExtraCallback(this.f$0, (y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = MobileIdCommonTopErrorFinishActivity.onExtraCallback(this.f$0, (y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i3 = onExtraCallback + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
