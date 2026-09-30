package im.toss.features.credit.ui.plus.gift.receive;

import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftReceiveActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ CreditPlusGiftReceiveActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = CreditPlusGiftReceiveActivity.onNavigationEvent(this.f$0, (TdsListHeaderV3View) obj);
        int i4 = IAuthTabCallback + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
