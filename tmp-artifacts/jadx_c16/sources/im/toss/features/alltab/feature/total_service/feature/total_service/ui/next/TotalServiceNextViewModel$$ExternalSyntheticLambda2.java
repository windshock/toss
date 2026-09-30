package im.toss.features.alltab.feature.total_service.feature.total_service.ui.next;

import kotlin.jvm.functions.Function1;
import o.getPageAt;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceNextViewModel$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getPageAt getpageatOnNavigationEvent = TotalServiceNextViewModel.onNavigationEvent((getPageAt) obj);
        int i4 = IAuthTabCallback + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return getpageatOnNavigationEvent;
    }
}
