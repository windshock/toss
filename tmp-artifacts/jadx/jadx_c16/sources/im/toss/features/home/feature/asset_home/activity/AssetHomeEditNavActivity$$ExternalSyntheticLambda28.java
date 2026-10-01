package im.toss.features.home.feature.asset_home.activity;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.GlobalInfoRecorderUtils;
import o.isGenie$IAuthTabCallback;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda28 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ isGenie$IAuthTabCallback f$1;
    public final /* synthetic */ GlobalInfoRecorderUtils f$2;
    public final /* synthetic */ setParentLayoutDirection f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda28(AssetHomeEditNavActivity assetHomeEditNavActivity, isGenie$IAuthTabCallback isgenie_iauthtabcallback, GlobalInfoRecorderUtils globalInfoRecorderUtils, setParentLayoutDirection setparentlayoutdirection, int i, int i2) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = isgenie_iauthtabcallback;
        this.f$2 = globalInfoRecorderUtils;
        this.f$3 = setparentlayoutdirection;
        this.f$4 = i;
        this.f$5 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return AssetHomeEditNavActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        AssetHomeEditNavActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
