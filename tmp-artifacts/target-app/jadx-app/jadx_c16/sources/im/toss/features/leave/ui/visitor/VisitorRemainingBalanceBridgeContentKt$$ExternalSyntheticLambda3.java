package im.toss.features.leave.ui.visitor;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MainResourcePackage3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class VisitorRemainingBalanceBridgeContentKt$$ExternalSyntheticLambda3 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ VisitorRemainingBalanceBridgeContentKt$$ExternalSyntheticLambda3(long j, Function0 function0, Function0 function02, int i) {
        this.f$0 = j;
        this.f$1 = function0;
        this.f$2 = function02;
        this.f$3 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            MainResourcePackage3.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = MainResourcePackage3.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onExtraCallback + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
