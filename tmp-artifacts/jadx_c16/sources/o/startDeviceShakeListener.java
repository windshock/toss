package o;

import im.toss.features.benefit.dto.BenefitTabPremiumAdResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class startDeviceShakeListener extends SensorBridgeExtension3 implements SensorBridgeExtension {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final boolean onExtraCallbackWithResult;
    private final BenefitTabPremiumAdResponse onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof startDeviceShakeListener)) {
            int i5 = i3 + 69;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        startDeviceShakeListener startdeviceshakelistener = (startDeviceShakeListener) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, startdeviceshakelistener.onWarmupCompleted) || this.onExtraCallbackWithResult != startdeviceshakelistener.onExtraCallbackWithResult) {
            return false;
        }
        int i7 = onExtraCallback + 119;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onWarmupCompleted.hashCode() * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
        int i4 = onExtraCallback + 67;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PremiumAdHeaderItem(premiumAd=" + this.onWarmupCompleted + ", hasActivationIntelligenceBelow=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public startDeviceShakeListener(@NotNull BenefitTabPremiumAdResponse benefitTabPremiumAdResponse, boolean z) {
        Intrinsics.checkNotNullParameter(benefitTabPremiumAdResponse, "");
        this.onWarmupCompleted = benefitTabPremiumAdResponse;
        this.onExtraCallbackWithResult = z;
    }

    public final BenefitTabPremiumAdResponse onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        BenefitTabPremiumAdResponse benefitTabPremiumAdResponse = this.onWarmupCompleted;
        int i5 = i3 + 57;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return benefitTabPremiumAdResponse;
        }
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallbackWithResult;
        int i5 = i3 + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
