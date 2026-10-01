package im.toss.features.home.ui.view.asset.edit;

import im.toss.features.home.core.model.asset.edit.AssetForEditV2Dto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getRuntimeSupportMax;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditLogManager$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AssetForEditV2Dto.Asset f$0;
    public final /* synthetic */ AssetForEditV2Dto.Category f$1;
    public final /* synthetic */ AssetForEditV2Dto.Category f$2;
    public final /* synthetic */ getRuntimeSupportMax f$3;

    public /* synthetic */ HomeAssetEditLogManager$$ExternalSyntheticLambda3(AssetForEditV2Dto.Asset asset, AssetForEditV2Dto.Category category, AssetForEditV2Dto.Category category2, getRuntimeSupportMax getruntimesupportmax) {
        this.f$0 = asset;
        this.f$1 = category;
        this.f$2 = category2;
        this.f$3 = getruntimesupportmax;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getRuntimeSupportMax.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, (SetDetectableSize) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = getRuntimeSupportMax.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, (SetDetectableSize) obj);
        int i3 = IAuthTabCallback + 51;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
