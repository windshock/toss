package im.toss.features.credit.ui.plus.intro;

import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusIntroActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CreditPlusIntroActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusIntroActivity creditPlusIntroActivity = this.f$0;
        TdsListHeaderV3View tdsListHeaderV3View = (TdsListHeaderV3View) obj;
        if (i3 == 0) {
            return CreditPlusIntroActivity.IAuthTabCallback(creditPlusIntroActivity, tdsListHeaderV3View);
        }
        Unit unitIAuthTabCallback = CreditPlusIntroActivity.IAuthTabCallback(creditPlusIntroActivity, tdsListHeaderV3View);
        int i4 = 45 / 0;
        return unitIAuthTabCallback;
    }
}
