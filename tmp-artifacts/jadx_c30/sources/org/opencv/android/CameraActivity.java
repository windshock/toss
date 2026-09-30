package org.opencv.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class CameraActivity extends Activity {
    private static final int CAMERA_PERMISSION_REQUEST_CODE = 200;

    protected List<? extends CameraBridgeViewBase> getCameraViewList() {
        return new ArrayList();
    }

    protected void onCameraPermissionGranted() {
        List<? extends CameraBridgeViewBase> cameraViewList = getCameraViewList();
        if (cameraViewList != null) {
            for (CameraBridgeViewBase cameraBridgeViewBase : cameraViewList) {
                if (cameraBridgeViewBase != null) {
                    cameraBridgeViewBase.setCameraPermissionGranted();
                }
            }
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (checkSelfPermission("android.permission.CAMERA") != 0) {
            requestPermissions(new String[]{"android.permission.CAMERA"}, 200);
        } else {
            onCameraPermissionGranted();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 200 && iArr.length > 0 && iArr[0] == 0) {
            onCameraPermissionGranted();
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
