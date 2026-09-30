package im.toss.features.mobileid.impl.qr;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdQRActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ MobileIdQRActivity f$1;

    public /* synthetic */ MobileIdQRActivity$$ExternalSyntheticLambda7(Function0 function0, MobileIdQRActivity mobileIdQRActivity) {
        this.f$0 = function0;
        this.f$1 = mobileIdQRActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = MobileIdQRActivity.onWarmupCompleted(this.f$0, this.f$1, (Boolean) obj);
        int i4 = onExtraCallbackWithResult + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
