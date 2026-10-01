package im.toss.features.benefit.ui;

import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda17 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ BenefitActivationIntelligence.Type1 f$0;
    public final /* synthetic */ getNameByOperatorName f$1;

    public /* synthetic */ BenefitItemAdapter$$ExternalSyntheticLambda17(BenefitActivationIntelligence.Type1 type1, getNameByOperatorName getnamebyoperatorname) {
        this.f$0 = type1;
        this.f$1 = getnamebyoperatorname;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = getNameByOperatorName.onExtraCallbackWithResult(this.f$0, this.f$1);
        int i4 = IAuthTabCallback + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
