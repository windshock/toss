package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getViewManagers {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final boolean overwrite;
    private final String rrnLastSixDigits;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 17;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getViewManagers)) {
            return false;
        }
        getViewManagers getviewmanagers = (getViewManagers) obj;
        if (this.overwrite != getviewmanagers.overwrite) {
            int i4 = i2 + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.rrnLastSixDigits, getviewmanagers.rrnLastSixDigits)) {
            return true;
        }
        int i6 = onExtraCallback + 67;
        onExtraCallbackWithResult = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (Boolean.hashCode(this.overwrite) * 101) - this.rrnLastSixDigits.hashCode() : (Boolean.hashCode(this.overwrite) * 31) + this.rrnLastSixDigits.hashCode();
        int i3 = onExtraCallbackWithResult + 117;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensCardTaxDeductionRequest(overwrite=" + this.overwrite + ", rrnLastSixDigits=" + this.rrnLastSixDigits + ")";
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
