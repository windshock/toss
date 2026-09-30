package im.toss.features.alltab.feature.total_service.feature.recent_service;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RecentServiceActivity$$ExternalSyntheticLambda11 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ RecentServiceActivity f$0;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ RecentServiceActivity$$ExternalSyntheticLambda11(RecentServiceActivity recentServiceActivity, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2) {
        this.f$0 = recentServiceActivity;
        this.f$1 = quirksExternalSyntheticBackport0;
        this.f$2 = i;
        this.f$3 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return RecentServiceActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        Unit unitIAuthTabCallback = RecentServiceActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = 22 / 0;
        return unitIAuthTabCallback;
    }
}
