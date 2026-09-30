package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.initSDK;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonTopErrorFinishActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ MobileIdCommonTopErrorFinishActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitIAuthTabCallback = MobileIdCommonTopErrorFinishActivity.IAuthTabCallback(this.f$0, (initSDK.onNavigationEvent) obj);
            int i3 = 28 / 0;
        } else {
            unitIAuthTabCallback = MobileIdCommonTopErrorFinishActivity.IAuthTabCallback(this.f$0, (initSDK.onNavigationEvent) obj);
        }
        int i4 = IAuthTabCallback + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
