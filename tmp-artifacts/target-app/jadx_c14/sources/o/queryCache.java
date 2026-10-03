package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class queryCache {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @SerializedName("henemBox")
    private final swapLeftAndRightInRTL henemBox;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof queryCache)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.henemBox, ((queryCache) obj).henemBox)) {
            int i4 = onExtraCallback + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = onExtraCallback + 15;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.henemBox.hashCode();
        int i4 = onExtraCallback + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HenemBoxResponse(henemBox=" + this.henemBox + ")";
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final swapLeftAndRightInRTL onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        swapLeftAndRightInRTL swapleftandrightinrtl = this.henemBox;
        int i5 = i3 + 97;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return swapleftandrightinrtl;
    }
}
