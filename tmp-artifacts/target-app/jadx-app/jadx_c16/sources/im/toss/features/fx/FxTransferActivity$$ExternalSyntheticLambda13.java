package im.toss.features.fx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda13 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ FxTransferActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnNavigationEvent = FxTransferActivity.onNavigationEvent(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
            int i3 = 93 / 0;
        } else {
            unitOnNavigationEvent = FxTransferActivity.onNavigationEvent(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
        }
        int i4 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
