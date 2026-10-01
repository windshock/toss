package im.toss.features.account_terminator.ui.devtool;

import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getSupportedHighSpeedResolutionsFor;
import o.specToLayoutParam;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda17 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ specToLayoutParam f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;

    public /* synthetic */ AccountTerminateDevToolActivity$$ExternalSyntheticLambda17(specToLayoutParam spectolayoutparam, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = spectolayoutparam;
        this.f$1 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = AccountTerminateDevToolActivity.onNavigationEvent(this.f$0, this.f$1, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
