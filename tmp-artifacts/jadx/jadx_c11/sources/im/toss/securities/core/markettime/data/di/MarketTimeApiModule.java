package im.toss.securities.core.markettime.data.di;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.accessgetStatep;
import o.performOnAppAttribution;
import o.showCmpForExistingUser;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MarketTimeApiModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final MarketTimeApiModule onNavigationEvent = new MarketTimeApiModule();
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 51;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private MarketTimeApiModule() {
    }

    public final showCmpForExistingUser onExtraCallbackWithResult(@NotNull performOnAppAttribution performonappattribution, @NotNull accessgetStatep accessgetstatep) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(performonappattribution, "");
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        showCmpForExistingUser showcmpforexistinguser = (showCmpForExistingUser) performOnAppAttribution.onWarmupCompleted(performonappattribution, showCmpForExistingUser.class, accessgetstatep.RatingCompatApi19Impl(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = onExtraCallbackWithResult + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return showcmpforexistinguser;
    }
}
