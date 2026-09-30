package im.toss.features.credit.ui.legacy.detail.tips;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTipSchemeActivity$$ExternalSyntheticLambda1 implements deserializeFloat {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            CreditTipSchemeActivity.onWarmupCompleted(this.f$0, obj);
            int i3 = 27 / 0;
        } else {
            CreditTipSchemeActivity.onWarmupCompleted(this.f$0, obj);
        }
        int i4 = onExtraCallbackWithResult + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
    }
}
