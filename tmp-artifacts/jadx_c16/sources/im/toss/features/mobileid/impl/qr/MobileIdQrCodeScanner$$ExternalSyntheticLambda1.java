package im.toss.features.mobileid.impl.qr;

import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdQrCodeScanner$$ExternalSyntheticLambda1 implements OnSuccessListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ Function1 f$0;

    public final void onSuccess(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            MobileIdQrCodeScanner.IAuthTabCallback(this.f$0, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        MobileIdQrCodeScanner.IAuthTabCallback(this.f$0, obj);
        int i3 = onExtraCallbackWithResult + 59;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
