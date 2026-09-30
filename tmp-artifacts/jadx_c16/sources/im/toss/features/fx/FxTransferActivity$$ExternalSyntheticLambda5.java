package im.toss.features.fx;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.registerCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ FxTransferActivity f$0;
    public final /* synthetic */ registerCallback f$1;

    public /* synthetic */ FxTransferActivity$$ExternalSyntheticLambda5(FxTransferActivity fxTransferActivity, registerCallback registercallback) {
        this.f$0 = fxTransferActivity;
        this.f$1 = registercallback;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        FxTransferActivity fxTransferActivity = this.f$0;
        if (i3 != 0) {
            return FxTransferActivity.onExtraCallbackWithResult(fxTransferActivity, this.f$1, (SetDetectableSize) obj);
        }
        FxTransferActivity.onExtraCallbackWithResult(fxTransferActivity, this.f$1, (SetDetectableSize) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
