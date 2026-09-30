package im.toss.features.home.ui.view.asset.edit.v2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditV2Activity$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AssetHomeEditV2Activity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AssetHomeEditV2Activity assetHomeEditV2Activity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        if (i3 != 0) {
            return AssetHomeEditV2Activity.onNavigationEvent(assetHomeEditV2Activity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        }
        Unit unitOnNavigationEvent = AssetHomeEditV2Activity.onNavigationEvent(assetHomeEditV2Activity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        int i4 = 11 / 0;
        return unitOnNavigationEvent;
    }
}
