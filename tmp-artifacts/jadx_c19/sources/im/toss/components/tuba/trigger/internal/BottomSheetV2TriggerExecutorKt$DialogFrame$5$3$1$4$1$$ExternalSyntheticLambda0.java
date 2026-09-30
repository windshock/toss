package im.toss.components.tuba.trigger.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.OkHttpNetworkFetcherExternalSyntheticLambda6;
import o.setUseCaseAttached;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class BottomSheetV2TriggerExecutorKt$DialogFrame$5$3$1$4$1$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 21;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = OkHttpNetworkFetcherExternalSyntheticLambda6.onWarmupCompleted.onNavigationEvent((setUseCaseAttached) obj);
        if (i4 != 0) {
            int i5 = 43 / 0;
        }
        return unitOnNavigationEvent;
    }
}
