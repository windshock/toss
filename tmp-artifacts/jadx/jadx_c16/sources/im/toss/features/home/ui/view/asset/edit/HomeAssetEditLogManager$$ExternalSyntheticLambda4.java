package im.toss.features.home.ui.view.asset.edit;

import im.toss.features.home.core.model.asset.edit.AssetForEditV2Dto;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getRuntimeSupportMax;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditLogManager$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AssetForEditV2Dto.Category f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ getRuntimeSupportMax f$2;

    public /* synthetic */ HomeAssetEditLogManager$$ExternalSyntheticLambda4(AssetForEditV2Dto.Category category, boolean z, getRuntimeSupportMax getruntimesupportmax) {
        this.f$0 = category;
        this.f$1 = z;
        this.f$2 = getruntimesupportmax;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AssetForEditV2Dto.Category category = this.f$0;
        if (i3 != 0) {
            return (Unit) getRuntimeSupportMax.onNavigationEvent(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 1469291705, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{category, Boolean.valueOf(this.f$1), this.f$2, (SetDetectableSize) obj}, -1469291704);
        }
        Object[] objArr = {category, Boolean.valueOf(this.f$1), this.f$2, (SetDetectableSize) obj};
        int i4 = 83 / 0;
        return (Unit) getRuntimeSupportMax.onNavigationEvent(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 1469291705, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), objArr, -1469291704);
    }
}
