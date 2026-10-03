package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.teens.Result;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DoNotStrip {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("RESULT")
    private final Result result;

    @SerializedName("spsTimetable")
    private final List<ReactInstanceManagerExternalSyntheticLambda4> schoolInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public DoNotStrip() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoNotStrip)) {
            return false;
        }
        DoNotStrip doNotStrip = (DoNotStrip) obj;
        if (!Intrinsics.areEqual(this.schoolInfo, doNotStrip.schoolInfo)) {
            int i3 = onExtraCallbackWithResult + 123;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.result, doNotStrip.result)) {
            return true;
        }
        int i5 = onExtraCallbackWithResult + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        List<ReactInstanceManagerExternalSyntheticLambda4> list = this.schoolInfo;
        int iHashCode2 = 0;
        if (list == null) {
            int i2 = onExtraCallbackWithResult + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        Result result = this.result;
        if (result != null) {
            int i4 = onExtraCallbackWithResult + 29;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                result.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode2 = result.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SpecialSchoolTimetableResponse(schoolInfo=" + this.schoolInfo + ", result=" + this.result + ")";
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public DoNotStrip(@Nullable List<ReactInstanceManagerExternalSyntheticLambda4> list, @Nullable Result result) {
        this.schoolInfo = list;
        this.result = result;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DoNotStrip(List list, Result result, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 65 / 0;
            }
            list = null;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 123;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
            result = null;
        }
        this(list, result);
    }

    public final List<ReactInstanceManagerExternalSyntheticLambda4> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.schoolInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Result IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Result result = this.result;
        int i5 = i3 + 21;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return result;
    }
}
