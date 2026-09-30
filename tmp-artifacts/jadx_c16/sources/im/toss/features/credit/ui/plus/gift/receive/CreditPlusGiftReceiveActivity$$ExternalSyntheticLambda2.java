package im.toss.features.credit.ui.plus.gift.receive;

import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftReceiveActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditPlusGiftReceiveActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = CreditPlusGiftReceiveActivity.onExtraCallback(this.f$0, (TdsListHeaderV3View) obj);
        int i4 = onWarmupCompleted + 25;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
