package im.toss.features.foreigner.home.ui.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.bindEngineRouter;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda24 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = setCallUrl.onTransact((bindEngineRouter) obj);
        int i4 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }
}
