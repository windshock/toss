package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSignForPKCS7AndVIDRV2 {
    private final double IAuthTabCallback;
    private final double onExtraCallback;
    private final double onExtraCallbackWithResult;
    private final double onNavigationEvent;
    private final String onWarmupCompleted;

    public getSignForPKCS7AndVIDRV2() {
        this(0.0d, 0.0d, 0.0d, 0.0d, null, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSignForPKCS7AndVIDRV2)) {
            return false;
        }
        getSignForPKCS7AndVIDRV2 getsignforpkcs7andvidrv2 = (getSignForPKCS7AndVIDRV2) obj;
        return Double.compare(this.onExtraCallbackWithResult, getsignforpkcs7andvidrv2.onExtraCallbackWithResult) == 0 && Double.compare(this.onExtraCallback, getsignforpkcs7andvidrv2.onExtraCallback) == 0 && Double.compare(this.onNavigationEvent, getsignforpkcs7andvidrv2.onNavigationEvent) == 0 && Double.compare(this.IAuthTabCallback, getsignforpkcs7andvidrv2.IAuthTabCallback) == 0 && Intrinsics.areEqual(this.onWarmupCompleted, getsignforpkcs7andvidrv2.onWarmupCompleted);
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.onExtraCallbackWithResult) * 31) + Double.hashCode(this.onExtraCallback)) * 31) + Double.hashCode(this.onNavigationEvent)) * 31) + Double.hashCode(this.IAuthTabCallback)) * 31) + this.onWarmupCompleted.hashCode();
    }

    public String toString() {
        return "GraniteVideoLoadData(currentTime=" + this.onExtraCallbackWithResult + ", duration=" + this.onExtraCallback + ", naturalWidth=" + this.onNavigationEvent + ", naturalHeight=" + this.IAuthTabCallback + ", orientation=" + this.onWarmupCompleted + ")";
    }

    public getSignForPKCS7AndVIDRV2(double d, double d2, double d3, double d4, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = d;
        this.onExtraCallback = d2;
        this.onNavigationEvent = d3;
        this.IAuthTabCallback = d4;
        this.onWarmupCompleted = str;
    }

    public final double onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final double onExtraCallback() {
        return this.onExtraCallback;
    }

    public final double onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public final double IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public /* synthetic */ getSignForPKCS7AndVIDRV2(double d, double d2, double d3, double d4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) == 0 ? d4 : 0.0d, (i & 16) != 0 ? "landscape" : str);
    }

    public final String onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }
}
