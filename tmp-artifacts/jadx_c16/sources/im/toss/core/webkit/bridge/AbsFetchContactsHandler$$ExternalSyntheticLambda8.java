package im.toss.core.webkit.bridge;

import java.util.List;
import kotlin.jvm.functions.Function1;
import o.surfaceDestroyed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsFetchContactsHandler$$ExternalSyntheticLambda8 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ surfaceDestroyed f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        List listOnWarmupCompleted = surfaceDestroyed.onWarmupCompleted(this.f$0, (List) obj);
        int i4 = onNavigationEvent + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return listOnWarmupCompleted;
    }
}
