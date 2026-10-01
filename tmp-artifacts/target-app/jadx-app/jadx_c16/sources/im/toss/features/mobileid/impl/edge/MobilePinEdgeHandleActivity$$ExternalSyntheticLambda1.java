package im.toss.features.mobileid.impl.edge;

import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.y1ExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobilePinEdgeHandleActivity$$ExternalSyntheticLambda1 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ MobilePinEdgeHandleActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) MobilePinEdgeHandleActivity.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this.f$0, (y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, -693001036, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), 693001036, RNSScreenManagerDelegate.onNavigationEvent());
        int i4 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
