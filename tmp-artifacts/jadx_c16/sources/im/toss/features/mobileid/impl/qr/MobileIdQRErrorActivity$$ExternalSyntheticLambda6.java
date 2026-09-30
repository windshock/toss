package im.toss.features.mobileid.impl.qr;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdQRErrorActivity$$ExternalSyntheticLambda6 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ MobileIdQRErrorActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = MobileIdQRErrorActivity.onWarmupCompleted(this.f$0);
        int i4 = onExtraCallback + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
