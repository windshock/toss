package im.toss.feature.credit.ui.main.home.raise_edge_case;

import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditScoreRaiseCoolTimeActivity$$ExternalSyntheticLambda5 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditScoreRaiseCoolTimeActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0};
        Unit unit = (Unit) CreditScoreRaiseCoolTimeActivity.onExtraCallback(-781787842, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 781787845, objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted());
        int i4 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
