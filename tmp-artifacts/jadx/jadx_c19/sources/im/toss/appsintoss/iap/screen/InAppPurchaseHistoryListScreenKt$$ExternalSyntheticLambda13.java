package im.toss.appsintoss.iap.screen;

import com.google.android.gms.internal.ads.zzgsa;
import im.toss.appsintoss.iap.InAppPurchaseHistoryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryListScreenKt$$ExternalSyntheticLambda13 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
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

    public /* synthetic */ InAppPurchaseHistoryListScreenKt$$ExternalSyntheticLambda13(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, boolean z, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2, int i3) {
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
        int i3 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = this.f$0;
        InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel = this.f$1;
        boolean z = this.f$2;
        getBacktraceNote getbacktracenote = this.f$3;
        getBacktraceNote getbacktracenote2 = this.f$4;
        Function0 function0 = this.f$5;
        Function0 function02 = this.f$6;
        Function0 function03 = this.f$7;
        Function0 function04 = this.f$8;
        int i5 = this.f$9;
        int i6 = this.f$10;
        int iIntValue = ((Integer) obj2).intValue();
        Object[] objArr = {quirksExternalSyntheticBackport0, inAppPurchaseHistoryViewModel, Boolean.valueOf(z), getbacktracenote, getbacktracenote2, function0, function02, function03, function04, Integer.valueOf(i5), Integer.valueOf(i6), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.onNavigationEvent(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1272705832, iOnWarmupCompleted2, iOnWarmupCompleted, -1272705832, objArr);
        int i7 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 83 / 0;
        }
        return unit;
    }
}
