package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCiNotValidActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ MobileIdCiNotValidActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = MobileIdCiNotValidActivity.IAuthTabCallback(this.f$0);
        int i4 = onExtraCallback + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
