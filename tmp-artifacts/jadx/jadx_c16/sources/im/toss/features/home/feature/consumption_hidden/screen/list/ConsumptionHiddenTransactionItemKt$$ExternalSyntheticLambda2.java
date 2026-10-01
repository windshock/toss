package im.toss.features.home.feature.consumption_hidden.screen.list;

import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.BizPermissionManager;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RVGroup;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionHiddenTransactionItemKt$$ExternalSyntheticLambda2 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ BizPermissionManager f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ConsumptionHiddenTransactionItemKt$$ExternalSyntheticLambda2(BizPermissionManager bizPermissionManager, Function1 function1) {
        this.f$0 = bizPermissionManager;
        this.f$1 = function1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallback = RVGroup.onExtraCallback(this.f$0, this.f$1, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i3 = 18 / 0;
        } else {
            unitOnExtraCallback = RVGroup.onExtraCallback(this.f$0, this.f$1, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        int i4 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return unitOnExtraCallback;
    }
}
