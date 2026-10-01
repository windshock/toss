package im.toss.splittarget.impl.analytics.toss;

import dagger.Lazy;
import javax.inject.Singleton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.getBidToken;
import o.getBillingPeriod;
import o.getPricingPhaseList;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class PiiSanitizerModule {
    public static final PiiSanitizerModule IAuthTabCallback = new PiiSanitizerModule();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 25;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ getPricingPhaseList onExtraCallback(Lazy lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getPricingPhaseList getpricingphaselistOnExtraCallbackWithResult = onExtraCallbackWithResult(lazy);
        int i4 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return getpricingphaselistOnExtraCallbackWithResult;
    }

    private PiiSanitizerModule() {
    }

    private static final getPricingPhaseList onExtraCallbackWithResult(Lazy lazy) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getPricingPhaseList getpricingphaselistOnExtraCallbackWithResult = ((getBillingPeriod) lazy.get()).onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return getpricingphaselistOnExtraCallbackWithResult;
        }
        throw null;
    }

    @Singleton
    public final getBidToken IAuthTabCallback(@NotNull final Lazy<getBillingPeriod> lazy) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(lazy, "");
        RegionAwarePiiSanitizer regionAwarePiiSanitizer = new RegionAwarePiiSanitizer(new Function0() { // from class: im.toss.splittarget.impl.analytics.toss.PiiSanitizerModule$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 45;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                getPricingPhaseList getpricingphaselistOnExtraCallback = PiiSanitizerModule.onExtraCallback(lazy);
                int i5 = onExtraCallbackWithResult + 53;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return getpricingphaselistOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return regionAwarePiiSanitizer;
    }
}
