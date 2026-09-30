package im.toss.components.tuba.trigger.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getReadEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BottomSheetV2TriggerExecutor$TubaTriggerDialog$$ExternalSyntheticLambda2 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ getReadEnabled.onNavigationEvent f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = getReadEnabled.onNavigationEvent.onExtraCallback(this.f$0);
        int i4 = onNavigationEvent + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return unitOnExtraCallback;
    }
}
