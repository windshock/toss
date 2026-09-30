package im.toss.features.benefit.ui;

import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getNameByOperatorName;
import o.stopDeviceMotionListening;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ BenefitActivationIntelligence.Type1 f$0;
    public final /* synthetic */ stopDeviceMotionListening f$1;

    public /* synthetic */ BenefitItemAdapter$$ExternalSyntheticLambda9(BenefitActivationIntelligence.Type1 type1, stopDeviceMotionListening stopdevicemotionlistening) {
        this.f$0 = type1;
        this.f$1 = stopdevicemotionlistening;
    }

    public final Object invoke(Object obj) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnWarmupCompleted = getNameByOperatorName.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
            int i3 = 64 / 0;
        } else {
            unitOnWarmupCompleted = getNameByOperatorName.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
        }
        int i4 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
