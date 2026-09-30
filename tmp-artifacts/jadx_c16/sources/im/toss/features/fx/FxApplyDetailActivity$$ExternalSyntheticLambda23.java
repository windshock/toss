package im.toss.features.fx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxApplyDetailActivity$$ExternalSyntheticLambda23 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ FxApplyDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            FxApplyDetailActivity.IAuthTabCallback(this.f$0, (Throwable) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = FxApplyDetailActivity.IAuthTabCallback(this.f$0, (Throwable) obj);
        int i3 = onExtraCallbackWithResult + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
