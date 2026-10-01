package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda10 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.asBinder((useAndConfigureProgramWithTexture) obj);
        int i5 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitAsBinder;
    }
}
