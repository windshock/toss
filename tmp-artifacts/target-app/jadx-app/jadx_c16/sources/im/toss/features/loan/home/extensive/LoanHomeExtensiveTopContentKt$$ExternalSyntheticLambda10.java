package im.toss.features.loan.home.extensive;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getHumanReadableName;
import o.loadSubPackage;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanHomeExtensiveTopContentKt$$ExternalSyntheticLambda10 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ getHumanReadableName f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ LoanHomeExtensiveTopContentKt$$ExternalSyntheticLambda10(String str, String str2, Function0 function0, getHumanReadableName gethumanreadablename, int i, int i2) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = function0;
        this.f$3 = gethumanreadablename;
        this.f$4 = i;
        this.f$5 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            loadSubPackage.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            throw null;
        }
        Unit unitOnNavigationEvent = loadSubPackage.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = IAuthTabCallback + 3;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
