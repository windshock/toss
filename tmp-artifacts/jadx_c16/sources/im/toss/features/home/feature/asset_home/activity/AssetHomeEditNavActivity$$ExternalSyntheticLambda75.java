package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetDepositHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda75 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AssetDepositHomeEditViewModel f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;
    public final /* synthetic */ AssetHomeEditNavActivity f$2;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda75(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, AssetHomeEditNavActivity assetHomeEditNavActivity) {
        this.f$0 = assetDepositHomeEditViewModel;
        this.f$1 = getsupportedhighspeedresolutionsfor;
        this.f$2 = assetHomeEditNavActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = AssetHomeEditNavActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2);
        int i4 = IAuthTabCallback + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
