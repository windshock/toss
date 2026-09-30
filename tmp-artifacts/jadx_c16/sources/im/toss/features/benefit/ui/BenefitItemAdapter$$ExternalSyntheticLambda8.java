package im.toss.features.benefit.ui;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;
import o.AppNode;
import o.getAppAuthorizeSetting;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda8 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ getNameByOperatorName f$0;
    public final /* synthetic */ AppNode f$1;
    public final /* synthetic */ getAppAuthorizeSetting f$2;

    public /* synthetic */ BenefitItemAdapter$$ExternalSyntheticLambda8(getNameByOperatorName getnamebyoperatorname, AppNode appNode, getAppAuthorizeSetting getappauthorizesetting) {
        this.f$0 = getnamebyoperatorname;
        this.f$1 = appNode;
        this.f$2 = getappauthorizesetting;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getNameByOperatorName getnamebyoperatorname = this.f$0;
        if (i3 == 0) {
            return getNameByOperatorName.onNavigationEvent(getnamebyoperatorname, this.f$1, this.f$2, (MotionEvent) obj);
        }
        getNameByOperatorName.onNavigationEvent(getnamebyoperatorname, this.f$1, this.f$2, (MotionEvent) obj);
        throw null;
    }
}
