package im.toss.features.benefit.ui;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.getNameByOperatorName;
import o.watchShake;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda31 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = getNameByOperatorName.onExtraCallback(this.f$0, (Context) obj, (watchShake) obj2);
        int i4 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return unitOnExtraCallback;
    }
}
