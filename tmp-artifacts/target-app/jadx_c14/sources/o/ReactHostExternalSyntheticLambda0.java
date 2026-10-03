package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactHostExternalSyntheticLambda0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("totalBalance")
    private final long totalBalance;

    @SerializedName("name")
    private final ReactHostExternalSyntheticLambda1 type;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ReactHostExternalSyntheticLambda0)) {
            return false;
        }
        ReactHostExternalSyntheticLambda0 reactHostExternalSyntheticLambda0 = (ReactHostExternalSyntheticLambda0) obj;
        if (this.type != reactHostExternalSyntheticLambda0.type) {
            int i4 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i4 % 128;
            return i4 % 2 != 0;
        }
        if (this.totalBalance == reactHostExternalSyntheticLambda0.totalBalance) {
            return true;
        }
        int i5 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ReactHostExternalSyntheticLambda1 reactHostExternalSyntheticLambda1 = this.type;
        if (reactHostExternalSyntheticLambda1 == null) {
            int i4 = i3 + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = reactHostExternalSyntheticLambda1.hashCode();
        }
        return (iHashCode * 31) + Long.hashCode(this.totalBalance);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensTossMoneyAccount(type=" + this.type + ", totalBalance=" + this.totalBalance + ")";
        int i2 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final ReactHostExternalSyntheticLambda1 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.type;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = this.totalBalance;
        int i5 = i2 + 33;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
