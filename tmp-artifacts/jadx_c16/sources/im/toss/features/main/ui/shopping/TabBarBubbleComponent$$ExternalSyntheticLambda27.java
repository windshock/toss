package im.toss.features.main.ui.shopping;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TabBarBubbleComponent$$ExternalSyntheticLambda27 implements Function0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TabBarBubbleComponent f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TabBarBubbleComponent tabBarBubbleComponent = this.f$0;
        if (i3 != 0) {
            return TabBarBubbleComponent.IAuthTabCallback(tabBarBubbleComponent);
        }
        TabBarBubbleComponent.IAuthTabCallback(tabBarBubbleComponent);
        throw null;
    }
}
