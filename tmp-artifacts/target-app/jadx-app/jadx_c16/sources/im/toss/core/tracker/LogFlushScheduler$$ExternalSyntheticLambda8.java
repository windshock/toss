package im.toss.core.tracker;

import o.deserializeFloatArray;
import o.getPackageType;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LogFlushScheduler$$ExternalSyntheticLambda8 implements deserializeFloatArray {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ getPackageType f$0;

    public final void cancel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0};
        if (i3 == 0) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            LogFlushScheduler.onExtraCallback(-380610704, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, 380610712, iOnNavigationEvent);
        } else {
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            LogFlushScheduler.onExtraCallback(-380610704, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, 380610712, iOnNavigationEvent2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
