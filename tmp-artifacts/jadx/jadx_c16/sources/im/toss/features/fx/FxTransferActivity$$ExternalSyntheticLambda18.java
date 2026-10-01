package im.toss.features.fx;

import im.toss.network.model.BaseApiResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.KeyBoardVisiblePoint;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda18 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FxTransferActivity f$0;
    public final /* synthetic */ KeyBoardVisiblePoint f$1;

    public /* synthetic */ FxTransferActivity$$ExternalSyntheticLambda18(FxTransferActivity fxTransferActivity, KeyBoardVisiblePoint keyBoardVisiblePoint) {
        this.f$0 = fxTransferActivity;
        this.f$1 = keyBoardVisiblePoint;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = FxTransferActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (BaseApiResponse) obj);
        int i4 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
