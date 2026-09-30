package im.toss.features.fx;

import im.toss.features.fx.FxIntroActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxIntroActivity$FxHistoryAdapter$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ FxIntroActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = FxIntroActivity.onNavigationEvent.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
        int i4 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
