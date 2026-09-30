package im.toss.features.benefit.ui;

import com.horcrux.svg.SvgPackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AppMsgReceiver2;
import o.getDeviceBaseInfo;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda45 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (AppMsgReceiver2) obj, (getDeviceBaseInfo) obj2};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        Unit unit = (Unit) getNameByOperatorName.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr, 148092170, -148092159, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
        int i4 = onExtraCallback + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
