package im.toss.feature.credit.ui.main.intro;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditIntroActivity$$ExternalSyntheticLambda4 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditIntroActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            CreditIntroActivity.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            obj3.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = CreditIntroActivity.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
