package im.toss.features.home.core.ui.widget;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeFooterButtonView$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeFooterButtonView f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        HomeFooterButtonView homeFooterButtonView = this.f$0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (i3 == 0) {
            return HomeFooterButtonView.onExtraCallbackWithResult(homeFooterButtonView, zBooleanValue);
        }
        HomeFooterButtonView.onExtraCallbackWithResult(homeFooterButtonView, zBooleanValue);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
