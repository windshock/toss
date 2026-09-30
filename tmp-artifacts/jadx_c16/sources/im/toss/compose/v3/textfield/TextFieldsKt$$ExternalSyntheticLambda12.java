package im.toss.compose.v3.textfield;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setDefaultFontFileExtension;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TextFieldsKt$$ExternalSyntheticLambda12 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = setDefaultFontFileExtension.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return unitOnExtraCallback;
    }
}
