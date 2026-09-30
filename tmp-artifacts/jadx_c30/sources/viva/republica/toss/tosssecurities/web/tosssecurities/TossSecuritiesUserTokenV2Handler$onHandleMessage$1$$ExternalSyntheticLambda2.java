package viva.republica.toss.tosssecurities.web.tosssecurities;

import kotlin.jvm.functions.Function1;
import o.getStateDataMapBuffer;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossSecuritiesUserTokenV2Handler$onHandleMessage$1$$ExternalSyntheticLambda2 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onWarmupCompleted = i2 % 128;
        startRunning startrunning = (startRunning) obj;
        if (i2 % 2 == 0) {
            return getStateDataMapBuffer.onNavigationEvent.IAuthTabCallback(startrunning);
        }
        getStateDataMapBuffer.onNavigationEvent.IAuthTabCallback(startrunning);
        throw null;
    }
}
