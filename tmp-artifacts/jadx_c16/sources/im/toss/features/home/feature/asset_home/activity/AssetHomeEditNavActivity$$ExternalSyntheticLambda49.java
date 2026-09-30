package im.toss.features.home.feature.asset_home.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.GlobalInfoRecorderUtils;
import o.isGenie$onExtraCallbackWithResult;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda49 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;
    public final /* synthetic */ isGenie$onExtraCallbackWithResult f$2;
    public final /* synthetic */ GlobalInfoRecorderUtils f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda49(AssetHomeEditNavActivity assetHomeEditNavActivity, setParentLayoutDirection setparentlayoutdirection, isGenie$onExtraCallbackWithResult isgenie_onextracallbackwithresult, GlobalInfoRecorderUtils globalInfoRecorderUtils, int i, int i2) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = setparentlayoutdirection;
        this.f$2 = isgenie_onextracallbackwithresult;
        this.f$3 = globalInfoRecorderUtils;
        this.f$4 = i;
        this.f$5 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = AssetHomeEditNavActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
