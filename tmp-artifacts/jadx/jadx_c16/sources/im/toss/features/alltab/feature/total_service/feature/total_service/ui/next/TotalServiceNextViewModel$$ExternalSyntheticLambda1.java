package im.toss.features.alltab.feature.total_service.feature.total_service.ui.next;

import kotlin.jvm.functions.Function1;
import o.getPageAt;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceNextViewModel$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        getPageAt getpageat = (getPageAt) obj;
        if (i2 % 2 != 0) {
            TotalServiceNextViewModel.onExtraCallbackWithResult(getpageat);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        getPageAt getpageatOnExtraCallbackWithResult = TotalServiceNextViewModel.onExtraCallbackWithResult(getpageat);
        int i3 = onNavigationEvent + 125;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return getpageatOnExtraCallbackWithResult;
    }
}
