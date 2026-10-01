package im.toss.features.benefit.ui.data;

import kotlin.jvm.functions.Function1;
import o.DeviceOrientationBridgeExtension;
import o.SensorBridgeExtension3;
import o.UtilsKtExternalSyntheticLambda17;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BankCardCashbackItem$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        Boolean boolValueOf = Boolean.valueOf(((Boolean) DeviceOrientationBridgeExtension.onNavigationEvent(-1558324386, new Object[]{(SensorBridgeExtension3) obj}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1558324386, iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult())).booleanValue());
        int i4 = onWarmupCompleted + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
