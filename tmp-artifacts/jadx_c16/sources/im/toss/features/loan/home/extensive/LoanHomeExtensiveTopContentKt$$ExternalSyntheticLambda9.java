package im.toss.features.loan.home.extensive;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getHumanReadableName;
import o.loadSubPackage;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanHomeExtensiveTopContentKt$$ExternalSyntheticLambda9 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ getHumanReadableName f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ LoanHomeExtensiveTopContentKt$$ExternalSyntheticLambda9(getHumanReadableName gethumanreadablename, String str, String str2) {
        this.f$0 = gethumanreadablename;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = loadSubPackage.onExtraCallback(this.f$0, this.f$1, this.f$2, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onNavigationEvent + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
