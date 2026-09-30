package im.toss.features.loan;

import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComposeBaseActivity$$ExternalSyntheticLambda8 implements Function2 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$0;
    public final /* synthetic */ Function2 f$1;
    public final /* synthetic */ getBacktraceNote f$2;
    public final /* synthetic */ Function2 f$3;

    public /* synthetic */ LoanComposeBaseActivity$$ExternalSyntheticLambda8(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, getBacktraceNote getbacktracenote, Function2 function22) {
        this.f$0 = quirksExternalSyntheticBackport0;
        this.f$1 = function2;
        this.f$2 = getbacktracenote;
        this.f$3 = function22;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
            int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        Unit unit = (Unit) LoanComposeBaseActivity.onExtraCallback(objArr2, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback2, 478593489, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -478593487);
        int i3 = onNavigationEvent + 77;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        obj3.hashCode();
        throw null;
    }
}
