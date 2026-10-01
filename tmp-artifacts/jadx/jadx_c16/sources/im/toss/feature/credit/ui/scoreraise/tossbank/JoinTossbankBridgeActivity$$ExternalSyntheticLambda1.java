package im.toss.feature.credit.ui.scoreraise.tossbank;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class JoinTossbankBridgeActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ JoinTossbankBridgeActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        JoinTossbankBridgeActivity joinTossbankBridgeActivity = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 != 0) {
            return JoinTossbankBridgeActivity.IAuthTabCallback(joinTossbankBridgeActivity, setDetectableSize);
        }
        JoinTossbankBridgeActivity.IAuthTabCallback(joinTossbankBridgeActivity, setDetectableSize);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
