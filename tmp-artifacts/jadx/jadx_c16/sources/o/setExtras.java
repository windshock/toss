package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setExtras {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final boolean onExtraCallbackWithResult(@NotNull getBillingPeriod getbillingperiod) throws getInstallmentPlanDetails, NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        asyncInterceptor asyncinterceptorOnNavigationEvent = onNavigationEvent(getbillingperiod.onExtraCallbackWithResult());
        if (asyncinterceptorOnNavigationEvent != null) {
            return getQueryScene.IAuthTabCallback.onNavigationEvent(asyncinterceptorOnNavigationEvent) == MySubscribeProxy.Supported;
        }
        int i4 = onExtraCallbackWithResult + 5;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public static final boolean IAuthTabCallback(@NotNull getBillingPeriod getbillingperiod) throws getInstallmentPlanDetails, NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        asyncInterceptor asyncinterceptorOnNavigationEvent = onNavigationEvent(getbillingperiod.onExtraCallbackWithResult());
        if (asyncinterceptorOnNavigationEvent == null) {
            int i2 = onExtraCallbackWithResult + 125;
            onExtraCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (getQueryScene.IAuthTabCallback.onExtraCallbackWithResult(asyncinterceptorOnNavigationEvent) != MySubscribeProxy.Supported) {
            return false;
        }
        int i3 = onExtraCallbackWithResult + 1;
        onExtraCallback = i3 % 128;
        return i3 % 2 != 0;
    }

    public static final boolean onWarmupCompleted(@NotNull getBillingPeriod getbillingperiod) throws getInstallmentPlanDetails, NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        asyncInterceptor asyncinterceptorOnNavigationEvent = onNavigationEvent(getbillingperiod.onExtraCallbackWithResult());
        if (asyncinterceptorOnNavigationEvent == null) {
            int i2 = onExtraCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (getQueryScene.IAuthTabCallback.onExtraCallback(asyncinterceptorOnNavigationEvent) == MySubscribeProxy.Supported) {
            return true;
        }
        int i4 = onExtraCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.getInstallmentPlanDetails */
    private static final asyncInterceptor onNavigationEvent(getPricingPhaseList getpricingphaselist) throws getInstallmentPlanDetails, NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 27;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0 ? (i = onExtraCallback.onExtraCallback[getpricingphaselist.ordinal()]) == 1 : (i = onExtraCallback.onExtraCallback[getpricingphaselist.ordinal()]) == 1) {
            return asyncInterceptor.KR;
        }
        if (i == 2) {
            asyncInterceptor asyncinterceptor = asyncInterceptor.EU;
            int i4 = onExtraCallbackWithResult + 121;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return asyncinterceptor;
            }
            throw null;
        }
        if (i == 3) {
            return asyncInterceptor.AU;
        }
        int i5 = onExtraCallbackWithResult + 17;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0 ? i == 4 : i == 4) {
            throw new getInstallmentPlanDetails(getpricingphaselist);
        }
        throw new NoWhenBranchMatchedException();
    }
}
