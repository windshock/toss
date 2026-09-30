package im.toss.features.alltab.feature.total_service.feature.recent_service;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RecentServiceActivity$$ExternalSyntheticLambda19 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ RecentServiceActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RecentServiceActivity recentServiceActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        if (i3 == 0) {
            return RecentServiceActivity.onNavigationEvent(recentServiceActivity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        }
        RecentServiceActivity.onNavigationEvent(recentServiceActivity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        throw null;
    }
}
