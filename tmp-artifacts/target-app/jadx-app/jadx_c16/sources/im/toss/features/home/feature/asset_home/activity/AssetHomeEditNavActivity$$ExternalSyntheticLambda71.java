package im.toss.features.home.feature.asset_home.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.GlobalInfoRecorderUtils;
import o.getKekid;
import o.isGenie$onTransact;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda71 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;
    public final /* synthetic */ isGenie$onTransact f$2;
    public final /* synthetic */ GlobalInfoRecorderUtils f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda71(AssetHomeEditNavActivity assetHomeEditNavActivity, setParentLayoutDirection setparentlayoutdirection, isGenie$onTransact isgenie_ontransact, GlobalInfoRecorderUtils globalInfoRecorderUtils, int i, int i2) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = setparentlayoutdirection;
        this.f$2 = isgenie_ontransact;
        this.f$3 = globalInfoRecorderUtils;
        this.f$4 = i;
        this.f$5 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unit = (Unit) AssetHomeEditNavActivity.onExtraCallbackWithResult(getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[]{this.f$0, this.f$1, this.f$2, this.f$3, Integer.valueOf(this.f$4), Integer.valueOf(this.f$5), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, -566964060, getKekid.onExtraCallback(), getKekid.onExtraCallback(), 566964088);
            int i3 = 68 / 0;
        } else {
            unit = (Unit) AssetHomeEditNavActivity.onExtraCallbackWithResult(getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[]{this.f$0, this.f$1, this.f$2, this.f$3, Integer.valueOf(this.f$4), Integer.valueOf(this.f$5), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, -566964060, getKekid.onExtraCallback(), getKekid.onExtraCallback(), 566964088);
        }
        int i4 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
