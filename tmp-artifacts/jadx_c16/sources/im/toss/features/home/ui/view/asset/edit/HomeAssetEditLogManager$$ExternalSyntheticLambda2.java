package im.toss.features.home.ui.view.asset.edit;

import im.toss.features.home.core.model.asset.edit.AssetForEditV2Dto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getRuntimeSupportMax;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditLogManager$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AssetForEditV2Dto.Category f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ getRuntimeSupportMax f$2;

    public /* synthetic */ HomeAssetEditLogManager$$ExternalSyntheticLambda2(AssetForEditV2Dto.Category category, boolean z, getRuntimeSupportMax getruntimesupportmax) {
        this.f$0 = category;
        this.f$1 = z;
        this.f$2 = getruntimesupportmax;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = getRuntimeSupportMax.onNavigationEvent(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = IAuthTabCallback + 87;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
