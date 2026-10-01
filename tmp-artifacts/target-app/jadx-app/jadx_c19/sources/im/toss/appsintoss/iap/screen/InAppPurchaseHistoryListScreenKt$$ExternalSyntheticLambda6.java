package im.toss.appsintoss.iap.screen;

import com.google.android.gms.internal.ads.zzgsa;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryListScreenKt$$ExternalSyntheticLambda6 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 17;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.onNavigationEvent(zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, -511892865, iOnWarmupCompleted2, iOnWarmupCompleted, 511892867, new Object[0]);
        int i5 = onWarmupCompleted + 23;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
