package im.toss.features.home.ui.dst.view.account;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAccountActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ HomeDstAccountActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = HomeDstAccountActivity.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
        int i4 = onWarmupCompleted + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return unitOnNavigationEvent;
    }
}
