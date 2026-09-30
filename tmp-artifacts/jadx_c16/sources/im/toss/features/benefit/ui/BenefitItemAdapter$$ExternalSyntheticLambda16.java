package im.toss.features.benefit.ui;

import android.content.Context;
import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getNameByOperatorName;
import o.stopDeviceMotionListening;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda16 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ BenefitActivationIntelligence.Type1 f$0;
    public final /* synthetic */ getNameByOperatorName f$1;
    public final /* synthetic */ Context f$2;
    public final /* synthetic */ stopDeviceMotionListening f$3;

    public /* synthetic */ BenefitItemAdapter$$ExternalSyntheticLambda16(BenefitActivationIntelligence.Type1 type1, getNameByOperatorName getnamebyoperatorname, Context context, stopDeviceMotionListening stopdevicemotionlistening) {
        this.f$0 = type1;
        this.f$1 = getnamebyoperatorname;
        this.f$2 = context;
        this.f$3 = stopdevicemotionlistening;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = getNameByOperatorName.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, (BenefitActivationIntelligence.Type1) obj);
        int i4 = IAuthTabCallback + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
