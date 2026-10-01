package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.reportTrigger;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankCertRequestSignV2Handler$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(reportTrigger.onNavigationEvent((String) obj, (String) obj2));
        int i4 = onExtraCallback + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
