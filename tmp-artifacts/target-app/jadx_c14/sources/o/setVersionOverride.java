package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setVersionOverride {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("cardCodes")
    private final List<Integer> cardCodes;

    /* JADX WARN: Illegal instructions before constructor call */
    public setVersionOverride() {
        List list = null;
        this(list, 1, list);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 15;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof setVersionOverride))) {
            return Intrinsics.areEqual(this.cardCodes, ((setVersionOverride) obj).cardCodes);
        }
        int i5 = i2 + 37;
        IAuthTabCallback = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        List<Integer> list = this.cardCodes;
        if (list != null) {
            return list.hashCode();
        }
        int i2 = IAuthTabCallback;
        int i3 = i2 + 3;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardNotificationTermsReq(cardCodes=" + this.cardCodes + ")";
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public setVersionOverride(@Nullable List<Integer> list) {
        this.cardCodes = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setVersionOverride(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 63;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 83;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            list = null;
        }
        this(list);
    }
}
