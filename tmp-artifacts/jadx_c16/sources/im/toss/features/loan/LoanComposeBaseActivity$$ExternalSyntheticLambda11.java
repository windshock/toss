package im.toss.features.loan;

import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComposeBaseActivity$$ExternalSyntheticLambda11 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanComposeBaseActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LoanComposeBaseActivity loanComposeBaseActivity = this.f$0;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
        Integer numValueOf = Integer.valueOf(((Integer) obj3).intValue());
        if (i3 == 0) {
            int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            return (Unit) LoanComposeBaseActivity.onExtraCallback(new Object[]{loanComposeBaseActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback, 1928826812, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1928826806);
        }
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        Unit unit = (Unit) LoanComposeBaseActivity.onExtraCallback(new Object[]{loanComposeBaseActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback2, 1928826812, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1928826806);
        int i4 = 43 / 0;
        return unit;
    }
}
