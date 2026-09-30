package im.toss.features.account_terminator.ui.devtool;

import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getSupportedHighSpeedResolutionsFor;
import o.getWidthSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda22 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ getWidthSpec f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;

    public /* synthetic */ AccountTerminateDevToolActivity$$ExternalSyntheticLambda22(getWidthSpec getwidthspec, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = getwidthspec;
        this.f$1 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getWidthSpec getwidthspec = this.f$0;
        if (i3 == 0) {
            return AccountTerminateDevToolActivity.onWarmupCompleted(getwidthspec, this.f$1, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        AccountTerminateDevToolActivity.onWarmupCompleted(getwidthspec, this.f$1, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
