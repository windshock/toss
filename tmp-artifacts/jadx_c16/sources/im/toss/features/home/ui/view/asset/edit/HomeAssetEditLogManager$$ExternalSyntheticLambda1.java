package im.toss.features.home.ui.view.asset.edit;

import im.toss.features.home.core.model.asset.edit.AssetForEditV2Dto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getRuntimeSupportMax;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditLogManager$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AssetForEditV2Dto.Asset f$0;
    public final /* synthetic */ getRuntimeSupportMax f$1;

    public /* synthetic */ HomeAssetEditLogManager$$ExternalSyntheticLambda1(AssetForEditV2Dto.Asset asset, getRuntimeSupportMax getruntimesupportmax) {
        this.f$0 = asset;
        this.f$1 = getruntimesupportmax;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = getRuntimeSupportMax.onExtraCallbackWithResult(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onWarmupCompleted + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
