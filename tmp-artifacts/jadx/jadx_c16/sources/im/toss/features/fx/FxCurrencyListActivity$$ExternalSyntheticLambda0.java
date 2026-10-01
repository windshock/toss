package im.toss.features.fx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxCurrencyListActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FxCurrencyListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            FxCurrencyListActivity.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = FxCurrencyListActivity.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
        int i3 = onWarmupCompleted + 9;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
