package im.toss.feature.credit.ui.scoreraise.tossbank;

import im.toss.features.credit.data.response.TossbankJoinBridgeResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class JoinTossbankBridgeActivity$$ExternalSyntheticLambda2 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ JoinTossbankBridgeActivity f$0;
    public final /* synthetic */ TossbankJoinBridgeResponse f$1;

    public /* synthetic */ JoinTossbankBridgeActivity$$ExternalSyntheticLambda2(JoinTossbankBridgeActivity joinTossbankBridgeActivity, TossbankJoinBridgeResponse tossbankJoinBridgeResponse) {
        this.f$0 = joinTossbankBridgeActivity;
        this.f$1 = tossbankJoinBridgeResponse;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = JoinTossbankBridgeActivity.onNavigationEvent(this.f$0, this.f$1);
        int i4 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
