package im.toss.features.mobileid.impl.view;

import com.tmoney.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonDeleteWalletErrorActivity$$ExternalSyntheticLambda4 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ MobileIdCommonDeleteWalletErrorActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ MobileIdCommonDeleteWalletErrorActivity$$ExternalSyntheticLambda4(MobileIdCommonDeleteWalletErrorActivity mobileIdCommonDeleteWalletErrorActivity, String str, String str2, int i) {
        this.f$0 = mobileIdCommonDeleteWalletErrorActivity;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            MobileIdCommonDeleteWalletErrorActivity mobileIdCommonDeleteWalletErrorActivity = this.f$0;
            String str = this.f$1;
            String str2 = this.f$2;
            int i3 = this.f$3;
            int iIntValue = ((Integer) obj2).intValue();
            return (Unit) MobileIdCommonDeleteWalletErrorActivity.onWarmupCompleted(a.3.onWarmupCompleted(), new Object[]{mobileIdCommonDeleteWalletErrorActivity, str, str2, Integer.valueOf(i3), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 938479399, a.3.onWarmupCompleted(), -938479394);
        }
        MobileIdCommonDeleteWalletErrorActivity mobileIdCommonDeleteWalletErrorActivity2 = this.f$0;
        String str3 = this.f$1;
        String str4 = this.f$2;
        int i4 = this.f$3;
        int iIntValue2 = ((Integer) obj2).intValue();
        throw null;
    }
}
