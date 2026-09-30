package im.toss.ads_sdk.ui.v2.activity;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ NativeAdsShortVideoV2Activity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), 222371131, new Object[]{this.f$0, (NativeAdsEventLogType) obj}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -222371128, C40Encoder.onExtraCallback());
        int i4 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
