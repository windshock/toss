package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonTopErrorFinishActivity$$ExternalSyntheticLambda5 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ MobileIdCommonTopErrorFinishActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            MobileIdCommonTopErrorFinishActivity.IAuthTabCallback(this.f$0);
            throw null;
        }
        Unit unitIAuthTabCallback = MobileIdCommonTopErrorFinishActivity.IAuthTabCallback(this.f$0);
        int i3 = IAuthTabCallback + 23;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
