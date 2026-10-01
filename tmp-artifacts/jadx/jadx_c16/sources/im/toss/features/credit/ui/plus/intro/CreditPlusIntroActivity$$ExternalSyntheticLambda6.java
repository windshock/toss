package im.toss.features.credit.ui.plus.intro;

import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusIntroActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditPlusIntroActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            CreditPlusIntroActivity.onExtraCallbackWithResult(this.f$0, (TdsListHeaderV3View) obj);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = CreditPlusIntroActivity.onExtraCallbackWithResult(this.f$0, (TdsListHeaderV3View) obj);
        int i3 = onWarmupCompleted + 79;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
