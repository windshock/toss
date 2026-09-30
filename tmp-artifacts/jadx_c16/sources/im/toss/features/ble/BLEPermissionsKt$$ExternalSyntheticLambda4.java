package im.toss.features.ble;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import o.putTabBarModel;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BLEPermissionsKt$$ExternalSyntheticLambda4 implements Function0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Fragment f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(putTabBarModel.onNavigationEvent(this.f$0));
        int i4 = onNavigationEvent + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }
}
