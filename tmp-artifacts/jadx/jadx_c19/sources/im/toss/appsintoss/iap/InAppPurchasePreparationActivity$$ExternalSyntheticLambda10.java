package im.toss.appsintoss.iap;

import androidx.activity.OnBackPressedCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchasePreparationActivity$$ExternalSyntheticLambda10 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ InAppPurchasePreparationActivity f$0;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = InAppPurchasePreparationActivity.onExtraCallback(this.f$0, (OnBackPressedCallback) obj);
        int i5 = onWarmupCompleted + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return unitOnExtraCallback;
    }
}
