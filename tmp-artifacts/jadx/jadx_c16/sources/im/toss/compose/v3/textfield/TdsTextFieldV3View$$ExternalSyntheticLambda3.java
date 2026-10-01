package im.toss.compose.v3.textfield;

import androidx.compose.foundation.layout.RowScope;
import kotlin.jvm.functions.Function1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsTextFieldV3View$$ExternalSyntheticLambda3 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Function1 function1 = this.f$0;
        RowScope rowScope = (RowScope) obj;
        if (i3 == 0) {
            return TdsTextFieldV3View.onExtraCallbackWithResult(function1, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        TdsTextFieldV3View.onExtraCallbackWithResult(function1, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        throw null;
    }
}
