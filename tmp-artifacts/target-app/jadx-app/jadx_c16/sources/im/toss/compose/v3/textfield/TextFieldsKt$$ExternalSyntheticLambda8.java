package im.toss.compose.v3.textfield;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setDefaultFontFileExtension;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TextFieldsKt$$ExternalSyntheticLambda8 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            setDefaultFontFileExtension.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            throw null;
        }
        Unit unitOnNavigationEvent = setDefaultFontFileExtension.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = IAuthTabCallback + 49;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 56 / 0;
        }
        return unitOnNavigationEvent;
    }
}
