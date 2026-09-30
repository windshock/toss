package im.toss.features.loan.calculator;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestInfoActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanInterestInfoActivity f$0;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ String f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ LoanInterestInfoActivity$$ExternalSyntheticLambda3(LoanInterestInfoActivity loanInterestInfoActivity, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, boolean z, String str4, int i, int i2) {
        this.f$0 = loanInterestInfoActivity;
        this.f$1 = quirksExternalSyntheticBackport0;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$4 = str3;
        this.f$5 = z;
        this.f$6 = str4;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LoanInterestInfoActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return unitOnNavigationEvent;
    }
}
