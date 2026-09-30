package im.toss.features.home.presentation.dst_regular_consumption_remove;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstRegularConsumptionRemoveActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ HomeDstRegularConsumptionRemoveActivity$$ExternalSyntheticLambda8(String str, String str2, String str3) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = HomeDstRegularConsumptionRemoveActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
