package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonErrorFinishActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ MobileIdCommonErrorFinishActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            MobileIdCommonErrorFinishActivity.onNavigationEvent(this.f$0);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = MobileIdCommonErrorFinishActivity.onNavigationEvent(this.f$0);
        int i3 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }
}
