package im.toss.features.main.ui.shopping;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TabBarBubbleComponent$$ExternalSyntheticLambda1 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ TabBarBubbleComponent f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            TabBarBubbleComponent.onNavigationEvent(this.f$0);
            throw null;
        }
        Unit unitOnNavigationEvent = TabBarBubbleComponent.onNavigationEvent(this.f$0);
        int i3 = onExtraCallback + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
