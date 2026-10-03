package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class readOrientationFromTIFF {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("connectPrerequisiteStatus")
    private final TiffUtil connectPrerequisiteStatus;

    @SerializedName("connectTo")
    private final get2BytesAsInt connectTo;

    @SerializedName("connected")
    private final boolean connected;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readOrientationFromTIFF)) {
            int i2 = IAuthTabCallback + 5;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        readOrientationFromTIFF readorientationfromtiff = (readOrientationFromTIFF) obj;
        if (this.connectTo != readorientationfromtiff.connectTo) {
            int i3 = IAuthTabCallback + 65;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.connected != readorientationfromtiff.connected) {
            int i5 = IAuthTabCallback + 55;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.connectPrerequisiteStatus, readorientationfromtiff.connectPrerequisiteStatus)) {
            return false;
        }
        int i7 = IAuthTabCallback + 7;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.connectTo.hashCode();
            Boolean.hashCode(this.connected);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode2 = this.connectTo.hashCode();
        int iHashCode3 = Boolean.hashCode(this.connected);
        TiffUtil tiffUtil = this.connectPrerequisiteStatus;
        if (tiffUtil == null) {
            int i3 = IAuthTabCallback + 3;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = tiffUtil.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossOneUserConnectionStatus(connectTo=" + this.connectTo + ", connected=" + this.connected + ", connectPrerequisiteStatus=" + this.connectPrerequisiteStatus + ")";
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public readOrientationFromTIFF(@NotNull get2BytesAsInt get2bytesasint, boolean z, @Nullable TiffUtil tiffUtil) {
        Intrinsics.checkNotNullParameter(get2bytesasint, "");
        this.connectTo = get2bytesasint;
        this.connected = z;
        this.connectPrerequisiteStatus = tiffUtil;
    }

    public final get2BytesAsInt onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        get2BytesAsInt get2bytesasint = this.connectTo;
        int i5 = i3 + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return get2bytesasint;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.connected;
        int i5 = i3 + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final TiffUtil IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        TiffUtil tiffUtil = this.connectPrerequisiteStatus;
        int i5 = i2 + 65;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return tiffUtil;
    }
}
