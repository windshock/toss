package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSignForPKCS7AndVIDRV2NoContentsWithAttr {
    private final double onExtraCallbackWithResult;
    private final double onNavigationEvent;
    private final double onWarmupCompleted;

    public getSignForPKCS7AndVIDRV2NoContentsWithAttr() {
        this(0.0d, 0.0d, 0.0d, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSignForPKCS7AndVIDRV2NoContentsWithAttr)) {
            return false;
        }
        getSignForPKCS7AndVIDRV2NoContentsWithAttr getsignforpkcs7andvidrv2nocontentswithattr = (getSignForPKCS7AndVIDRV2NoContentsWithAttr) obj;
        return Double.compare(this.onExtraCallbackWithResult, getsignforpkcs7andvidrv2nocontentswithattr.onExtraCallbackWithResult) == 0 && Double.compare(this.onNavigationEvent, getsignforpkcs7andvidrv2nocontentswithattr.onNavigationEvent) == 0 && Double.compare(this.onWarmupCompleted, getsignforpkcs7andvidrv2nocontentswithattr.onWarmupCompleted) == 0;
    }

    public int hashCode() {
        return (((Double.hashCode(this.onExtraCallbackWithResult) * 31) + Double.hashCode(this.onNavigationEvent)) * 31) + Double.hashCode(this.onWarmupCompleted);
    }

    public String toString() {
        return "GraniteVideoProgressData(currentTime=" + this.onExtraCallbackWithResult + ", playableDuration=" + this.onNavigationEvent + ", seekableDuration=" + this.onWarmupCompleted + ")";
    }

    public getSignForPKCS7AndVIDRV2NoContentsWithAttr(double d, double d2, double d3) {
        this.onExtraCallbackWithResult = d;
        this.onNavigationEvent = d2;
        this.onWarmupCompleted = d3;
    }

    public /* synthetic */ getSignForPKCS7AndVIDRV2NoContentsWithAttr(double d, double d2, double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3);
    }

    public final double onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final double onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final double IAuthTabCallback() {
        return this.onWarmupCompleted;
    }
}
