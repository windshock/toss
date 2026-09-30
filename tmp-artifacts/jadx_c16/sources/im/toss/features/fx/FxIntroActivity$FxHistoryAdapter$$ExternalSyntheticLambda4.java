package im.toss.features.fx;

import im.toss.features.fx.FxIntroActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AppMsgReceiver2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxIntroActivity$FxHistoryAdapter$$ExternalSyntheticLambda4 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = FxIntroActivity.onNavigationEvent.IAuthTabCallback((AppMsgReceiver2) obj, (FxIntroActivity.onWarmupCompleted) obj2);
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        int i5 = onExtraCallbackWithResult + 57;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }
}
