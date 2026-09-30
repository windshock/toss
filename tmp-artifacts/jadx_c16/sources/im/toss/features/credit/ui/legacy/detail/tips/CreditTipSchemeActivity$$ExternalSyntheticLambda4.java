package im.toss.features.credit.ui.legacy.detail.tips;

import im.toss.features.credit.data.legacy.detail.CreditTipV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTipSchemeActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditTipSchemeActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = CreditTipSchemeActivity.onExtraCallback(this.f$0, (CreditTipV2) obj);
        int i4 = onWarmupCompleted + 1;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
