package o;

import im.toss.features.benefit.dto.AdsInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getDeviceBaseInfo extends SensorBridgeExtension3 implements SensorBridgeExtension {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final AdsInfo onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDeviceBaseInfo)) {
            int i2 = onWarmupCompleted + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.onExtraCallbackWithResult, ((getDeviceBaseInfo) obj).onExtraCallbackWithResult))) {
            return true;
        }
        int i4 = onWarmupCompleted + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ThumbnailBannerPlayerItem(videoAdsInfo=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getDeviceBaseInfo(@NotNull AdsInfo adsInfo) {
        Intrinsics.checkNotNullParameter(adsInfo, "");
        this.onExtraCallbackWithResult = adsInfo;
    }

    public final AdsInfo onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AdsInfo adsInfo = this.onExtraCallbackWithResult;
        int i4 = i3 + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return adsInfo;
    }
}
