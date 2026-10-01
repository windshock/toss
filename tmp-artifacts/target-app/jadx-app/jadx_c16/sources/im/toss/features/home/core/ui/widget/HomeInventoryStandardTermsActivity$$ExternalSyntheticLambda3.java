package im.toss.features.home.core.ui.widget;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getRawFullResponse;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeInventoryStandardTermsActivity$$ExternalSyntheticLambda3 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ getRawFullResponse f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            HomeInventoryStandardTermsActivity.onNavigationEvent(this.f$0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = HomeInventoryStandardTermsActivity.onNavigationEvent(this.f$0);
        int i3 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
