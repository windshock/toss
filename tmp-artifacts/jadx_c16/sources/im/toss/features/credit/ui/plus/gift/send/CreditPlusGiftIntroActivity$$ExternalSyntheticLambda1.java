package im.toss.features.credit.ui.plus.gift.send;

import im.toss.features.credit.data.response.DisclaimerV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftIntroActivity$$ExternalSyntheticLambda1 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ DisclaimerV2 f$0;
    public final /* synthetic */ CreditPlusGiftIntroActivity f$1;

    public /* synthetic */ CreditPlusGiftIntroActivity$$ExternalSyntheticLambda1(DisclaimerV2 disclaimerV2, CreditPlusGiftIntroActivity creditPlusGiftIntroActivity) {
        this.f$0 = disclaimerV2;
        this.f$1 = creditPlusGiftIntroActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = CreditPlusGiftIntroActivity.onWarmupCompleted(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
