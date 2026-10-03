package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeDeviceEventManagerSpec {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("docIdList")
    private final List<Long> docIdList;

    /* JADX WARN: Illegal instructions before constructor call */
    public NativeDeviceEventManagerSpec() {
        List list = null;
        this(list, 1, list);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 85;
            onNavigationEvent = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof NativeDeviceEventManagerSpec)) {
            return false;
        }
        if (Intrinsics.areEqual(this.docIdList, ((NativeDeviceEventManagerSpec) obj).docIdList)) {
            return true;
        }
        int i3 = onNavigationEvent + 67;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 121;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 56 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List<Long> list = this.docIdList;
        if (list == null) {
            return 0;
        }
        int iHashCode = list.hashCode();
        int i4 = IAuthTabCallback + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletIssueStatusReq(docIdList=" + this.docIdList + ")";
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public NativeDeviceEventManagerSpec(@Nullable List<Long> list) {
        this.docIdList = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeDeviceEventManagerSpec(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 5;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 33;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            list = null;
        }
        this(list);
    }
}
