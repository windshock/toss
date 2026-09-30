package im.toss.features.benefit.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.BasicSystemInfoExtension;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda23 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = getNameByOperatorName.onExtraCallback((BasicSystemInfoExtension) obj);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        int i5 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }
}
