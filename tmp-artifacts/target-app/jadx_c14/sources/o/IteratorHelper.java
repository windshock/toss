package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.teens.Result;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class IteratorHelper {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("RESULT")
    private final Result result;

    @SerializedName("misTimetable")
    private final List<ReactInstanceManagerExternalSyntheticLambda4> schoolInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public IteratorHelper() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.IteratorHelper) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 125;
        o.IteratorHelper.onExtraCallbackWithResult = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r6 = (o.IteratorHelper) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.schoolInfo, r6.schoolInfo) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r6 = o.IteratorHelper.onExtraCallbackWithResult + 27;
        o.IteratorHelper.IAuthTabCallback = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if ((r6 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.result, r6.result) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.IteratorHelper.onExtraCallbackWithResult
            int r1 = r1 + 63
            int r2 = r1 % 128
            o.IteratorHelper.IAuthTabCallback = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L16
            r1 = 45
            int r1 = r1 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r6 instanceof o.IteratorHelper
            if (r1 != 0) goto L28
            int r2 = r2 + 125
            int r6 = r2 % 128
            o.IteratorHelper.onExtraCallbackWithResult = r6
            int r2 = r2 % r0
            if (r2 != 0) goto L27
            return r3
        L27:
            return r4
        L28:
            o.IteratorHelper r6 = (o.IteratorHelper) r6
            java.util.List<o.ReactInstanceManagerExternalSyntheticLambda4> r1 = r5.schoolInfo
            java.util.List<o.ReactInstanceManagerExternalSyntheticLambda4> r2 = r6.schoolInfo
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L42
            int r6 = o.IteratorHelper.onExtraCallbackWithResult
            int r6 = r6 + 27
            int r1 = r6 % 128
            o.IteratorHelper.IAuthTabCallback = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L40
            return r4
        L40:
            r6 = 0
            throw r6
        L42:
            viva.republica.toss.network.model.teens.Result r0 = r5.result
            viva.republica.toss.network.model.teens.Result r6 = r6.result
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L4d
            return r4
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IteratorHelper.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        List<ReactInstanceManagerExternalSyntheticLambda4> list = this.schoolInfo;
        int iHashCode2 = 0;
        if (list == null) {
            int i2 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        Result result = this.result;
        Object obj = null;
        if (result != null) {
            int i4 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                result.hashCode();
                obj.hashCode();
                throw null;
            }
            iHashCode2 = result.hashCode();
        }
        int i5 = (iHashCode * 31) + iHashCode2;
        int i6 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MiddleSchoolTimetableResponse(schoolInfo=" + this.schoolInfo + ", result=" + this.result + ")";
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public IteratorHelper(@Nullable List<ReactInstanceManagerExternalSyntheticLambda4> list, @Nullable Result result) {
        this.schoolInfo = list;
        this.result = result;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ IteratorHelper(List list, Result result, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 67;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            list = null;
        }
        if ((i & 2) != 0) {
            int i6 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            result = null;
        }
        this(list, result);
    }

    public final List<ReactInstanceManagerExternalSyntheticLambda4> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<ReactInstanceManagerExternalSyntheticLambda4> list = this.schoolInfo;
        int i5 = i3 + 27;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Result onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Result result = this.result;
        int i5 = i2 + 55;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return result;
    }
}
