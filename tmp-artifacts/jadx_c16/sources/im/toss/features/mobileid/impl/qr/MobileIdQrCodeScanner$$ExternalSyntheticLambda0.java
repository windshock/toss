package im.toss.features.mobileid.impl.qr;

import android.hardware.Camera;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdQrCodeScanner$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ MobileIdQrCodeScanner f$0;
    public final /* synthetic */ Camera f$1;

    public /* synthetic */ MobileIdQrCodeScanner$$ExternalSyntheticLambda0(MobileIdQrCodeScanner mobileIdQrCodeScanner, Camera camera) {
        this.f$0 = mobileIdQrCodeScanner;
        this.f$1 = camera;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        MobileIdQrCodeScanner mobileIdQrCodeScanner = this.f$0;
        if (i3 != 0) {
            return MobileIdQrCodeScanner.onWarmupCompleted(mobileIdQrCodeScanner, this.f$1, (List) obj);
        }
        Unit unitOnWarmupCompleted = MobileIdQrCodeScanner.onWarmupCompleted(mobileIdQrCodeScanner, this.f$1, (List) obj);
        int i4 = 13 / 0;
        return unitOnWarmupCompleted;
    }
}
