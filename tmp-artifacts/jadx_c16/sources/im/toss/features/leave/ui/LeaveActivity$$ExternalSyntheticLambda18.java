package im.toss.features.leave.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda18 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LeaveActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            LeaveActivity.IAuthTabCallbackStubProxy(this.f$0);
            throw null;
        }
        Unit unitIAuthTabCallbackStubProxy = LeaveActivity.IAuthTabCallbackStubProxy(this.f$0);
        int i3 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackStubProxy;
    }
}
