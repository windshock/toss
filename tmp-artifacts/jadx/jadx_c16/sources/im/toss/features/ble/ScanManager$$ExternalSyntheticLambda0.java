package im.toss.features.ble;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.WorkerParameters;
import o.createJSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ScanManager$$ExternalSyntheticLambda0 implements Function0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ createJSONObject f$0;
    public final /* synthetic */ WorkerParameters f$1;

    public /* synthetic */ ScanManager$$ExternalSyntheticLambda0(createJSONObject createjsonobject, WorkerParameters workerParameters) {
        this.f$0 = createjsonobject;
        this.f$1 = workerParameters;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = createJSONObject.onExtraCallbackWithResult(this.f$0, this.f$1);
        int i4 = onNavigationEvent + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
