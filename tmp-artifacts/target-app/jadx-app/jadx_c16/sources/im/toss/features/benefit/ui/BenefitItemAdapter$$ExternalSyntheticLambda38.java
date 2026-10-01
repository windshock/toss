package im.toss.features.benefit.ui;

import com.horcrux.svg.SvgPackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AppMsgReceiver2;
import o.getNameByOperatorName;
import o.registerSensor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda38 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (AppMsgReceiver2) obj, (registerSensor) obj2};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        Unit unit = (Unit) getNameByOperatorName.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr, -315441335, 315441343, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
        int i4 = onExtraCallbackWithResult + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
