package im.toss.feature.credit.ui.main.test;

import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda42 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
        Unit unit = (Unit) CreditTestActivity.onWarmupCompleted(1485108033, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1485108004, objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
        int i4 = onNavigationEvent + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return unit;
    }
}
