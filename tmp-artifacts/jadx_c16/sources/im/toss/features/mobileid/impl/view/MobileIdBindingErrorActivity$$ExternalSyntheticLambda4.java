package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdBindingErrorActivity$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ MobileIdBindingErrorActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            MobileIdBindingErrorActivity.onExtraCallback(this.f$0);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = MobileIdBindingErrorActivity.onExtraCallback(this.f$0);
        int i3 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
