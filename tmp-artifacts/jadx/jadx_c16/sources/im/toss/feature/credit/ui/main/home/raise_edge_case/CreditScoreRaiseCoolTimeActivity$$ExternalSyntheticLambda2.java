package im.toss.feature.credit.ui.main.home.raise_edge_case;

import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.isColdStartup;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditScoreRaiseCoolTimeActivity$$ExternalSyntheticLambda2 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ isColdStartup f$0;
    public final /* synthetic */ CreditScoreRaiseCoolTimeActivity f$1;

    public /* synthetic */ CreditScoreRaiseCoolTimeActivity$$ExternalSyntheticLambda2(isColdStartup iscoldstartup, CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity) {
        this.f$0 = iscoldstartup;
        this.f$1 = creditScoreRaiseCoolTimeActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1};
        Unit unit = (Unit) CreditScoreRaiseCoolTimeActivity.onExtraCallback(1381443731, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1381443730, objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted());
        int i4 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
