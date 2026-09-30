package im.toss.features.home.feature.asset_home.activity;

import androidx.compose.foundation.layout.RowScope;
import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetCardHomeEditViewModel;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda60 implements getBacktraceNote {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AssetCardHomeEditViewModel f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda60(AssetCardHomeEditViewModel assetCardHomeEditViewModel, setParentLayoutDirection setparentlayoutdirection) {
        this.f$0 = assetCardHomeEditViewModel;
        this.f$1 = setparentlayoutdirection;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AssetCardHomeEditViewModel assetCardHomeEditViewModel = this.f$0;
        if (i3 != 0) {
            return AssetHomeEditNavActivity.onExtraCallback(assetCardHomeEditViewModel, this.f$1, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        AssetHomeEditNavActivity.onExtraCallback(assetCardHomeEditViewModel, this.f$1, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        throw null;
    }
}
