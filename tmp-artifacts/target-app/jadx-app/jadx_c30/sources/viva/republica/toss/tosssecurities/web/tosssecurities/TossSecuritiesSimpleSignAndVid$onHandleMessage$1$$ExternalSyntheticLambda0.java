package viva.republica.toss.tosssecurities.web.tosssecurities;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getStateDataReferenceImpl;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossSecuritiesSimpleSignAndVid$onHandleMessage$1$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ String f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            getStateDataReferenceImpl.onExtraCallbackWithResult.IAuthTabCallback(this.f$0, (startRunning) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = getStateDataReferenceImpl.onExtraCallbackWithResult.IAuthTabCallback(this.f$0, (startRunning) obj);
        int i3 = onNavigationEvent + 19;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
