package o;

import android.hardware.Camera;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class reportPvFromBackGround {
    public final Camera IAuthTabCallback;
    public final int onExtraCallback;

    private reportPvFromBackGround(@NonNull Camera camera, int i) {
        if (camera == null) {
            throw new NullPointerException("Camera cannot be null");
        }
        this.IAuthTabCallback = camera;
        this.onExtraCallback = i;
    }

    public static reportPvFromBackGround IAuthTabCallback(Camera camera, int i) {
        if (camera == null) {
            return null;
        }
        return new reportPvFromBackGround(camera, i);
    }
}
