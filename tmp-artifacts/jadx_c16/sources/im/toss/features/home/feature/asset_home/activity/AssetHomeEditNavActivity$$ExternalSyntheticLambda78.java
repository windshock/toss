package im.toss.features.home.feature.asset_home.activity;

import androidx.compose.foundation.layout.RowScope;
import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetEtcHomeEditViewModel;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getKekid;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda78 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ AssetEtcHomeEditViewModel f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda78(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, setParentLayoutDirection setparentlayoutdirection) {
        this.f$0 = assetEtcHomeEditViewModel;
        this.f$1 = setparentlayoutdirection;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) AssetHomeEditNavActivity.onExtraCallbackWithResult(getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[]{this.f$0, this.f$1, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, 1740216005, getKekid.onExtraCallback(), getKekid.onExtraCallback(), -1740215970);
        int i4 = onExtraCallback + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
