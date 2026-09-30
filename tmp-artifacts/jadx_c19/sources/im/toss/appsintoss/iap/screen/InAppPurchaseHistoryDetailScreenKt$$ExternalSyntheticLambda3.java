package im.toss.appsintoss.iap.screen;

import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda3 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function0 f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f$0};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 898670716, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -898670701);
        int i5 = onWarmupCompleted + 101;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }
}
