package im.toss.features.bank.web;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.TypeUtils7;
import o.reportTrigger;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankCertRequestSignV2Handler$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = reportTrigger.onExtraCallbackWithResult((TypeUtils7) obj);
        int i4 = IAuthTabCallback + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
