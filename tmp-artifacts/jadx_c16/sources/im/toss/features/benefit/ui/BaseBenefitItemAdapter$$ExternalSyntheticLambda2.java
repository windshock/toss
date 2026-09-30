package im.toss.features.benefit.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.BasicSystemInfoExtension;
import o.getNameByImsi;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseBenefitItemAdapter$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = getNameByImsi.IAuthTabCallback((BasicSystemInfoExtension) obj);
        int i4 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
