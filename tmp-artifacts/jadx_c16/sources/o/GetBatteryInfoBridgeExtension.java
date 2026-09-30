package o;

import im.toss.features.benefit.ui.premium.BenefitPremiumAdLogManagerKt$;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class GetBatteryInfoBridgeExtension {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static final wie2 onNavigationEvent = videoFrameChanged.onWarmupCompleted((wie2) null, new BenefitPremiumAdLogManagerKt$.ExternalSyntheticLambda0(), 1, (Object) null);
    private static int onWarmupCompleted;

    public static final /* synthetic */ wie2 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 3;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        wie2 wie2Var = onNavigationEvent;
        int i4 = i2 + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return wie2Var;
    }

    public static /* synthetic */ Unit onWarmupCompleted(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(adinfo);
        int i4 = onExtraCallback + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 59 / 0;
        }
    }

    private static final Unit onExtraCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.asBinder(true);
            adinfo.onExtraCallbackWithResult(false);
        } else {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.asBinder(true);
            adinfo.onExtraCallbackWithResult(true);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
