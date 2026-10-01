package im.toss.splittarget.impl.analytics.toss;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinAdServiceImpl;
import o.getBidToken;
import o.getPricingPhaseList;
import o.loadNextAdForZoneId;
import o.r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RegionAwarePiiSanitizer implements getBidToken {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private volatile Active onNavigationEvent;
    private final Function0<getPricingPhaseList> onWarmupCompleted;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[getPricingPhaseList.values().length];
            try {
                iArr[getPricingPhaseList.EU.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getPricingPhaseList.KR.ordinal()] = 2;
                int i2 = onWarmupCompleted + 1;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getPricingPhaseList.JP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getPricingPhaseList.AU.ordinal()] = 4;
                int i5 = onWarmupCompleted + 51;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr;
        }
    }

    public RegionAwarePiiSanitizer(@NotNull Function0<? extends getPricingPhaseList> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onWarmupCompleted = function0;
    }

    @Override // o.getBidToken
    public loadNextAdForZoneId onWarmupCompleted(@NotNull String str, @NotNull String str2, boolean z) {
        loadNextAdForZoneId loadnextadforzoneidOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            loadnextadforzoneidOnWarmupCompleted = onExtraCallback((getPricingPhaseList) this.onWarmupCompleted.invoke()).onWarmupCompleted(str, str2, z);
            int i3 = 61 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            loadnextadforzoneidOnWarmupCompleted = onExtraCallback((getPricingPhaseList) this.onWarmupCompleted.invoke()).onWarmupCompleted(str, str2, z);
        }
        int i4 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return loadnextadforzoneidOnWarmupCompleted;
    }

    private final getBidToken onExtraCallback(getPricingPhaseList getpricingphaselist) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Active active = this.onNavigationEvent;
        if (active != null) {
            int i2 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (active.IAuthTabCallback() == getpricingphaselist) {
                int i4 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return active.onExtraCallback();
                }
                active.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        getBidToken getbidtokenOnNavigationEvent = onNavigationEvent(getpricingphaselist);
        this.onNavigationEvent = new Active(getpricingphaselist, getbidtokenOnNavigationEvent);
        return getbidtokenOnNavigationEvent;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final getBidToken onNavigationEvent(getPricingPhaseList getpricingphaselist) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0 ? (i = WhenMappings.IAuthTabCallback[getpricingphaselist.ordinal()]) == 1 : (i = WhenMappings.IAuthTabCallback[getpricingphaselist.ordinal()]) == 1) {
            return new AppLovinAdServiceImpl();
        }
        int i4 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if (i != 2 && i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q();
    }

    static final class Active {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final getBidToken onExtraCallback;
        private final getPricingPhaseList onExtraCallbackWithResult;

        public Active(@NotNull getPricingPhaseList getpricingphaselist, @NotNull getBidToken getbidtoken) {
            Intrinsics.checkNotNullParameter(getpricingphaselist, "");
            Intrinsics.checkNotNullParameter(getbidtoken, "");
            this.onExtraCallbackWithResult = getpricingphaselist;
            this.onExtraCallback = getbidtoken;
        }

        public final getPricingPhaseList IAuthTabCallback() {
            getPricingPhaseList getpricingphaselist;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 47;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                getpricingphaselist = this.onExtraCallbackWithResult;
                int i4 = 82 / 0;
            } else {
                getpricingphaselist = this.onExtraCallbackWithResult;
            }
            int i5 = i2 + 115;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return getpricingphaselist;
            }
            throw null;
        }

        public final getBidToken onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallback;
            }
            throw null;
        }
    }
}
