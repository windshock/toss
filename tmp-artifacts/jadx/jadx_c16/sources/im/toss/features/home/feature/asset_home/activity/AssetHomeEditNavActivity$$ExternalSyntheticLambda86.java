package im.toss.features.home.feature.asset_home.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.GlobalInfoRecorderUtils;
import o.isGenie$onExtraCallback;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda86 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;
    public final /* synthetic */ isGenie$onExtraCallback f$2;
    public final /* synthetic */ GlobalInfoRecorderUtils f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda86(AssetHomeEditNavActivity assetHomeEditNavActivity, setParentLayoutDirection setparentlayoutdirection, isGenie$onExtraCallback isgenie_onextracallback, GlobalInfoRecorderUtils globalInfoRecorderUtils, int i, int i2) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = setparentlayoutdirection;
        this.f$2 = isgenie_onextracallback;
        this.f$3 = globalInfoRecorderUtils;
        this.f$4 = i;
        this.f$5 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            AssetHomeEditNavActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = AssetHomeEditNavActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onNavigationEvent + 1;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
