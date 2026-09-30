package im.toss.features.home.presentation.dst_regular_consumption_remove;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstRegularConsumptionRemoveActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ HomeDstRegularConsumptionRemoveActivity$$ExternalSyntheticLambda7(String str, String str2) {
        this.f$0 = str;
        this.f$1 = str2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            HomeDstRegularConsumptionRemoveActivity.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = HomeDstRegularConsumptionRemoveActivity.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i3 = onExtraCallback + 29;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj2.hashCode();
        throw null;
    }
}
