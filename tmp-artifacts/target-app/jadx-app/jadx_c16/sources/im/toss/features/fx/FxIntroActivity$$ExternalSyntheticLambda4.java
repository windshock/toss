package im.toss.features.fx;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxIntroActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ FxIntroActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        FxIntroActivity fxIntroActivity = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 == 0) {
            return FxIntroActivity.onNavigationEvent(fxIntroActivity, setDetectableSize);
        }
        FxIntroActivity.onNavigationEvent(fxIntroActivity, setDetectableSize);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
