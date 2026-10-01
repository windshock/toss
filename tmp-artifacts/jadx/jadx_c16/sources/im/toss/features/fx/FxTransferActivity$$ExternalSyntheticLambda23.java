package im.toss.features.fx;

import im.toss.network.model.BaseApiResponse;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda23 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ FxTransferActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        FxTransferActivity fxTransferActivity = this.f$0;
        BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
        if (i3 == 0) {
            return FxTransferActivity.onWarmupCompleted(fxTransferActivity, baseApiResponse);
        }
        FxTransferActivity.onWarmupCompleted(fxTransferActivity, baseApiResponse);
        throw null;
    }
}
