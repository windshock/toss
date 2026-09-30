package o;

import im.toss.inventory_sdk.model.HairlineLogDto;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class registerGyroscope extends SensorBridgeExtension3 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final HairlineLogDto onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof registerGyroscope)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, ((registerGyroscope) obj).onExtraCallbackWithResult)) {
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onWarmupCompleted + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int i4 = onWarmupCompleted + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InventoryHairlineItem(hairlineLog=" + this.onExtraCallbackWithResult + ")";
        int i2 = onWarmupCompleted + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public registerGyroscope(@NotNull HairlineLogDto hairlineLogDto) {
        Intrinsics.checkNotNullParameter(hairlineLogDto, "");
        this.onExtraCallbackWithResult = hairlineLogDto;
    }

    public final HairlineLogDto onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 71;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        HairlineLogDto hairlineLogDto = this.onExtraCallbackWithResult;
        int i5 = i2 + 63;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return hairlineLogDto;
    }
}
