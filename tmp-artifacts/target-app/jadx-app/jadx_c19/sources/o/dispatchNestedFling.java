package o;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface dispatchNestedFling {
    void IAuthTabCallback(@NonNull dispatchNestedPreScroll dispatchnestedprescroll);

    void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult);

    void onExtraCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult);

    void onExtraCallbackWithResult(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged);

    void onWarmupCompleted(@NonNull dispatchNestedPreScroll dispatchnestedprescroll);

    void onWarmupCompleted(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged);

    void onWarmupCompleted(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest);
}
