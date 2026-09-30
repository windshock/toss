package o;

import android.hardware.Camera;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class isIsInit {
    public static int onWarmupCompleted() {
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i = -1;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i >= numberOfCameras) {
                return i4;
            }
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 0) {
                return i;
            }
            i2 = i + 1;
        }
    }

    public static Camera onExtraCallback(int i) {
        try {
            if (i == -1) {
                return Camera.open();
            }
            return Camera.open(i);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean onExtraCallback(Camera camera) {
        List<String> supportedFlashModes;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.getFlashMode() != null && (supportedFlashModes = parameters.getSupportedFlashModes()) != null && !supportedFlashModes.isEmpty() && (supportedFlashModes.size() != 1 || !supportedFlashModes.get(0).equals("off"))) {
                return true;
            }
        }
        return false;
    }
}
