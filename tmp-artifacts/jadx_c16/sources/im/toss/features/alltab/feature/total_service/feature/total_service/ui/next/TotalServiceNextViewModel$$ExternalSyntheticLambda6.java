package im.toss.features.alltab.feature.total_service.feature.total_service.ui.next;

import kotlin.jvm.functions.Function1;
import o.getPageAt;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceNextViewModel$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getPageAt getpageatAsBinder = TotalServiceNextViewModel.asBinder((getPageAt) obj);
        int i4 = onExtraCallback + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return getpageatAsBinder;
        }
        throw null;
    }
}
