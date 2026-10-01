package im.toss.features.benefit.ui;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class KoreaBenefitTabViewModel$onExtraCallbackWithResult {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final boolean onExtraCallback;
    private final boolean onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KoreaBenefitTabViewModel$onExtraCallbackWithResult)) {
            return false;
        }
        KoreaBenefitTabViewModel$onExtraCallbackWithResult koreaBenefitTabViewModel$onExtraCallbackWithResult = (KoreaBenefitTabViewModel$onExtraCallbackWithResult) obj;
        if (this.onWarmupCompleted != koreaBenefitTabViewModel$onExtraCallbackWithResult.onWarmupCompleted) {
            int i2 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.onExtraCallback == koreaBenefitTabViewModel$onExtraCallbackWithResult.onExtraCallback) {
            return true;
        }
        int i4 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        int iHashCode = (i2 % 2 == 0 ? Boolean.hashCode(this.onWarmupCompleted) + 47 : Boolean.hashCode(this.onWarmupCompleted) * 31) + Boolean.hashCode(this.onExtraCallback);
        int i3 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BenefitAdDistributionTargets(isPremiumAdEnabled=" + this.onWarmupCompleted + ", isLegacyThumbnailBannerEnabled=" + this.onExtraCallback + ")";
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public KoreaBenefitTabViewModel$onExtraCallbackWithResult(boolean z, boolean z2) {
        this.onWarmupCompleted = z;
        this.onExtraCallback = z2;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 55;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i2 + 105;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
