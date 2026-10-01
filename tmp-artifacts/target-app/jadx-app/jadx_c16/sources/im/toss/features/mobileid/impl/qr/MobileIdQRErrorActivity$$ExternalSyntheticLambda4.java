package im.toss.features.mobileid.impl.qr;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdQRErrorActivity$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ MobileIdQRErrorActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = MobileIdQRErrorActivity.onExtraCallbackWithResult(this.f$0);
        int i4 = onExtraCallback + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
