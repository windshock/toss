package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.DrawerKtExternalSyntheticLambda0;
import o.DrawerKtExternalSyntheticLambda17;
import o.DrawerKtExternalSyntheticLambda20;
import o.DrawerKtExternalSyntheticLambda22;
import o.DrawerKtExternalSyntheticLambda26;
import o.RecordingInputConnection_androidKt;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {
    private final Sensor IAuthTabCallback;
    private final SensorManager IAuthTabCallbackDefault;
    private final DrawerKtExternalSyntheticLambda26 IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private final CopyOnWriteArrayList<onExtraCallbackWithResult> access100;
    private SurfaceTexture asBinder;
    private Surface asInterface;
    private final DrawerKtExternalSyntheticLambda20 onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final Handler onNavigationEvent;
    private final DrawerKtExternalSyntheticLambda22 onTransact;
    private boolean onWarmupCompleted;

    public interface onExtraCallbackWithResult {
        void IAuthTabCallback(Surface surface);

        void onWarmupCompleted(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SphericalGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.access100 = new CopyOnWriteArrayList<>();
        this.onNavigationEvent = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) RecordingInputConnection_androidKt.onExtraCallbackWithResult(context.getSystemService("sensor"));
        this.IAuthTabCallbackDefault = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.IAuthTabCallback = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        DrawerKtExternalSyntheticLambda22 drawerKtExternalSyntheticLambda22 = new DrawerKtExternalSyntheticLambda22();
        this.onTransact = drawerKtExternalSyntheticLambda22;
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this, drawerKtExternalSyntheticLambda22);
        DrawerKtExternalSyntheticLambda26 drawerKtExternalSyntheticLambda26 = new DrawerKtExternalSyntheticLambda26(context, iAuthTabCallback, 25.0f);
        this.IAuthTabCallbackStub = drawerKtExternalSyntheticLambda26;
        this.onExtraCallback = new DrawerKtExternalSyntheticLambda20(((WindowManager) RecordingInputConnection_androidKt.onExtraCallbackWithResult((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), drawerKtExternalSyntheticLambda26, iAuthTabCallback);
        this.IAuthTabCallbackStubProxy = true;
        setEGLContextClientVersion(2);
        setRenderer(iAuthTabCallback);
        setOnTouchListener(drawerKtExternalSyntheticLambda26);
    }

    public void onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult) {
        this.access100.add(onextracallbackwithresult);
    }

    public void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult) {
        this.access100.remove(onextracallbackwithresult);
    }

    public Surface onNavigationEvent() {
        return this.asInterface;
    }

    public DrawerKtExternalSyntheticLambda0 onExtraCallback() {
        return this.onTransact;
    }

    public DrawerKtExternalSyntheticLambda17 IAuthTabCallback() {
        return this.onTransact;
    }

    public void setDefaultStereoMode(int i2) {
        this.onTransact.onWarmupCompleted(i2);
    }

    public void setUseSensorRotation(boolean z) {
        this.IAuthTabCallbackStubProxy = z;
        onWarmupCompleted();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.onWarmupCompleted = true;
        onWarmupCompleted();
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.onWarmupCompleted = false;
        onWarmupCompleted();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.onNavigationEvent.post(new Runnable() { // from class: androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView.onExtraCallback(this.f$0);
            }
        });
    }

    public static /* synthetic */ void onExtraCallback(SphericalGLSurfaceView sphericalGLSurfaceView) {
        Surface surface = sphericalGLSurfaceView.asInterface;
        if (surface != null) {
            Iterator<onExtraCallbackWithResult> it = sphericalGLSurfaceView.access100.iterator();
            while (it.hasNext()) {
                it.next().onWarmupCompleted(surface);
            }
        }
        onExtraCallback(sphericalGLSurfaceView.asBinder, surface);
        sphericalGLSurfaceView.asBinder = null;
        sphericalGLSurfaceView.asInterface = null;
    }

    private void onWarmupCompleted() {
        boolean z = this.IAuthTabCallbackStubProxy && this.onWarmupCompleted;
        Sensor sensor = this.IAuthTabCallback;
        if (sensor == null || z == this.onExtraCallbackWithResult) {
            return;
        }
        if (z) {
            this.IAuthTabCallbackDefault.registerListener(this.onExtraCallback, sensor, 0);
        } else {
            this.IAuthTabCallbackDefault.unregisterListener(this.onExtraCallback);
        }
        this.onExtraCallbackWithResult = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWarmupCompleted(SurfaceTexture surfaceTexture) {
        this.onNavigationEvent.post(new SphericalGLSurfaceView$.ExternalSyntheticLambda1(this, surfaceTexture));
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SphericalGLSurfaceView sphericalGLSurfaceView, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.asBinder;
        Surface surface = sphericalGLSurfaceView.asInterface;
        Surface surface2 = new Surface(surfaceTexture);
        sphericalGLSurfaceView.asBinder = surfaceTexture;
        sphericalGLSurfaceView.asInterface = surface2;
        Iterator<onExtraCallbackWithResult> it = sphericalGLSurfaceView.access100.iterator();
        while (it.hasNext()) {
            it.next().IAuthTabCallback(surface2);
        }
        onExtraCallback(surfaceTexture2, surface);
    }

    private static void onExtraCallback(@Nullable SurfaceTexture surfaceTexture, @Nullable Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
