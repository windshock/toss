package im.toss.rn.toss.core.common.di;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import o.g1;
import o.getBillingPeriod;
import okhttp3.Cache;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactNetworkServiceCreator {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final g1 onExtraCallbackWithResult;
    private final getBillingPeriod onNavigationEvent;
    private final Cache onWarmupCompleted;

    @Inject
    public ReactNetworkServiceCreator(@NotNull g1 g1Var, @NotNull getBillingPeriod getbillingperiod, @ReactNetworkCache @NotNull Cache cache) {
        Intrinsics.checkNotNullParameter(g1Var, "");
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        Intrinsics.checkNotNullParameter(cache, "");
        this.onExtraCallbackWithResult = g1Var;
        this.onNavigationEvent = getbillingperiod;
        this.onWarmupCompleted = cache;
    }

    public static final /* synthetic */ Cache IAuthTabCallback(ReactNetworkServiceCreator reactNetworkServiceCreator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Cache cache = reactNetworkServiceCreator.onWarmupCompleted;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 97;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return cache;
        }
        throw null;
    }

    public static final /* synthetic */ g1 onNavigationEvent(ReactNetworkServiceCreator reactNetworkServiceCreator) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        g1 g1Var = reactNetworkServiceCreator.onExtraCallbackWithResult;
        int i5 = i3 + 1;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return g1Var;
    }

    public static final /* synthetic */ getBillingPeriod onWarmupCompleted(ReactNetworkServiceCreator reactNetworkServiceCreator) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 77;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        getBillingPeriod getbillingperiod = reactNetworkServiceCreator.onNavigationEvent;
        int i5 = i2 + 79;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return getbillingperiod;
        }
        throw null;
    }
}
