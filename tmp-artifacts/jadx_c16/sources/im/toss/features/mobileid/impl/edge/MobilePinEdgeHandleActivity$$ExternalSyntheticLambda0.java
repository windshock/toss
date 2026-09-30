package im.toss.features.mobileid.impl.edge;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobilePinEdgeHandleActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ MobilePinEdgeHandleActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        MobilePinEdgeHandleActivity mobilePinEdgeHandleActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        if (i3 != 0) {
            return MobilePinEdgeHandleActivity.onNavigationEvent(mobilePinEdgeHandleActivity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        }
        MobilePinEdgeHandleActivity.onNavigationEvent(mobilePinEdgeHandleActivity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        throw null;
    }
}
