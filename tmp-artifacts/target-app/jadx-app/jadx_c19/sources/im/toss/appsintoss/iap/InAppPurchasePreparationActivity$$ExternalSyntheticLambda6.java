package im.toss.appsintoss.iap;

import im.toss.appsintoss.manager.model.AppsInTossProduct;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchasePreparationActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ InAppPurchasePreparationActivity f$0;
    public final /* synthetic */ AppsInTossProduct f$1;

    public /* synthetic */ InAppPurchasePreparationActivity$$ExternalSyntheticLambda6(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, AppsInTossProduct appsInTossProduct) {
        this.f$0 = inAppPurchasePreparationActivity;
        this.f$1 = appsInTossProduct;
    }

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        InAppPurchasePreparationActivity inAppPurchasePreparationActivity = this.f$0;
        if (i4 == 0) {
            Object[] objArr = {inAppPurchasePreparationActivity, this.f$1, (SetDetectableSize) obj};
            return (Unit) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1404231952, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1404231948);
        }
        Object[] objArr2 = {inAppPurchasePreparationActivity, this.f$1, (SetDetectableSize) obj};
        int i5 = 37 / 0;
        return (Unit) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1404231952, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1404231948);
    }
}
