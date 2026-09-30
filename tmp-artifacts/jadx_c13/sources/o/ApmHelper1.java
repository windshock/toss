package o;

import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import me.dm7.barcodescanner.core.BarcodeScannerView;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ApmHelper1 extends HandlerThread {
    private BarcodeScannerView onExtraCallback;

    public ApmHelper1(BarcodeScannerView barcodeScannerView) {
        super("CameraHandlerThread");
        this.onExtraCallback = barcodeScannerView;
        start();
    }

    public void IAuthTabCallback(final int i) {
        new Handler(getLooper()).post(new Runnable() { // from class: o.ApmHelper1.1
            @Override // java.lang.Runnable
            public void run() {
                final Camera cameraOnExtraCallback = isIsInit.onExtraCallback(i);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.ApmHelper1.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ApmHelper1.this.onExtraCallback.setupCameraPreview(reportPvFromBackGround.IAuthTabCallback(cameraOnExtraCallback, i));
                    }
                });
            }
        });
    }
}
