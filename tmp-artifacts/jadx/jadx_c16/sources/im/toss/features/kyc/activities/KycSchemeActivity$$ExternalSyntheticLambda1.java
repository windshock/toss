package im.toss.features.kyc.activities;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setExtraJsT2MapStr;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycSchemeActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ KycSchemeActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            KycSchemeActivity.onExtraCallback(this.f$0, (setExtraJsT2MapStr) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = KycSchemeActivity.onExtraCallback(this.f$0, (setExtraJsT2MapStr) obj);
        int i3 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 10 / 0;
        }
        return unitOnExtraCallback;
    }
}
