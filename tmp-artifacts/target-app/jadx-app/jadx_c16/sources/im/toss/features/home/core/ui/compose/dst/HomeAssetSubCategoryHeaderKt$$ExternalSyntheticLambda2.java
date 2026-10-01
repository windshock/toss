package im.toss.features.home.core.ui.compose.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBridgeExtensionNew;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetSubCategoryHeaderKt$$ExternalSyntheticLambda2 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitIAuthTabCallback = getBridgeExtensionNew.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 25 / 0;
        } else {
            unitIAuthTabCallback = getBridgeExtensionNew.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = IAuthTabCallback + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
