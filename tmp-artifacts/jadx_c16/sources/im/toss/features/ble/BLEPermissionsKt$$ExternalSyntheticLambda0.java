package im.toss.features.ble;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import o.putTabBarModel;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BLEPermissionsKt$$ExternalSyntheticLambda0 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Context f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(putTabBarModel.onExtraCallbackWithResult(this.f$0));
        int i4 = IAuthTabCallback + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return boolValueOf;
    }
}
