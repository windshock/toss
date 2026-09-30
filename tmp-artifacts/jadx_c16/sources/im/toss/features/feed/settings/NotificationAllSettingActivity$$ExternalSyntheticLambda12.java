package im.toss.features.feed.settings;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NotificationAllSettingActivity$$ExternalSyntheticLambda12 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ String f$0;

    public final Object invoke(Object obj) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unit = (Unit) NotificationAllSettingActivity.onExtraCallback(-1585500644, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this.f$0, (SetDetectableSize) obj}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1585500664, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            int i3 = 72 / 0;
        } else {
            unit = (Unit) NotificationAllSettingActivity.onExtraCallback(-1585500644, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this.f$0, (SetDetectableSize) obj}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1585500664, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        }
        int i4 = IAuthTabCallback + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
