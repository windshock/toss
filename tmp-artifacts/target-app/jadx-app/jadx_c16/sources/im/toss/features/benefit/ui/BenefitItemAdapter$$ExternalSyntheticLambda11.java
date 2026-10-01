package im.toss.features.benefit.ui;

import android.content.Context;
import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.enableRotationVector;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda11 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ BenefitActivationIntelligence.Type3 f$0;
    public final /* synthetic */ getNameByOperatorName f$1;
    public final /* synthetic */ Context f$2;
    public final /* synthetic */ enableRotationVector f$3;

    public /* synthetic */ BenefitItemAdapter$$ExternalSyntheticLambda11(BenefitActivationIntelligence.Type3 type3, getNameByOperatorName getnamebyoperatorname, Context context, enableRotationVector enablerotationvector) {
        this.f$0 = type3;
        this.f$1 = getnamebyoperatorname;
        this.f$2 = context;
        this.f$3 = enablerotationvector;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            getNameByOperatorName.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, (BenefitActivationIntelligence.Type3) obj);
            throw null;
        }
        Unit unitOnExtraCallback = getNameByOperatorName.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, (BenefitActivationIntelligence.Type3) obj);
        int i3 = onExtraCallback + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
