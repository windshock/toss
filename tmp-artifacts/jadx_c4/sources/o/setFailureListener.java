package o;

import androidx.compose.foundation.layout.RowScope;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface setFailureListener {
    default void IAuthTabCallback(@NotNull RowScope rowScope, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1948846564);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1948846564, i, -1, "im.toss.compose.v3.textfield.split.SplitTextFieldItem.Content (SplitTextFields.kt:98)");
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
    }
}
