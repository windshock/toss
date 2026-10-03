package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactApplication {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("count")
    private final int count;

    @SerializedName("extension")
    private final String extension;

    @SerializedName("yearMonth")
    private final String yearMonth;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactApplication)) {
            int i2 = onNavigationEvent + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ReactApplication reactApplication = (ReactApplication) obj;
        if (this.count != reactApplication.count) {
            return false;
        }
        if (!Intrinsics.areEqual(this.yearMonth, reactApplication.yearMonth)) {
            int i4 = onNavigationEvent + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.extension, reactApplication.extension)) {
            return true;
        }
        int i6 = IAuthTabCallback + 53;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((Integer.hashCode(this.count) << 60) % this.yearMonth.hashCode()) % 31) >>> this.extension.hashCode() : (((Integer.hashCode(this.count) * 31) + this.yearMonth.hashCode()) * 31) + this.extension.hashCode();
        int i3 = IAuthTabCallback + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensSchoolMealImageReq(count=" + this.count + ", yearMonth=" + this.yearMonth + ", extension=" + this.extension + ")";
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ReactApplication(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.count = i;
        this.yearMonth = str;
        this.extension = str2;
    }
}
