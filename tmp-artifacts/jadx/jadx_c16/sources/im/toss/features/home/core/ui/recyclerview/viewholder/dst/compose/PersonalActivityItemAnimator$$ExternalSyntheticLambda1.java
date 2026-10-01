package im.toss.features.home.core.ui.recyclerview.viewholder.dst.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.isGetMethod;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PersonalActivityItemAnimator$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ isGetMethod f$0;

    public final Object invoke() {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnNavigationEvent = isGetMethod.onNavigationEvent(this.f$0);
            int i3 = 42 / 0;
        } else {
            unitOnNavigationEvent = isGetMethod.onNavigationEvent(this.f$0);
        }
        int i4 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
