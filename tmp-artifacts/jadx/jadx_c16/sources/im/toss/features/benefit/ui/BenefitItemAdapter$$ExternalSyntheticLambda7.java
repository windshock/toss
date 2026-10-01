package im.toss.features.benefit.ui;

import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.enableRotationVector;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ BenefitActivationIntelligence.Type3 f$0;
    public final /* synthetic */ enableRotationVector f$1;

    public /* synthetic */ BenefitItemAdapter$$ExternalSyntheticLambda7(BenefitActivationIntelligence.Type3 type3, enableRotationVector enablerotationvector) {
        this.f$0 = type3;
        this.f$1 = enablerotationvector;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = getNameByOperatorName.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onExtraCallback + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
