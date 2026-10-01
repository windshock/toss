package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getCurrentGrayscaleState {
    public static final int $stable = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("navbar")
    private final getCurrentVoiceOverState navbar;

    @SerializedName("skeleton")
    private final getCurrentReduceMotionState skeleton;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 109;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 77;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof getCurrentGrayscaleState)) {
            int i7 = i2 + 73;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        getCurrentGrayscaleState getcurrentgrayscalestate = (getCurrentGrayscaleState) obj;
        if (Intrinsics.areEqual(this.skeleton, getcurrentgrayscalestate.skeleton)) {
            return Intrinsics.areEqual(this.navbar, getcurrentgrayscalestate.navbar);
        }
        int i9 = onNavigationEvent + 123;
        int i10 = i9 % 128;
        onExtraCallbackWithResult = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 35;
        onNavigationEvent = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 95 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getCurrentReduceMotionState getcurrentreducemotionstate = this.skeleton;
        int iHashCode = 0;
        int iHashCode2 = getcurrentreducemotionstate == null ? 0 : getcurrentreducemotionstate.hashCode();
        getCurrentVoiceOverState getcurrentvoiceoverstate = this.navbar;
        if (getcurrentvoiceoverstate != null) {
            int i4 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = getcurrentvoiceoverstate.hashCode();
            int i6 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LabPageInfo(skeleton=" + this.skeleton + ", navbar=" + this.navbar + ")";
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
