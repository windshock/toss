package im.toss.features.home.ui.view.consumption;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionCardNoticeMinorSchemeActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = ConsumptionCardNoticeMinorSchemeActivity.onExtraCallbackWithResult((Throwable) obj);
        int i4 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
