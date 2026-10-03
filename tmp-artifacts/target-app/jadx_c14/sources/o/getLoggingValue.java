package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getLoggingValue {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("amount")
    private final long amount;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof getLoggingValue) {
                return this.amount == ((getLoggingValue) obj).amount;
            }
            int i2 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Long.hashCode(this.amount);
            obj.hashCode();
            throw null;
        }
        int iHashCode = Long.hashCode(this.amount);
        int i3 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensCardIssuanceFeeResponse(amount=" + this.amount + ")";
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        long j = this.amount;
        int i5 = i2 + 115;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return j;
    }
}
