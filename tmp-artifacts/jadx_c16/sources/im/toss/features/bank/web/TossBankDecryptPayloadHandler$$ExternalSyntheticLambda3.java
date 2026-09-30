package im.toss.features.bank.web;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setOnOutOfMemeryErrorCallback;
import o.setValueZero;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankDecryptPayloadHandler$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ setOnOutOfMemeryErrorCallback f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            setValueZero.onNavigationEvent(this.f$0, (Throwable) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = setValueZero.onNavigationEvent(this.f$0, (Throwable) obj);
        int i3 = onExtraCallback + 113;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
