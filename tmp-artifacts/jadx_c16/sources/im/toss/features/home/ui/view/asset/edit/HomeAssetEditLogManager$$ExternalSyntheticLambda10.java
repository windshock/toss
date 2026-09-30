package im.toss.features.home.ui.view.asset.edit;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getRuntimeSupportMax;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditLogManager$$ExternalSyntheticLambda10 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ getRuntimeSupportMax f$0;

    public final Object invoke(Object obj) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnWarmupCompleted = getRuntimeSupportMax.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            int i3 = 47 / 0;
        } else {
            unitOnWarmupCompleted = getRuntimeSupportMax.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
        }
        int i4 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
