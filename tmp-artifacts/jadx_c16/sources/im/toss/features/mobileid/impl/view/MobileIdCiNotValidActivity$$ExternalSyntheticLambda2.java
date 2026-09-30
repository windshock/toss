package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCiNotValidActivity$$ExternalSyntheticLambda2 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ MobileIdCiNotValidActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            MobileIdCiNotValidActivity.onExtraCallback(this.f$0);
            throw null;
        }
        Unit unitOnExtraCallback = MobileIdCiNotValidActivity.onExtraCallback(this.f$0);
        int i3 = IAuthTabCallback + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
