package im.toss.features.edoc;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocIssueCandidatesActivity$$ExternalSyntheticLambda5 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ EDocIssueCandidatesActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ EDocIssueCandidatesActivity$$ExternalSyntheticLambda5(EDocIssueCandidatesActivity eDocIssueCandidatesActivity, int i) {
        this.f$0 = eDocIssueCandidatesActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        EDocIssueCandidatesActivity eDocIssueCandidatesActivity = this.f$0;
        if (i3 == 0) {
            return EDocIssueCandidatesActivity.onNavigationEvent(eDocIssueCandidatesActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        Unit unitOnNavigationEvent = EDocIssueCandidatesActivity.onNavigationEvent(eDocIssueCandidatesActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = 48 / 0;
        return unitOnNavigationEvent;
    }
}
