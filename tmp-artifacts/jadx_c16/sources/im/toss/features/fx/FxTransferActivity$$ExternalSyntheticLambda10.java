package im.toss.features.fx;

import im.toss.network.model.BaseApiResponse;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda10 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ FxTransferActivity f$0;
    public final /* synthetic */ BaseApiResponse f$1;

    public /* synthetic */ FxTransferActivity$$ExternalSyntheticLambda10(FxTransferActivity fxTransferActivity, BaseApiResponse baseApiResponse) {
        this.f$0 = fxTransferActivity;
        this.f$1 = baseApiResponse;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) FxTransferActivity.onWarmupCompleted(PushInfo.Companion.onExtraCallback(), new Object[]{this.f$0, this.f$1, (CommonModule_setLeftEdgeTouchEnabled) obj}, -1731677510, PushInfo.Companion.onExtraCallback(), 1731677514, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
        int i4 = onExtraCallback + 119;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
