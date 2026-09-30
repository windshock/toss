package im.toss.features.home.feature.asset_home.activity;

import androidx.compose.foundation.layout.RowScope;
import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetInvestmentHomeEditViewModel;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda56 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ AssetInvestmentHomeEditViewModel f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda56(AssetInvestmentHomeEditViewModel assetInvestmentHomeEditViewModel, setParentLayoutDirection setparentlayoutdirection) {
        this.f$0 = assetInvestmentHomeEditViewModel;
        this.f$1 = setparentlayoutdirection;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = AssetHomeEditNavActivity.onNavigationEvent(this.f$0, this.f$1, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = IAuthTabCallback + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return unitOnNavigationEvent;
    }
}
