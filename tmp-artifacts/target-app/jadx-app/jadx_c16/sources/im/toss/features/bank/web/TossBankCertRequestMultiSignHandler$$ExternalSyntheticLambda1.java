package im.toss.features.bank.web;

import kotlin.jvm.functions.Function1;
import o.TypeUtils7;
import o.setSubType;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankCertRequestMultiSignHandler$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        TypeUtils7 typeUtils7 = (TypeUtils7) obj;
        if (i2 % 2 == 0) {
            return setSubType.onExtraCallback(typeUtils7);
        }
        setSubType.onExtraCallback(typeUtils7);
        throw null;
    }
}
