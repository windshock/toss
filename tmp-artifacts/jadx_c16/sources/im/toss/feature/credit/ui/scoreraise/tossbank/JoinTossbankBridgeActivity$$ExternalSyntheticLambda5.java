package im.toss.feature.credit.ui.scoreraise.tossbank;

import im.toss.features.credit.data.response.TossbankJoinBridgeResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class JoinTossbankBridgeActivity$$ExternalSyntheticLambda5 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ JoinTossbankBridgeActivity f$0;
    public final /* synthetic */ TossbankJoinBridgeResponse f$1;

    public /* synthetic */ JoinTossbankBridgeActivity$$ExternalSyntheticLambda5(JoinTossbankBridgeActivity joinTossbankBridgeActivity, TossbankJoinBridgeResponse tossbankJoinBridgeResponse) {
        this.f$0 = joinTossbankBridgeActivity;
        this.f$1 = tossbankJoinBridgeResponse;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            JoinTossbankBridgeActivity.onExtraCallback(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = JoinTossbankBridgeActivity.onExtraCallback(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onNavigationEvent + 83;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 42 / 0;
        }
        return unitOnExtraCallback;
    }
}
