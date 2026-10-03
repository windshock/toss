package o;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.content.ContextCompat;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class DSAParameter {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onWarmupCompleted = 8;
    private final float[] onExtraCallback = new float[3];
    private final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
    private final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();

    public abstract void onExtraCallbackWithResult(float f, float f2, float f3);

    public static final class IAuthTabCallback implements SensorEventListener {
        private final float[] onExtraCallback = new float[16];

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            Intrinsics.checkNotNullParameter(sensor, "");
        }

        IAuthTabCallback() {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            Intrinsics.checkNotNullParameter(sensorEvent, "");
            if (sensorEvent.sensor.getType() == 11) {
                SensorManager.getRotationMatrixFromVector(this.onExtraCallback, sensorEvent.values);
                DSAParameter.this.onExtraCallbackWithResult(this.onExtraCallback);
            }
        }
    }

    public static final class onWarmupCompleted implements SensorEventListener {
        private float[] IAuthTabCallback;
        private final float[] onExtraCallback = new float[9];
        private float[] onWarmupCompleted;

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            Intrinsics.checkNotNullParameter(sensor, "");
        }

        onWarmupCompleted() {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr;
            Intrinsics.checkNotNullParameter(sensorEvent, "");
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                this.IAuthTabCallback = sensorEvent.values;
            } else if (type != 2) {
                return;
            } else {
                this.onWarmupCompleted = sensorEvent.values;
            }
            float[] fArr2 = this.IAuthTabCallback;
            if (fArr2 == null || (fArr = this.onWarmupCompleted) == null) {
                return;
            }
            SensorManager.getRotationMatrix(this.onExtraCallback, null, fArr2, fArr);
            DSAParameter.this.onExtraCallbackWithResult(this.onExtraCallback);
        }
    }

    public final void onWarmupCompleted(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        SensorManager sensorManagerIAuthTabCallback = IAuthTabCallback(context);
        if (sensorManagerIAuthTabCallback == null || onNavigationEvent(sensorManagerIAuthTabCallback)) {
            return;
        }
        onWarmupCompleted(sensorManagerIAuthTabCallback);
    }

    private final boolean onNavigationEvent(SensorManager sensorManager) {
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (defaultSensor == null) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "OrientationAnglesListener", "TYPE_ROTATION_VECTOR sensor is not supported.", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            return false;
        }
        sensorManager.registerListener(this.onNavigationEvent, defaultSensor, 2);
        return true;
    }

    private final boolean onWarmupCompleted(SensorManager sensorManager) {
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        if (defaultSensor == null) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "OrientationAnglesListener", "TYPE_ACCELEROMETER sensor is not supported.", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            return false;
        }
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(2);
        if (defaultSensor2 == null) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "OrientationAnglesListener", "TYPE_MAGNETIC_FIELD sensor is not supported.", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            return false;
        }
        sensorManager.registerListener(this.IAuthTabCallback, defaultSensor, 2);
        sensorManager.registerListener(this.IAuthTabCallback, defaultSensor2, 2);
        return true;
    }

    public final void onNavigationEvent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        SensorManager sensorManagerIAuthTabCallback = IAuthTabCallback(context);
        if (sensorManagerIAuthTabCallback != null) {
            sensorManagerIAuthTabCallback.unregisterListener(this.onNavigationEvent);
            sensorManagerIAuthTabCallback.unregisterListener(this.IAuthTabCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallbackWithResult(float[] fArr) {
        SensorManager.getOrientation(fArr, this.onExtraCallback);
        float[] fArr2 = this.onExtraCallback;
        onExtraCallbackWithResult(fArr2[0], fArr2[1], fArr2[2]);
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private final SensorManager IAuthTabCallback(Context context) {
        return (SensorManager) ContextCompat.getSystemService(context, SensorManager.class);
    }
}
