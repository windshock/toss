package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactInstanceManager2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("ALL_TI_YMD")
    private final String date;

    @SerializedName("PERIO")
    private final String period;

    @SerializedName("SEM")
    private final String semester;

    @SerializedName("ITRT_CNTNT")
    private final String subjectName;

    @SerializedName("AY")
    private final String timetableYear;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ReactInstanceManager2)) {
            int i4 = onExtraCallback + 1;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ReactInstanceManager2 reactInstanceManager2 = (ReactInstanceManager2) obj;
        if (!Intrinsics.areEqual(this.period, reactInstanceManager2.period)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.subjectName, reactInstanceManager2.subjectName)) {
            int i6 = onExtraCallback + 107;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.date, reactInstanceManager2.date)) {
            return Intrinsics.areEqual(this.timetableYear, reactInstanceManager2.timetableYear) && !(Intrinsics.areEqual(this.semester, reactInstanceManager2.semester) ^ true);
        }
        int i8 = onExtraCallbackWithResult + 91;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.period.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.period.hashCode();
        String str = this.subjectName;
        int iHashCode2 = (((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.date.hashCode()) * 31) + this.timetableYear.hashCode()) * 31) + this.semester.hashCode();
        int i3 = onExtraCallback + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TimetableItem(period=" + this.period + ", subjectName=" + this.subjectName + ", date=" + this.date + ", timetableYear=" + this.timetableYear + ", semester=" + this.semester + ")";
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 17;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.period;
        int i4 = i2 + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.subjectName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.date;
        int i5 = i2 + 111;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
