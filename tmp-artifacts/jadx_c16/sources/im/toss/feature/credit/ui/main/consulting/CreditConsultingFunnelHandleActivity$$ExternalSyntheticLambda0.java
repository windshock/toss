package im.toss.feature.credit.ui.main.consulting;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.initSDK;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditConsultingFunnelHandleActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CreditConsultingFunnelHandleActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = CreditConsultingFunnelHandleActivity.IAuthTabCallback(this.f$0, (initSDK.onNavigationEvent) obj);
        int i4 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
