package im.toss.appsintoss.iap.screen;

import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda30 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ setParentLayoutDirection f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f$0};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 963408849, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -963408836);
        int i5 = onWarmupCompleted + 87;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return unit;
    }
}
