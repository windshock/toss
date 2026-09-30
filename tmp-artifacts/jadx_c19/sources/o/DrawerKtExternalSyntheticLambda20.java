package o;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda20 implements SensorEventListener {
    private final onWarmupCompleted[] IAuthTabCallback;
    private final Display onNavigationEvent;
    private boolean onTransact;
    private final float[] onExtraCallback = new float[16];
    private final float[] asInterface = new float[16];
    private final float[] onExtraCallbackWithResult = new float[16];
    private final float[] onWarmupCompleted = new float[3];

    public interface onWarmupCompleted {
        void onWarmupCompleted(float[] fArr, float f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public DrawerKtExternalSyntheticLambda20(Display display, onWarmupCompleted... onwarmupcompletedArr) {
        this.onNavigationEvent = display;
        this.IAuthTabCallback = onwarmupcompletedArr;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.onExtraCallback, sensorEvent.values);
        IAuthTabCallback(this.onExtraCallback, this.onNavigationEvent.getRotation());
        float fOnExtraCallback = onExtraCallback(this.onExtraCallback);
        IAuthTabCallback(this.onExtraCallback);
        onNavigationEvent(this.onExtraCallback);
        onExtraCallbackWithResult(this.onExtraCallback, fOnExtraCallback);
    }

    private void onExtraCallbackWithResult(float[] fArr, float f) {
        for (onWarmupCompleted onwarmupcompleted : this.IAuthTabCallback) {
            onwarmupcompleted.onWarmupCompleted(fArr, f);
        }
    }

    private void onNavigationEvent(float[] fArr) {
        if (!this.onTransact) {
            DrawerKtExternalSyntheticLambda21.IAuthTabCallback(this.onExtraCallbackWithResult, fArr);
            this.onTransact = true;
        }
        float[] fArr2 = this.asInterface;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.asInterface, 0, this.onExtraCallbackWithResult, 0);
    }

    private float onExtraCallback(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.asInterface);
        SensorManager.getOrientation(this.asInterface, this.onWarmupCompleted);
        return this.onWarmupCompleted[2];
    }

    private void IAuthTabCallback(float[] fArr, int i2) {
        if (i2 != 0) {
            int i3 = 2;
            int i4 = 129;
            if (i2 != 1) {
                if (i2 == 2) {
                    i3 = 129;
                    i4 = 130;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    i4 = 1;
                    i3 = 130;
                }
            }
            float[] fArr2 = this.asInterface;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.asInterface, i3, i4, fArr);
        }
    }

    private static void IAuthTabCallback(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }
}
