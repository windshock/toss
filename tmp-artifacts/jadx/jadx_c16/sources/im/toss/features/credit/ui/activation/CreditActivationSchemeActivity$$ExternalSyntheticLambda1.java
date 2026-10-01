package im.toss.features.credit.ui.activation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getLocalPathFromId;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditActivationSchemeActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditActivationSchemeActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ CreditActivationSchemeActivity$$ExternalSyntheticLambda1(CreditActivationSchemeActivity creditActivationSchemeActivity, String str) {
        this.f$0 = creditActivationSchemeActivity;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditActivationSchemeActivity creditActivationSchemeActivity = this.f$0;
        if (i3 != 0) {
            return CreditActivationSchemeActivity.onExtraCallback(creditActivationSchemeActivity, this.f$1, (getLocalPathFromId) obj);
        }
        Unit unitOnExtraCallback = CreditActivationSchemeActivity.onExtraCallback(creditActivationSchemeActivity, this.f$1, (getLocalPathFromId) obj);
        int i4 = 21 / 0;
        return unitOnExtraCallback;
    }
}
