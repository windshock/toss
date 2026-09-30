package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetDepositHomeEditViewModel;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.GlobalInfoRecorderUtils;
import o.TwoLineExternalSyntheticLambda0;
import o.getKekid;
import o.setDividerDrawable;
import o.setTaggedAddrCtrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda8 implements setTaggedAddrCtrl {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ AssetDepositHomeEditViewModel f$1;
    public final /* synthetic */ GlobalInfoRecorderUtils f$2;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda8(AssetHomeEditNavActivity assetHomeEditNavActivity, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, GlobalInfoRecorderUtils globalInfoRecorderUtils) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = assetDepositHomeEditViewModel;
        this.f$2 = globalInfoRecorderUtils;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, this.f$2, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
        Unit unit = (Unit) AssetHomeEditNavActivity.onExtraCallbackWithResult(getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr, -245854997, getKekid.onExtraCallback(), getKekid.onExtraCallback(), 245855020);
        int i4 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
