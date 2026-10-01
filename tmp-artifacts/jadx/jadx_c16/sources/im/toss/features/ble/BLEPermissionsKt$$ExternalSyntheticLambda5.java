package im.toss.features.ble;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import o.putTabBarModel;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BLEPermissionsKt$$ExternalSyntheticLambda5 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Fragment f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(putTabBarModel.onWarmupCompleted(this.f$0));
        int i4 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
