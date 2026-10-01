package im.toss.base;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getAdUnitIds;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseActivity$$ExternalSyntheticLambda36 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ BaseActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnNavigationEvent = BaseActivity.onNavigationEvent(this.f$0, (getAdUnitIds.onExtraCallback) obj);
            int i3 = 14 / 0;
        } else {
            unitOnNavigationEvent = BaseActivity.onNavigationEvent(this.f$0, (getAdUnitIds.onExtraCallback) obj);
        }
        int i4 = onNavigationEvent + 73;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
