package im.toss.features.home.presentation.dst_regular_consumption_remove;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstRegularConsumptionRemoveActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ HomeDstRegularConsumptionRemoveActivity$$ExternalSyntheticLambda2(String str, String str2, String str3) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f$0;
        if (i3 == 0) {
            return HomeDstRegularConsumptionRemoveActivity.IAuthTabCallback(str, this.f$1, this.f$2, (SetDetectableSize) obj);
        }
        Unit unitIAuthTabCallback = HomeDstRegularConsumptionRemoveActivity.IAuthTabCallback(str, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = 46 / 0;
        return unitIAuthTabCallback;
    }
}
