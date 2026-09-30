package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getEagerInitModuleNames {
    public static final int $stable = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("bottom")
    private final Integer bottom;

    @SerializedName("left")
    private final Integer left;

    @SerializedName("right")
    private final Integer right;

    @SerializedName("top")
    private final Integer top;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEagerInitModuleNames)) {
            return false;
        }
        getEagerInitModuleNames geteagerinitmodulenames = (getEagerInitModuleNames) obj;
        if (!Intrinsics.areEqual(this.top, geteagerinitmodulenames.top)) {
            int i4 = onExtraCallback + 119;
            onNavigationEvent = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.left, geteagerinitmodulenames.left)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.right, geteagerinitmodulenames.right)) {
            int i5 = onNavigationEvent + 9;
            onExtraCallback = i5 % 128;
            return !(i5 % 2 != 0);
        }
        if (Intrinsics.areEqual(this.bottom, geteagerinitmodulenames.bottom)) {
            return true;
        }
        int i6 = onNavigationEvent + 73;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 22 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.top;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.left;
        if (num2 == null) {
            int i4 = onNavigationEvent + 69;
            onExtraCallback = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = num2.hashCode();
        }
        Integer num3 = this.right;
        if (num3 == null) {
            int i5 = onNavigationEvent + 29;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num3.hashCode();
        }
        Integer num4 = this.bottom;
        return (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Margin(top=" + this.top + ", left=" + this.left + ", right=" + this.right + ", bottom=" + this.bottom + ")";
        int i2 = onExtraCallback + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
