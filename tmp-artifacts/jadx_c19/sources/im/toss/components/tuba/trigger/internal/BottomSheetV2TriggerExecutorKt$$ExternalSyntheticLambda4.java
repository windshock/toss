package im.toss.components.tuba.trigger.internal;

import kotlin.jvm.functions.Function1;
import o.OkHttpNetworkFetcherExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(OkHttpNetworkFetcherExternalSyntheticLambda6.onNavigationEvent(this.f$0, ((Integer) obj).intValue()));
        int i5 = IAuthTabCallback + 75;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return numValueOf;
    }
}
