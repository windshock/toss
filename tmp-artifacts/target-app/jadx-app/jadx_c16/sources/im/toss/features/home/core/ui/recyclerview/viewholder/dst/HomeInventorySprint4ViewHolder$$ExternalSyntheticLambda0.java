package im.toss.features.home.core.ui.recyclerview.viewholder.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.NetworkUtil1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeInventorySprint4ViewHolder$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function0 f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = NetworkUtil1.onNavigationEvent(this.f$0);
        int i4 = onExtraCallback + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
