package im.toss.features.benefit.ui;

import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import kotlin.jvm.functions.Function0;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ BenefitActivationIntelligence.Type2 f$0;
    public final /* synthetic */ getNameByOperatorName f$1;

    public /* synthetic */ BenefitItemAdapter$$ExternalSyntheticLambda4(BenefitActivationIntelligence.Type2 type2, getNameByOperatorName getnamebyoperatorname) {
        this.f$0 = type2;
        this.f$1 = getnamebyoperatorname;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BenefitActivationIntelligence.Type2 type2 = this.f$0;
        if (i3 == 0) {
            return getNameByOperatorName.onExtraCallback(type2, this.f$1);
        }
        getNameByOperatorName.onExtraCallback(type2, this.f$1);
        throw null;
    }
}
