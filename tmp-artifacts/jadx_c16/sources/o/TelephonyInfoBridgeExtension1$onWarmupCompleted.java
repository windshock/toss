package o;

import im.toss.features.benefit.dto.BenefitTabPremiumAdResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TelephonyInfoBridgeExtension1$onWarmupCompleted implements TelephonyInfoBridgeExtension1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final BenefitTabPremiumAdResponse onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TelephonyInfoBridgeExtension1$onWarmupCompleted)) {
            int i2 = onWarmupCompleted + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, ((TelephonyInfoBridgeExtension1$onWarmupCompleted) obj).onExtraCallback)) {
            return true;
        }
        int i4 = onWarmupCompleted;
        int i5 = i4 + 39;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 65;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.onExtraCallback.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.onExtraCallback.hashCode();
        int i3 = onWarmupCompleted + 83;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Premium(ad=" + this.onExtraCallback + ")";
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
        return str;
    }

    public TelephonyInfoBridgeExtension1$onWarmupCompleted(@NotNull BenefitTabPremiumAdResponse benefitTabPremiumAdResponse) {
        Intrinsics.checkNotNullParameter(benefitTabPremiumAdResponse, "");
        this.onExtraCallback = benefitTabPremiumAdResponse;
    }

    public final BenefitTabPremiumAdResponse onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
