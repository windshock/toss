package im.toss.features.home.core.ui.widget;

import im.toss.inventory_sdk.model.InventoryAdDto;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeIntelligenceNormalView$$ExternalSyntheticLambda10 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function0 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Function0 function0 = this.f$0;
        InventoryAdDto.Normal.Button button = (InventoryAdDto.Normal.Button) obj;
        if (i3 == 0) {
            return HomeIntelligenceNormalView.onExtraCallbackWithResult(function0, button);
        }
        HomeIntelligenceNormalView.onExtraCallbackWithResult(function0, button);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
