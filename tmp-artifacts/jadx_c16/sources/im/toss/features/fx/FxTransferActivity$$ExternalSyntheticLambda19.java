package im.toss.features.fx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda19 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ FxTransferActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            FxTransferActivity.onExtraCallback(this.f$0, (Throwable) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = FxTransferActivity.onExtraCallback(this.f$0, (Throwable) obj);
        int i3 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
