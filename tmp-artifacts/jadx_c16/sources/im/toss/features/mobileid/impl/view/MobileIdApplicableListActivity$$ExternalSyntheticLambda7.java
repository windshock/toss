package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdApplicableListActivity$$ExternalSyntheticLambda7 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ MobileIdApplicableListActivity f$0;

    public final Object invoke() {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnNavigationEvent = MobileIdApplicableListActivity.onNavigationEvent(this.f$0);
            int i3 = 96 / 0;
        } else {
            unitOnNavigationEvent = MobileIdApplicableListActivity.onNavigationEvent(this.f$0);
        }
        int i4 = onNavigationEvent + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
