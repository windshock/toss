package im.toss.tosssecurities.tuba.variable.v1.di;

import javax.inject.Singleton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AFe1mSDK;
import o.accessgetStatep;
import o.decodeIpv6;
import o.getAdvertisingIdWithGps;
import o.getGaidError;
import o.isLimitAdTrackingEnabled;
import o.performOnAppAttribution;
import o.setLimitAdTrackingEnabled;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossSecuritiesTubaV1Module {
    public static final TossSecuritiesTubaV1Module IAuthTabCallback = new TossSecuritiesTubaV1Module();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 115;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private TossSecuritiesTubaV1Module() {
    }

    @Singleton
    public final getAdvertisingIdWithGps IAuthTabCallback(@NotNull performOnAppAttribution performonappattribution, @NotNull accessgetStatep accessgetstatep, @NotNull decodeIpv6 decodeipv6) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(performonappattribution, "");
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        Intrinsics.checkNotNullParameter(decodeipv6, "");
        getGaidError getgaiderror = new getGaidError((isLimitAdTrackingEnabled) performOnAppAttribution.onWarmupCompleted(performonappattribution, isLimitAdTrackingEnabled.class, accessgetstatep.RatingCompatApi19Impl(), (Long) null, (Long) null, (Function1) null, 28, (Object) null), decodeipv6);
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 60 / 0;
        }
        return getgaiderror;
    }

    @Singleton
    public final AFe1mSDK onExtraCallback(@NotNull getAdvertisingIdWithGps getadvertisingidwithgps) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getadvertisingidwithgps, "");
        setLimitAdTrackingEnabled setlimitadtrackingenabled = new setLimitAdTrackingEnabled(getadvertisingidwithgps);
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return setlimitadtrackingenabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
