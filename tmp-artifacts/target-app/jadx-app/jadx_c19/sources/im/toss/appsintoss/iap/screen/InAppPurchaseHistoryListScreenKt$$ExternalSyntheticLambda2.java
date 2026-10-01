package im.toss.appsintoss.iap.screen;

import im.toss.appsintoss.iap.InAppPurchaseHistoryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryListScreenKt$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$0;
    public final /* synthetic */ InAppPurchaseHistoryViewModel f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ getBacktraceNote f$3;
    public final /* synthetic */ getBacktraceNote f$4;
    public final /* synthetic */ Function0 f$5;
    public final /* synthetic */ Function0 f$6;
    public final /* synthetic */ Function0 f$7;
    public final /* synthetic */ Function0 f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ InAppPurchaseHistoryListScreenKt$$ExternalSyntheticLambda2(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, boolean z, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2, int i3) {
        this.f$0 = quirksExternalSyntheticBackport0;
        this.f$1 = inAppPurchaseHistoryViewModel;
        this.f$2 = z;
        this.f$3 = getbacktracenote;
        this.f$4 = getbacktracenote2;
        this.f$5 = function0;
        this.f$6 = function02;
        this.f$7 = function03;
        this.f$8 = function04;
        this.f$9 = i2;
        this.f$10 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 117;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i5 = onExtraCallbackWithResult + 47;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
