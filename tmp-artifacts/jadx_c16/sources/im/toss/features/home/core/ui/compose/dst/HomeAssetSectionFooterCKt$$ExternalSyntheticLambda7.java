package im.toss.features.home.core.ui.compose.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DefaultExtensionManager;
import o.ZipUtils;
import o.getThis;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetSectionFooterCKt$$ExternalSyntheticLambda7 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ getThis.onExtraCallbackWithResult f$0;
    public final /* synthetic */ ZipUtils f$1;

    public /* synthetic */ HomeAssetSectionFooterCKt$$ExternalSyntheticLambda7(getThis.onExtraCallbackWithResult onextracallbackwithresult, ZipUtils zipUtils) {
        this.f$0 = onextracallbackwithresult;
        this.f$1 = zipUtils;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = DefaultExtensionManager.onExtraCallbackWithResult(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
