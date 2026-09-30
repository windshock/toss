package im.toss.features.home.feature.home_asset.edit;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditV2Activity$$ExternalSyntheticLambda1 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ HomeAssetEditV2Activity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallback = i2 % 128;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            HomeAssetEditV2Activity.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            obj3.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = HomeAssetEditV2Activity.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onNavigationEvent + 75;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
