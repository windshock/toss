package viva.republica.toss.tosssecurities.web.tosssecurities;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getStateDataMapBuffer;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossSecuritiesUserTokenV2Handler$onHandleMessage$1$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = getStateDataMapBuffer.onNavigationEvent.onWarmupCompleted((startRunning) obj);
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
