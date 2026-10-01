package im.toss.feature.credit.ui.main.home.raise_edge_case;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPerfectScoreActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ CreditPerfectScoreActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditPerfectScoreActivity creditPerfectScoreActivity = this.f$0;
        View view = (View) obj;
        if (i3 == 0) {
            return CreditPerfectScoreActivity.onExtraCallback(creditPerfectScoreActivity, view);
        }
        CreditPerfectScoreActivity.onExtraCallback(creditPerfectScoreActivity, view);
        throw null;
    }
}
