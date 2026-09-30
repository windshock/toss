package im.toss.features.credit.ui.legacy.detail.tips;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTipSchemeActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CreditTipSchemeActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = CreditTipSchemeActivity.onWarmupCompleted(this.f$0, (deserializeUriNullableCollection) obj);
        int i4 = onExtraCallbackWithResult + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
