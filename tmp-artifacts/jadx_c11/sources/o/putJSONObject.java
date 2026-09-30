package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class putJSONObject {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static final putJSONObjectIfValid onExtraCallback(@Nullable Object obj, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 1;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        Object obj2 = null;
        if ((i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            int i7 = i5 + 39;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            function2 = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-206774486, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.payment.rememberTdsAgreementV4PaymentState (TdsPaymentAgreementScreenContentState.kt:22)");
            int i8 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new putObject(function2);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        putObject putobject = (putObject) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return putobject;
    }
}
