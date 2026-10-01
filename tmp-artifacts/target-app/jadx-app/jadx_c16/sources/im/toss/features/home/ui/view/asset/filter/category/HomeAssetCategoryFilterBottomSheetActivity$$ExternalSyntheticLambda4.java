package im.toss.features.home.ui.view.asset.filter.category;

import android.view.View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetCategoryFilterBottomSheetActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ HomeAssetCategoryFilterBottomSheetActivity f$0;
    public final /* synthetic */ TdsBottomCtaV1View f$1;

    public /* synthetic */ HomeAssetCategoryFilterBottomSheetActivity$$ExternalSyntheticLambda4(HomeAssetCategoryFilterBottomSheetActivity homeAssetCategoryFilterBottomSheetActivity, TdsBottomCtaV1View tdsBottomCtaV1View) {
        this.f$0 = homeAssetCategoryFilterBottomSheetActivity;
        this.f$1 = tdsBottomCtaV1View;
    }

    public final Object invoke(Object obj) {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            unitIAuthTabCallback = HomeAssetCategoryFilterBottomSheetActivity.IAuthTabCallback(this.f$0, this.f$1, (View) obj);
            int i3 = 63 / 0;
        } else {
            unitIAuthTabCallback = HomeAssetCategoryFilterBottomSheetActivity.IAuthTabCallback(this.f$0, this.f$1, (View) obj);
        }
        int i4 = onNavigationEvent + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
