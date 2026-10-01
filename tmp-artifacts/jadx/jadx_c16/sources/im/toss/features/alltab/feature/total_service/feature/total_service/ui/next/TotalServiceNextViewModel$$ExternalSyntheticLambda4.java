package im.toss.features.alltab.feature.total_service.feature.total_service.ui.next;

import kotlin.jvm.functions.Function1;
import o.getPageAt;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceNextViewModel$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
        getPageAt getpageat = (getPageAt) obj;
        if (i2 % 2 != 0) {
            return TotalServiceNextViewModel.onExtraCallback(getpageat);
        }
        TotalServiceNextViewModel.onExtraCallback(getpageat);
        throw null;
    }
}
