package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.teens.Result;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class HybridClassBase {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("RESULT")
    private final Result result;

    @SerializedName("hisTimetable")
    private final List<ReactInstanceManagerExternalSyntheticLambda4> schoolInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public HybridClassBase() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HybridClassBase)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.schoolInfo, ((HybridClassBase) obj).schoolInfo)) {
            int i2 = onWarmupCompleted + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.result, r6.result))) {
            return true;
        }
        int i4 = onWarmupCompleted + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        List<ReactInstanceManagerExternalSyntheticLambda4> list = this.schoolInfo;
        if (list == null) {
            int i2 = onWarmupCompleted + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        Result result = this.result;
        int iHashCode2 = (iHashCode * 31) + (result != null ? result.hashCode() : 0);
        int i4 = onExtraCallback + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HighSchoolTimetableResponse(schoolInfo=" + this.schoolInfo + ", result=" + this.result + ")";
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public HybridClassBase(@Nullable List<ReactInstanceManagerExternalSyntheticLambda4> list, @Nullable Result result) {
        this.schoolInfo = list;
        this.result = result;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HybridClassBase(List list, Result result, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            list = null;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 77;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            result = null;
        }
        this(list, result);
    }

    public final List<ReactInstanceManagerExternalSyntheticLambda4> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List<ReactInstanceManagerExternalSyntheticLambda4> list = this.schoolInfo;
        int i5 = i2 + 121;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Result onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Result result = this.result;
        int i5 = i3 + 125;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return result;
    }
}
