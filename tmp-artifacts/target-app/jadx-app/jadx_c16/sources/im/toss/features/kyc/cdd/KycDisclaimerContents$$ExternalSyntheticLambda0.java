package im.toss.features.kyc.cdd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getExtendInfos;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycDisclaimerContents$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ getExtendInfos f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = getExtendInfos.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return unitOnNavigationEvent;
    }
}
