package im.toss.core.webkit.bridge;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.GeckoHubImp;
import o.surfaceDestroyed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsFetchContactsHandler$$ExternalSyntheticLambda6 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ surfaceDestroyed f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ AbsFetchContactsHandler$$ExternalSyntheticLambda6(long j, surfaceDestroyed surfacedestroyed, int i, int i2) {
        this.f$0 = j;
        this.f$1 = surfacedestroyed;
        this.f$2 = i;
        this.f$3 = i2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        long j = this.f$0;
        surfaceDestroyed surfacedestroyed = this.f$1;
        int i4 = this.f$2;
        int i5 = this.f$3;
        Long lValueOf = Long.valueOf(j);
        Integer numValueOf = Integer.valueOf(i4);
        Integer numValueOf2 = Integer.valueOf(i5);
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        Unit unit = (Unit) surfaceDestroyed.onNavigationEvent(-108533201, 108533204, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{lValueOf, surfacedestroyed, numValueOf, numValueOf2, (List) obj}, iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback3);
        int i6 = onWarmupCompleted + 3;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
