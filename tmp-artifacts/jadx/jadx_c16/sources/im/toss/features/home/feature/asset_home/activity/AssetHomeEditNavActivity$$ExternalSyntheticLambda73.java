package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetDepositHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda73 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$0;
    public final /* synthetic */ AssetDepositHomeEditViewModel f$1;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda73(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel) {
        this.f$0 = getsupportedhighspeedresolutionsfor;
        this.f$1 = assetDepositHomeEditViewModel;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            AssetHomeEditNavActivity.onWarmupCompleted(this.f$0, this.f$1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = AssetHomeEditNavActivity.onWarmupCompleted(this.f$0, this.f$1);
        int i3 = onExtraCallbackWithResult + 111;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
