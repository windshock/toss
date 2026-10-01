package im.toss.features.benefit.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getAppAuthorizeSetting;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda54 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ getAppAuthorizeSetting f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getAppAuthorizeSetting getappauthorizesetting = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 != 0) {
            return getNameByOperatorName.onWarmupCompleted(getappauthorizesetting, setDetectableSize);
        }
        Unit unitOnWarmupCompleted = getNameByOperatorName.onWarmupCompleted(getappauthorizesetting, setDetectableSize);
        int i4 = 4 / 0;
        return unitOnWarmupCompleted;
    }
}
