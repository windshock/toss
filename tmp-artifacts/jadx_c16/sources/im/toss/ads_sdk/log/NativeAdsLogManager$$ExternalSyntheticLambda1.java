package im.toss.ads_sdk.log;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import o.calculatePageOffsets;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsLogManager$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ calculatePageOffsets.onExtraCallbackWithResult f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = calculatePageOffsets.onWarmupCompleted(this.f$0, (WeakReference) obj);
        if (i3 == 0) {
            return Boolean.valueOf(zOnWarmupCompleted);
        }
        Boolean.valueOf(zOnWarmupCompleted);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
