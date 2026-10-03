package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactInstanceManagerExternalSyntheticLambda2 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("date")
    private final String date;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ReactInstanceManagerExternalSyntheticLambda2)) {
            return false;
        }
        if (Intrinsics.areEqual(this.date, ((ReactInstanceManagerExternalSyntheticLambda2) obj).date)) {
            return true;
        }
        int i4 = onExtraCallback + 67;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 47;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        String str = this.date;
        if (str != null) {
            return str.hashCode();
        }
        int i2 = onExtraCallback;
        int i3 = i2 + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 35;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensWorkDaysCalculationResponse(date=" + this.date + ")";
        int i2 = onExtraCallback + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            str = this.date;
            int i4 = 35 / 0;
        } else {
            str = this.date;
        }
        int i5 = i3 + 71;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
