package im.toss.features.fx;

import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.TypeUtils7;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ FxTransferActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) FxTransferActivity.onWarmupCompleted(PushInfo.Companion.onExtraCallback(), new Object[]{this.f$0, (TypeUtils7) obj}, 197993090, PushInfo.Companion.onExtraCallback(), -197993085, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
        int i4 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
