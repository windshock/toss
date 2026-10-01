package im.toss.feature.credit.ui.main.home.component;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.RuntimeEnvironmentProxy;
import o.attachAppLovinSdk;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHomeDualCtaBannerKt$$ExternalSyntheticLambda1 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = RuntimeEnvironmentProxy.onNavigationEvent((attachAppLovinSdk) obj);
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        int i5 = onWarmupCompleted + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }
}
