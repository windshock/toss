package im.toss.features.benefit.ui;

import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getNameByOperatorName;
import o.setNode;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda10 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ BenefitActivationIntelligence.Type2 f$0;
    public final /* synthetic */ setNode f$1;

    public /* synthetic */ BenefitItemAdapter$$ExternalSyntheticLambda10(BenefitActivationIntelligence.Type2 type2, setNode setnode) {
        this.f$0 = type2;
        this.f$1 = setnode;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        BenefitActivationIntelligence.Type2 type2 = this.f$0;
        if (i3 == 0) {
            return getNameByOperatorName.onExtraCallbackWithResult(type2, this.f$1, (SetDetectableSize) obj);
        }
        Unit unitOnExtraCallbackWithResult = getNameByOperatorName.onExtraCallbackWithResult(type2, this.f$1, (SetDetectableSize) obj);
        int i4 = 60 / 0;
        return unitOnExtraCallbackWithResult;
    }
}
