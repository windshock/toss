package im.toss.features.benefit.ui;

import com.horcrux.svg.SvgPackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getNameByOperatorName;
import o.setNode;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda3 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ getNameByOperatorName f$0;
    public final /* synthetic */ setNode f$1;

    public /* synthetic */ BenefitItemAdapter$$ExternalSyntheticLambda3(getNameByOperatorName getnamebyoperatorname, setNode setnode) {
        this.f$0 = getnamebyoperatorname;
        this.f$1 = setnode;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        Unit unit = (Unit) getNameByOperatorName.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr, -1618618695, 1618618709, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
        int i4 = onExtraCallbackWithResult + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
