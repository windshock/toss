package im.toss.features.home.feature.consumption_hidden.screen.list;

import androidx.compose.foundation.layout.RowScope;
import kotlin.Unit;
import o.BizPermissionManager;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RVGroup;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionHiddenTransactionItemKt$$ExternalSyntheticLambda11 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ BizPermissionManager f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            RVGroup.onWarmupCompleted(this.f$0, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = RVGroup.onWarmupCompleted(this.f$0, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i3 = onExtraCallback + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
