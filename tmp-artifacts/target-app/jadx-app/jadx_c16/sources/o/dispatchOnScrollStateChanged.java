package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface dispatchOnScrollStateChanged {
    void IAuthTabCallback(@NonNull dispatchNestedFling dispatchnestedfling);

    void IAuthTabCallback(@NonNull dispatchNestedFling dispatchnestedfling, @NonNull CaptureRequest.Builder builder) throws CameraAccessException;

    void IAuthTabCallbackStub(@NonNull dispatchNestedFling dispatchnestedfling);

    CameraCharacteristics onExtraCallback(@NonNull dispatchNestedFling dispatchnestedfling);

    CaptureRequest.Builder onExtraCallbackWithResult(@NonNull dispatchNestedFling dispatchnestedfling);

    void onNavigationEvent(@NonNull dispatchNestedFling dispatchnestedfling);

    TotalCaptureResult onWarmupCompleted(@NonNull dispatchNestedFling dispatchnestedfling);
}
