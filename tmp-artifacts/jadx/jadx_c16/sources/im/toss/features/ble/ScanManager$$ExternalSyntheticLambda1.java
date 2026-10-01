package im.toss.features.ble;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.createJSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ScanManager$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ createJSONObject f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = createJSONObject.onWarmupCompleted(this.f$0);
        int i4 = onExtraCallbackWithResult + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
