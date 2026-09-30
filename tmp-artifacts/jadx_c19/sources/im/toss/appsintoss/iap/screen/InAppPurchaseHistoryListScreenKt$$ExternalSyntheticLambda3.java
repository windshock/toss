package im.toss.appsintoss.iap.screen;

import com.google.android.gms.internal.ads.zzgsa;
import im.toss.appsintoss.iap.InAppPurchaseHistoryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.AudioRestrictionControllerImplExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryListScreenKt$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$0;
    public final /* synthetic */ getBacktraceNote f$1;
    public final /* synthetic */ getBacktraceNote f$2;
    public final /* synthetic */ Function0 f$3;
    public final /* synthetic */ Function0 f$4;
    public final /* synthetic */ InAppPurchaseHistoryViewModel f$5;

    public /* synthetic */ InAppPurchaseHistoryListScreenKt$$ExternalSyntheticLambda3(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, Function0 function02, InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel) {
        this.f$0 = cameraPresenceProviderExternalSyntheticLambda6;
        this.f$1 = getbacktracenote;
        this.f$2 = getbacktracenote2;
        this.f$3 = function0;
        this.f$4 = function02;
        this.f$5 = inAppPurchaseHistoryViewModel;
    }

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj};
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted4 = zzgsa.onWarmupCompleted();
        Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.onNavigationEvent(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 2092631064, iOnWarmupCompleted4, iOnWarmupCompleted3, -2092631061, objArr2);
        int i4 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj2.hashCode();
        throw null;
    }
}
