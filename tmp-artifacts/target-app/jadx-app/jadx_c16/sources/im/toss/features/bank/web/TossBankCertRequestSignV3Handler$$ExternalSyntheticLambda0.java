package im.toss.features.bank.web;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.TypeUtils7;
import o.setBizType;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankCertRequestSignV3Handler$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = setBizType.onNavigationEvent((TypeUtils7) obj);
        int i4 = onNavigationEvent + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
