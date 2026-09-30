package im.toss.features.mobileid.impl.view;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileId4PinPasswordChangeActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        View view = (View) obj;
        if (i2 % 2 != 0) {
            MobileId4PinPasswordChangeActivity.onExtraCallback(view);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = MobileId4PinPasswordChangeActivity.onExtraCallback(view);
        int i3 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 72 / 0;
        }
        return unitOnExtraCallback;
    }
}
