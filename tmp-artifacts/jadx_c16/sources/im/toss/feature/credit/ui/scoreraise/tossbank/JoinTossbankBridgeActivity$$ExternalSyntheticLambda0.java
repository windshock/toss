package im.toss.feature.credit.ui.scoreraise.tossbank;

import im.toss.features.credit.data.response.TossbankJoinBridgeResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class JoinTossbankBridgeActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ JoinTossbankBridgeActivity f$0;
    public final /* synthetic */ TossbankJoinBridgeResponse f$1;

    public /* synthetic */ JoinTossbankBridgeActivity$$ExternalSyntheticLambda0(JoinTossbankBridgeActivity joinTossbankBridgeActivity, TossbankJoinBridgeResponse tossbankJoinBridgeResponse) {
        this.f$0 = joinTossbankBridgeActivity;
        this.f$1 = tossbankJoinBridgeResponse;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = JoinTossbankBridgeActivity.onNavigationEvent(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = IAuthTabCallback + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
