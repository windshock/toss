package im.toss.feature.credit.ui.main.test;

import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda31 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
        Unit unit = (Unit) CreditTestActivity.onWarmupCompleted(861730730, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -861730699, objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
        int i4 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
