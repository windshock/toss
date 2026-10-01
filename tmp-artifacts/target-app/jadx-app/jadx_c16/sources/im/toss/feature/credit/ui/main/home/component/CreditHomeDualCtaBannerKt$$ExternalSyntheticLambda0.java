package im.toss.feature.credit.ui.main.home.component;

import kotlin.jvm.functions.Function1;
import o.RuntimeEnvironmentProxy;
import o.attachAppLovinSdk;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHomeDualCtaBannerKt$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
        if (i2 % 2 != 0) {
            return RuntimeEnvironmentProxy.IAuthTabCallback(attachapplovinsdk);
        }
        RuntimeEnvironmentProxy.IAuthTabCallback(attachapplovinsdk);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
