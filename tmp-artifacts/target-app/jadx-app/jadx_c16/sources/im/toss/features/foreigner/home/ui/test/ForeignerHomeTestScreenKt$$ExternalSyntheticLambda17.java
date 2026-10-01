package im.toss.features.foreigner.home.ui.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda17 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = setCallUrl.IAuthTabCallbackStubProxy();
        int i4 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return unitIAuthTabCallbackStubProxy;
    }
}
