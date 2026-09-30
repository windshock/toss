package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdBindingErrorActivity$$ExternalSyntheticLambda9 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ MobileIdBindingErrorActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            MobileIdBindingErrorActivity.onNavigationEvent(this.f$0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = MobileIdBindingErrorActivity.onNavigationEvent(this.f$0);
        int i3 = onExtraCallback + 79;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 64 / 0;
        }
        return unitOnNavigationEvent;
    }
}
