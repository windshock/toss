package im.toss.features.edoc.univ;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class UnivExternalWebActivity$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ UnivExternalWebActivity f$0;

    public final Object invoke() {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallback = UnivExternalWebActivity.onExtraCallback(this.f$0);
            int i3 = 71 / 0;
        } else {
            unitOnExtraCallback = UnivExternalWebActivity.onExtraCallback(this.f$0);
        }
        int i4 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
