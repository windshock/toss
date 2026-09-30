package im.toss.feature.credit.ui.main.home.raise_edge_case;

import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPerfectScoreActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditPerfectScoreActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (TdsTopV2View) obj};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) CreditPerfectScoreActivity.onExtraCallbackWithResult(-83872408, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 83872410, iOnWarmupCompleted, objArr);
        int i4 = onExtraCallback + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
