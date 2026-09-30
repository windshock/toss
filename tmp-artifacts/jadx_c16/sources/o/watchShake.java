package o;

import im.toss.features.benefit.dto.CardsV2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class watchShake extends SensorBridgeExtension3 implements SensorBridgeExtension {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final CardsV2.ListRowBannerInfo IAuthTabCallback;
    private final Integer onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof watchShake)) {
            return false;
        }
        watchShake watchshake = (watchShake) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, watchshake.IAuthTabCallback)) {
            int i3 = onWarmupCompleted + 109;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, watchshake.onExtraCallbackWithResult)) {
            return false;
        }
        int i5 = onWarmupCompleted + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r1 r3
      0x0028: PHI (r1v9 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r3v1 java.lang.Integer) = (r3v0 java.lang.Integer), (r3v5 java.lang.Integer) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        Integer num;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.IAuthTabCallback.hashCode();
            num = this.onExtraCallbackWithResult;
            int i3 = 90 / 0;
            if (num != null) {
                iHashCode2 = num.hashCode();
                int i4 = onNavigationEvent + 5;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            iHashCode = this.IAuthTabCallback.hashCode();
            num = this.onExtraCallbackWithResult;
            if (num != null) {
            }
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ListRowBannerItem(listRowBannerInfo=" + this.IAuthTabCallback + ", sectionOrder=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public watchShake(@NotNull CardsV2.ListRowBannerInfo listRowBannerInfo, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(listRowBannerInfo, "");
        this.IAuthTabCallback = listRowBannerInfo;
        this.onExtraCallbackWithResult = num;
    }

    public final CardsV2.ListRowBannerInfo onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        CardsV2.ListRowBannerInfo listRowBannerInfo = this.IAuthTabCallback;
        int i5 = i2 + 115;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return listRowBannerInfo;
    }

    public final Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }
}
