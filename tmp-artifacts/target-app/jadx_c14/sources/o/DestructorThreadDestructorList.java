package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.teens.Result;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DestructorThreadDestructorList {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("RESULT")
    private final Result result;

    @SerializedName("elsTimetable")
    private final List<ReactInstanceManagerExternalSyntheticLambda4> schoolInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public DestructorThreadDestructorList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 101;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof DestructorThreadDestructorList)) {
            int i3 = onWarmupCompleted + 23;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        DestructorThreadDestructorList destructorThreadDestructorList = (DestructorThreadDestructorList) obj;
        if (!Intrinsics.areEqual(this.schoolInfo, destructorThreadDestructorList.schoolInfo)) {
            return false;
        }
        if (Intrinsics.areEqual(this.result, destructorThreadDestructorList.result)) {
            return true;
        }
        int i5 = onExtraCallback + 23;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.DestructorThreadDestructorList.onWarmupCompleted
            int r2 = r1 + 13
            int r3 = r2 % 128
            o.DestructorThreadDestructorList.onExtraCallback = r3
            int r2 = r2 % r0
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L18
            java.util.List<o.ReactInstanceManagerExternalSyntheticLambda4> r2 = r6.schoolInfo
            if (r2 != 0) goto L16
            r2 = r4
            goto L1d
        L16:
            r3 = r4
            goto L28
        L18:
            java.util.List<o.ReactInstanceManagerExternalSyntheticLambda4> r2 = r6.schoolInfo
            if (r2 != 0) goto L28
            r2 = r3
        L1d:
            int r1 = r1 + 121
            int r5 = r1 % 128
            o.DestructorThreadDestructorList.onExtraCallback = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L2e
            r3 = r4
            goto L2e
        L28:
            int r0 = r2.hashCode()
            r2 = r3
            r3 = r0
        L2e:
            viva.republica.toss.network.model.teens.Result r0 = r6.result
            if (r0 == 0) goto L36
            int r2 = r0.hashCode()
        L36:
            int r3 = r3 * 31
            int r3 = r3 + r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DestructorThreadDestructorList.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ElementaryTimetableResponse(schoolInfo=" + this.schoolInfo + ", result=" + this.result + ")";
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public DestructorThreadDestructorList(@Nullable List<ReactInstanceManagerExternalSyntheticLambda4> list, @Nullable Result result) {
        this.schoolInfo = list;
        this.result = result;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DestructorThreadDestructorList(List list, Result result, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 115;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 84 / 0;
            }
            int i4 = 2 % 2;
            list = null;
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 107;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            result = null;
        }
        this(list, result);
    }

    public final List<ReactInstanceManagerExternalSyntheticLambda4> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        List<ReactInstanceManagerExternalSyntheticLambda4> list = this.schoolInfo;
        int i5 = i3 + 45;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Result IAuthTabCallback() {
        Result result;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            result = this.result;
            int i4 = 46 / 0;
        } else {
            result = this.result;
        }
        int i5 = i3 + 31;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return result;
    }
}
