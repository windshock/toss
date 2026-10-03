package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdComponentView {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("bankCodes")
    private final List<Integer> bankCodes;

    /* JADX WARN: Illegal instructions before constructor call */
    public AdComponentView() {
        List list = null;
        this(list, 1, list);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdComponentView)) {
            return false;
        }
        if (Intrinsics.areEqual(this.bankCodes, ((AdComponentView) obj).bankCodes)) {
            return true;
        }
        int i3 = onExtraCallback + 47;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        List<Integer> list = this.bankCodes;
        if (list == null) {
            return 0;
        }
        int iHashCode = list.hashCode();
        int i4 = onExtraCallback + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountNotificationReservationReq(bankCodes=" + this.bankCodes + ")";
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public AdComponentView(@Nullable List<Integer> list) {
        this.bankCodes = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdComponentView(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 37;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 95;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            list = null;
        }
        this(list);
    }
}
