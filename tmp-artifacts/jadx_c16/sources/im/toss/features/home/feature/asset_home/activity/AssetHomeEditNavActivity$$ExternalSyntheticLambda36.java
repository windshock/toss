package im.toss.features.home.feature.asset_home.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.GlobalInfoRecorderUtils;
import o.isGenie$onWarmupCompleted;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda36 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;
    public final /* synthetic */ isGenie$onWarmupCompleted f$2;
    public final /* synthetic */ GlobalInfoRecorderUtils f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda36(AssetHomeEditNavActivity assetHomeEditNavActivity, setParentLayoutDirection setparentlayoutdirection, isGenie$onWarmupCompleted isgenie_onwarmupcompleted, GlobalInfoRecorderUtils globalInfoRecorderUtils, int i, int i2) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = setparentlayoutdirection;
        this.f$2 = isgenie_onwarmupcompleted;
        this.f$3 = globalInfoRecorderUtils;
        this.f$4 = i;
        this.f$5 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return AssetHomeEditNavActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        Unit unitOnWarmupCompleted = AssetHomeEditNavActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = 73 / 0;
        return unitOnWarmupCompleted;
    }
}
