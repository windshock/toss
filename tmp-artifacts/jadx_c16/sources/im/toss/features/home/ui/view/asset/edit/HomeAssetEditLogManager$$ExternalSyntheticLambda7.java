package im.toss.features.home.ui.view.asset.edit;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getRuntimeSupportMax;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditLogManager$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ getRuntimeSupportMax f$1;

    public /* synthetic */ HomeAssetEditLogManager$$ExternalSyntheticLambda7(String str, getRuntimeSupportMax getruntimesupportmax) {
        this.f$0 = str;
        this.f$1 = getruntimesupportmax;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = getRuntimeSupportMax.IAuthTabCallback(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
