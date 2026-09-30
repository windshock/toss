package im.toss.features.edoc;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocIssuableListActivity$$ExternalSyntheticLambda9 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ EDocIssuableListActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ EDocIssuableListActivity$$ExternalSyntheticLambda9(EDocIssuableListActivity eDocIssuableListActivity, int i) {
        this.f$0 = eDocIssuableListActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        EDocIssuableListActivity eDocIssuableListActivity = this.f$0;
        if (i3 != 0) {
            return EDocIssuableListActivity.onExtraCallback(eDocIssuableListActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        EDocIssuableListActivity.onExtraCallback(eDocIssuableListActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        throw null;
    }
}
