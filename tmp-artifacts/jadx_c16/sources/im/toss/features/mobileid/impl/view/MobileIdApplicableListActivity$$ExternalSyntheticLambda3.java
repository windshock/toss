package im.toss.features.mobileid.impl.view;

import androidx.compose.foundation.layout.RowScope;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdApplicableListActivity$$ExternalSyntheticLambda3 implements getBacktraceNote {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ MobileIdApplicableListActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnNavigationEvent = MobileIdApplicableListActivity.onNavigationEvent(this.f$0, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i3 = 98 / 0;
        } else {
            unitOnNavigationEvent = MobileIdApplicableListActivity.onNavigationEvent(this.f$0, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        int i4 = onWarmupCompleted + 41;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
