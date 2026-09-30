package im.toss.features.loan.appbridge;

import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ResidentCertificateHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(ResidentCertificateHandler.onExtraCallbackWithResult((String) obj, (String) obj2));
        int i4 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
