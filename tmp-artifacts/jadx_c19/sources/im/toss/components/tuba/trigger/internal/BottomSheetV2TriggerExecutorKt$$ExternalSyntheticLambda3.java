package im.toss.components.tuba.trigger.internal;

import kotlin.jvm.functions.Function1;
import o.OkHttpNetworkFetcherExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnNavigationEvent = OkHttpNetworkFetcherExternalSyntheticLambda6.onNavigationEvent(((Boolean) obj).booleanValue());
        if (i4 == 0) {
            return Boolean.valueOf(zOnNavigationEvent);
        }
        Boolean.valueOf(zOnNavigationEvent);
        throw null;
    }
}
