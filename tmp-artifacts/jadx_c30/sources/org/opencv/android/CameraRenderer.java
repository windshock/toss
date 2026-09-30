package org.opencv.android;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import net.sf.scuba.smartcards.BuildConfig;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class CameraRenderer extends CameraGLRendererBase {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 6708646642776917434L;
    public static final String LOGTAG = "CameraRenderer";
    private Camera mCamera;
    private boolean mPreviewStarted;

    CameraRenderer(CameraGLSurfaceView cameraGLSurfaceView) {
        super(cameraGLSurfaceView);
        this.mPreviewStarted = false;
    }

    @Override // org.opencv.android.CameraGLRendererBase
    protected void closeCamera() {
        synchronized (this) {
            Camera camera = this.mCamera;
            if (camera != null) {
                camera.stopPreview();
                this.mPreviewStarted = false;
                this.mCamera.release();
                this.mCamera = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0076 A[Catch: all -> 0x00a6, EDGE_INSN: B:76:0x0076->B:44:0x0076 BREAK  A[LOOP:2: B:13:0x0019->B:20:0x002d], TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:6:0x0009, B:10:0x0014, B:13:0x0019, B:15:0x001f, B:20:0x002d, B:18:0x0028, B:44:0x0076, B:48:0x007c, B:50:0x0086, B:52:0x008e, B:53:0x0093, B:54:0x0098, B:57:0x00a1, B:21:0x0030, B:23:0x0038, B:24:0x003d, B:26:0x0043, B:29:0x004b, B:40:0x006b, B:43:0x0073, B:31:0x0050, B:32:0x0055, B:34:0x005b, B:9:0x0011), top: B:69:0x0001, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c A[Catch: all -> 0x00a6, TRY_ENTER, TryCatch #3 {, blocks: (B:3:0x0001, B:6:0x0009, B:10:0x0014, B:13:0x0019, B:15:0x001f, B:20:0x002d, B:18:0x0028, B:44:0x0076, B:48:0x007c, B:50:0x0086, B:52:0x008e, B:53:0x0093, B:54:0x0098, B:57:0x00a1, B:21:0x0030, B:23:0x0038, B:24:0x003d, B:26:0x0043, B:29:0x004b, B:40:0x006b, B:43:0x0073, B:31:0x0050, B:32:0x0055, B:34:0x005b, B:9:0x0011), top: B:69:0x0001, inners: #0, #1, #2, #4 }] */
    @Override // org.opencv.android.CameraGLRendererBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void openCamera(int i) {
        Camera camera;
        synchronized (this) {
            closeCamera();
            int i2 = 0;
            if (i == -1) {
                try {
                    this.mCamera = Camera.open();
                } catch (Exception e) {
                    e.getLocalizedMessage();
                }
                if (this.mCamera == null) {
                    boolean z = false;
                    while (i2 < Camera.getNumberOfCameras()) {
                        try {
                            this.mCamera = Camera.open(i2);
                            z = true;
                        } catch (RuntimeException e2) {
                            e2.getLocalizedMessage();
                        }
                        if (z) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    camera = this.mCamera;
                    if (camera != null) {
                        return;
                    }
                    Camera.Parameters parameters = camera.getParameters();
                    List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                    if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                        parameters.setFocusMode("continuous-video");
                    }
                    this.mCamera.setParameters(parameters);
                    try {
                        this.mCamera.setPreviewTexture(this.mSTexture);
                    } catch (IOException e3) {
                        e3.getMessage();
                    }
                    return;
                }
                camera = this.mCamera;
                if (camera != null) {
                }
            } else {
                int i3 = this.mCameraIndex;
                if (i3 == 99) {
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    while (i2 < Camera.getNumberOfCameras()) {
                        Camera.getCameraInfo(i2, cameraInfo);
                        if (cameraInfo.facing == 0) {
                            i3 = i2;
                            break;
                        }
                        i2++;
                    }
                    if (i3 == 99 && i3 != 98) {
                        try {
                            this.mCamera = Camera.open(i3);
                        } catch (RuntimeException e4) {
                            e4.getLocalizedMessage();
                        }
                        camera = this.mCamera;
                        if (camera != null) {
                        }
                    }
                } else {
                    if (i3 == 98) {
                        Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                        while (i2 < Camera.getNumberOfCameras()) {
                            Camera.getCameraInfo(i2, cameraInfo2);
                            if (cameraInfo2.facing == 1) {
                                i3 = i2;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (i3 == 99) {
                        camera = this.mCamera;
                        if (camera != null) {
                        }
                    }
                }
            }
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 77;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 24 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() | (IAuthTabCallback % 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 59 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 24 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), KeyEvent.normalizeMetaState(0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                    try {
                        Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 60, TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 59 - View.combineMeasuredStates(0, 0), 6383 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        String str = new String(cArr2);
        int i6 = $11 + 23;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    @Override // org.opencv.android.CameraGLRendererBase
    public void setCameraPreviewSize(int i, int i2) {
        synchronized (this) {
            Camera camera = this.mCamera;
            if (camera == null) {
                return;
            }
            int i3 = this.mMaxCameraWidth;
            if (i3 > 0 && i3 < i) {
                i = i3;
            }
            int i4 = this.mMaxCameraHeight;
            if (i4 > 0 && i4 < i2) {
                i2 = i4;
            }
            Camera.Parameters parameters = camera.getParameters();
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            if (supportedPreviewSizes.size() > 0) {
                float f = i / i2;
                int i5 = 0;
                int i6 = 0;
                for (Camera.Size size : supportedPreviewSizes) {
                    int i7 = size.width;
                    int i8 = size.height;
                    if (i7 <= i && i8 <= i2 && i7 >= i5 && i8 >= i6 && Math.abs(f - (i7 / i8)) < 0.2d) {
                        i6 = i8;
                        i5 = i7;
                    }
                }
                if (i5 <= 0 || i6 <= 0) {
                    i5 = supportedPreviewSizes.get(0).width;
                    i6 = supportedPreviewSizes.get(0).height;
                }
                if (this.mPreviewStarted) {
                    this.mCamera.stopPreview();
                    this.mPreviewStarted = false;
                }
                this.mCameraWidth = i5;
                this.mCameraHeight = i6;
                parameters.setPreviewSize(i5, i6);
            }
            Object[] objArr = new Object[1];
            a(new char[]{16610, 53172, 24178, 60681, 32207, 35982, 6958, 44020, 15036, 18753, 55309}, (-16740533) - Color.rgb(0, 0, 0), objArr);
            parameters.set(((String) objArr[0]).intern(), "landscape");
            this.mCamera.setParameters(parameters);
            this.mCamera.startPreview();
            this.mPreviewStarted = true;
        }
    }
}
