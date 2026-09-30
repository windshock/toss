package im.toss.features.mobileid.impl.qr;

import android.hardware.Camera;
import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdQrCodeScanner$$ExternalSyntheticLambda2 implements OnFailureListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ MobileIdQrCodeScanner f$0;
    public final /* synthetic */ Camera f$1;

    public /* synthetic */ MobileIdQrCodeScanner$$ExternalSyntheticLambda2(MobileIdQrCodeScanner mobileIdQrCodeScanner, Camera camera) {
        this.f$0 = mobileIdQrCodeScanner;
        this.f$1 = camera;
    }

    public final void onFailure(Exception exc) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        MobileIdQrCodeScanner.IAuthTabCallback(this.f$0, this.f$1, exc);
        int i4 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
