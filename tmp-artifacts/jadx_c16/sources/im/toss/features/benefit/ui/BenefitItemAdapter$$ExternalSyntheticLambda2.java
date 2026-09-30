package im.toss.features.benefit.ui;

import android.content.Context;
import com.horcrux.svg.SvgPackage;
import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getNameByOperatorName;
import o.setNode;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ BenefitActivationIntelligence.Type2 f$0;
    public final /* synthetic */ getNameByOperatorName f$1;
    public final /* synthetic */ Context f$2;
    public final /* synthetic */ setNode f$3;

    public /* synthetic */ BenefitItemAdapter$$ExternalSyntheticLambda2(BenefitActivationIntelligence.Type2 type2, getNameByOperatorName getnamebyoperatorname, Context context, setNode setnode) {
        this.f$0 = type2;
        this.f$1 = getnamebyoperatorname;
        this.f$2 = context;
        this.f$3 = setnode;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, this.f$2, this.f$3, (BenefitActivationIntelligence.Type2) obj};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        Unit unit = (Unit) getNameByOperatorName.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr, -1357396862, 1357396863, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
        int i4 = IAuthTabCallback + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
