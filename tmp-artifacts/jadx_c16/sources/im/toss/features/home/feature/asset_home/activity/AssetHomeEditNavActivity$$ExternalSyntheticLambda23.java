package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetInvestmentHomeEditViewModel;
import kotlin.jvm.functions.Function0;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda23 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AssetInvestmentHomeEditViewModel f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;
    public final /* synthetic */ AssetHomeEditNavActivity f$2;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda23(AssetInvestmentHomeEditViewModel assetInvestmentHomeEditViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, AssetHomeEditNavActivity assetHomeEditNavActivity) {
        this.f$0 = assetInvestmentHomeEditViewModel;
        this.f$1 = getsupportedhighspeedresolutionsfor;
        this.f$2 = assetHomeEditNavActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AssetInvestmentHomeEditViewModel assetInvestmentHomeEditViewModel = this.f$0;
        if (i3 == 0) {
            return AssetHomeEditNavActivity.IAuthTabCallback(assetInvestmentHomeEditViewModel, this.f$1, this.f$2);
        }
        AssetHomeEditNavActivity.IAuthTabCallback(assetInvestmentHomeEditViewModel, this.f$1, this.f$2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
