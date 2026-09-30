package im.toss.features.fx;

import kotlin.jvm.functions.Function1;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxApplyDetailActivity$$ExternalSyntheticLambda18 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FxApplyDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        FxApplyDetailActivity fxApplyDetailActivity = this.f$0;
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) obj;
        if (i3 != 0) {
            return FxApplyDetailActivity.onExtraCallbackWithResult(fxApplyDetailActivity, deserializeurinullablecollection);
        }
        FxApplyDetailActivity.onExtraCallbackWithResult(fxApplyDetailActivity, deserializeurinullablecollection);
        throw null;
    }
}
