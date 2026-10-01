package im.toss.features.kyc.overseas.selectcountry;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SelectCountryActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ SelectCountryActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
            return (Unit) SelectCountryActivity.onWarmupCompleted(711632710, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -711632710, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr);
        }
        Object[] objArr2 = {this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        int i3 = 40 / 0;
        return (Unit) SelectCountryActivity.onWarmupCompleted(711632710, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -711632710, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr2);
    }
}
