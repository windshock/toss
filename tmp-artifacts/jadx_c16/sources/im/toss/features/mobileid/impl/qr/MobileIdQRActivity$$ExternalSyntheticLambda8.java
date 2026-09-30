package im.toss.features.mobileid.impl.qr;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdQRActivity$$ExternalSyntheticLambda8 implements deserializeFloat {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        MobileIdQRActivity.onWarmupCompleted(this.f$0, obj);
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
    }
}
