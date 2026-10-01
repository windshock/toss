package im.toss.features.home.feature.asset_home.activity;

import androidx.compose.foundation.layout.RowScope;
import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetLoanHomeEditViewModel;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getKekid;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda93 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ AssetLoanHomeEditViewModel f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda93(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, setParentLayoutDirection setparentlayoutdirection) {
        this.f$0 = assetLoanHomeEditViewModel;
        this.f$1 = setparentlayoutdirection;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        Object obj4 = null;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, this.f$1, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            obj4.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
        Unit unit = (Unit) AssetHomeEditNavActivity.onExtraCallbackWithResult(getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr2, 1430200320, getKekid.onExtraCallback(), getKekid.onExtraCallback(), -1430200299);
        int i3 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        obj4.hashCode();
        throw null;
    }
}
