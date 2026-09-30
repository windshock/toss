package im.toss.feature.credit.ui.scoreraise.tossbank;

import im.toss.features.credit.data.response.TossbankJoinBridgeResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.handleRemoveKey;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class JoinTossbankBridgeActivity$$ExternalSyntheticLambda4 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ TossbankJoinBridgeResponse f$0;
    public final /* synthetic */ JoinTossbankBridgeActivity f$1;

    public /* synthetic */ JoinTossbankBridgeActivity$$ExternalSyntheticLambda4(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, JoinTossbankBridgeActivity joinTossbankBridgeActivity) {
        this.f$0 = tossbankJoinBridgeResponse;
        this.f$1 = joinTossbankBridgeActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
            int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        Unit unit = (Unit) JoinTossbankBridgeActivity.onWarmupCompleted(1116192546, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), objArr2, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1116192546);
        int i3 = onNavigationEvent + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
