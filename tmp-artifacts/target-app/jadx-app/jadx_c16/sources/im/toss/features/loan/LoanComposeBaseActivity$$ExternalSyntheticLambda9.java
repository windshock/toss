package im.toss.features.loan;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComposeBaseActivity$$ExternalSyntheticLambda9 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ LoanComposeBaseActivity f$0;
    public final /* synthetic */ Function2 f$1;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$2;
    public final /* synthetic */ Function2 f$3;
    public final /* synthetic */ getBacktraceNote f$4;
    public final /* synthetic */ long f$5;
    public final /* synthetic */ long f$6;
    public final /* synthetic */ float f$7;
    public final /* synthetic */ int f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ LoanComposeBaseActivity$$ExternalSyntheticLambda9(LoanComposeBaseActivity loanComposeBaseActivity, Function2 function2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function22, getBacktraceNote getbacktracenote, long j, long j2, float f, int i, int i2) {
        this.f$0 = loanComposeBaseActivity;
        this.f$1 = function2;
        this.f$2 = quirksExternalSyntheticBackport0;
        this.f$3 = function22;
        this.f$4 = getbacktracenote;
        this.f$5 = j;
        this.f$6 = j2;
        this.f$7 = f;
        this.f$8 = i;
        this.f$9 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LoanComposeBaseActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallback + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return unitOnNavigationEvent;
    }
}
