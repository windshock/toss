package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class finishOperationBatch {
    public static final int $stable = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("oneLink")
    private final String oneLink;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 19;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof finishOperationBatch)) {
            int i4 = i2 + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.oneLink, ((finishOperationBatch) obj).oneLink)) {
            return true;
        }
        int i6 = onExtraCallback + 57;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.oneLink.hashCode();
        int i4 = onNavigationEvent + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CvsDeliveryReservationOneLink(oneLink=" + this.oneLink + ")";
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            str = this.oneLink;
            int i4 = 20 / 0;
        } else {
            str = this.oneLink;
        }
        int i5 = i3 + 119;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
