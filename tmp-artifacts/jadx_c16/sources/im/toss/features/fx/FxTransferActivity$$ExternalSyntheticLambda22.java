package im.toss.features.fx;

import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda22 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FxTransferActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) FxTransferActivity.onWarmupCompleted(PushInfo.Companion.onExtraCallback(), new Object[]{this.f$0, (Throwable) obj}, -2136015062, PushInfo.Companion.onExtraCallback(), 2136015065, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
        int i3 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
        }
        return unit;
    }
}
