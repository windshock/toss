package im.toss.features.home.feature.consumption_hidden.screen.list;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.BizPermissionManager;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.RVGroup;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionHiddenTransactionItemKt$$ExternalSyntheticLambda4 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$0;
    public final /* synthetic */ BizPermissionManager f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ ConsumptionHiddenTransactionItemKt$$ExternalSyntheticLambda4(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, BizPermissionManager bizPermissionManager, Function1 function1, int i, int i2) {
        this.f$0 = quirksExternalSyntheticBackport0;
        this.f$1 = bizPermissionManager;
        this.f$2 = function1;
        this.f$3 = i;
        this.f$4 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return RVGroup.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        RVGroup.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        throw null;
    }
}
